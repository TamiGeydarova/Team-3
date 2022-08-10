package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TinaSteps extends GeneralSteps {


    private TinaHomePage homePage = new TinaHomePage(driver);
    private TinaCheckoutPage checkoutPage = new TinaCheckoutPage(driver);

    private TinaAuthorizationPage loginPage = new TinaAuthorizationPage(driver);

    private TinaProductPages productPage = new TinaProductPages(driver);


    @Given("^I am on shop page$")
    public void iAmOnShopPage(){
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }

    //Test Case 10

    @When("^I add one item in Shopping Cart$")
    public void iAddOneItemInShoppingCart(){
        homePage.clickOnCartButtonInItemCard();
    }

    @Then("^I click to the Checkout link$")
    public void iClickToTheCheckoutLink(){
        homePage.clickOnCheckoutLink();
    }

    @Then("^I am on Checkout page$")
    public void assertIAmOnCheckoutPage(){
        assertEquals("http://www.demoshop24.com/index.php?route=checkout/checkout",driver.getCurrentUrl());
    }

    @And("^I input e-mail and password:$")
    public void iInputEmailAndPassword(Map<String,String> accountValues){
        checkoutPage.getEmailFieldInCheckoutPage().clear();
        checkoutPage.getEmailFieldInCheckoutPage().sendKeys(accountValues.get("email"));
        checkoutPage.getPasswordFieldInCheckoutPage().clear();
        checkoutPage.getPasswordFieldInCheckoutPage().sendKeys(accountValues.get("password"));
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton(){
        checkoutPage.clickOnLogginButtonInCheckoutPage();
    }

    @And("^I check Step 2: Billing Details block is available and opened$")
    public void assertBillingDetailesBlockIsEvaible(){
        assertTrue(checkoutPage.getStepTwoBlock().isDisplayed());

    }

    // Test Case 29

    @When("^I go to authorization page$")
    public void iGoToAuthorizationPage(){
        homePage.clickOnMyAccountLink();
        homePage.clickOnLoginLink();
        assertEquals("http://www.demoshop24.com/index.php?route=account/login",driver.getCurrentUrl());
    }

    @Then("^I input e-mail and password in authorization page:$")
    public void logInAtLoginPage(Map<String,String> values){
        loginPage.getEmailFieldInLoginPage().clear();
        loginPage.getEmailFieldInLoginPage().sendKeys(values.get("email"));
        loginPage.getPasswordFieldInLoginPage().clear();
        loginPage.getPasswordFieldInLoginPage().sendKeys(values.get("password"));
    }

    @And("^I click on Login button in authorization page$")
    public void clickLoginButtonOnLoginPage(){
        loginPage.clickOnLoginButtonInLoginPage();
    }

//    @Then("^I hover over MP3 Players category$")
////    public void testMethod()throws Exception{
////        WebElement main = driver.findElement(By.xpath("//*[@href='http://www.demoshop24.com/index.php?route=product/category&path=34' and @class = 'dropdown-toggle']"));
////        hover.moveToElement(main);
////        Thread.sleep(2000);
////        WebElement show = driver.findElement(By.xpath("//*[@href='http://www.demoshop24.com/index.php?route=product/category&path=34' and @class = 'see-all']"));
////        hover.moveToElement(show);
////        Thread.sleep(2000);
////        hover.click().build().perform();
////        Thread.sleep(2000);
////    }
//
//
//
//    public void iHoverOverPlayersCategory()throws Exception{
//
//        homePage.hoverOverPlayersButton();
//    //    Thread.sleep(10000);
//    }
//
//    @And("^I click on Show all MP3 Players$")
//    public void iClickShowAllPlayers()throws Exception{
//        homePage.clickShowAllPlayersLink();
//    //    Thread.sleep(3000);
//    }

    @Then("^I am on the MP3 Players list page$")
    public void iAmOnProductListPage(){
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=34");

    }

    @And("^I press heart icon on iPod Classic$")
    public void iClickHeard()throws Exception{
        productPage.clickOnHeartButton1();
        Thread.sleep(2000);
    }

    @And("I see message \"([^\"]*)\"")
    public void iSeeSuccessWishMessage(String successMessage){
        assertEquals(successMessage, productPage.getSuccessAlert());
    }

    @And("^Wishlist icon is updated accordingly$")
    public void wishlistIconUpdated(){
        assertEquals("Wish List (1)", homePage.showWishListTitle());

    }


}

package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.*;

import java.util.Map;

import static org.junit.Assert.*;

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

    @Then("^I am on the MP3 Players list page$")
    public void iAmOnProductListPage(){
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=34");

    }

    @And("^I press heart icon on iPod Classic$")
    public void iClickHeard()throws Exception{
        productPage.clickOnHeartButton1();
        Thread.sleep(2000);
    }

    @And("I see message for wish list \"([^\"]*)\"")
    public void iSeeSuccessWishMessage(String successMessage){
        assertEquals(successMessage, productPage.getSuccessAlert(productPage.getLinkForIPodClassicInAlert(), productPage.getLinkForWishListInAlert()));
    }

    @And("^Wishlist icon is updated accordingly$")
    public void wishlistIconUpdated(){
        assertEquals("Wish List (1)", homePage.showWishListTitle());

    }

    @Then("^I click on two arrow icon on iPod Classic$")
    public void iClickOnCompareButton()throws Exception{
        productPage.clickOnCompareButton1();
        Thread.sleep(2000);
    }

    @Then("I see message for comparison \"([^\"]*)\"")
    public void iSeeSuccessCompareMessage(String successMessage){
        assertEquals(successMessage, productPage.getSuccessAlert(productPage.getLinkForIPodClassicInAlert(), productPage.getCompareLinkInAlert()));
    }

    @And("^product comparison text is clickable$")
    public void assertCompareLintClickable(){
        assertTrue(productPage.getCompareLinkInAlert().isEnabled());
    }

    @Then("^I click on cart icon on iPod Classic$")
    public void iClickOnCardButton1()throws Exception{
        productPage.clickOnCardButton1();
        Thread.sleep(2000);
    }

    @Then("I see message for cart \"([^\"]*)\"")
    public void iSeeSuccessCartMessage(String successMessage){
        assertEquals(successMessage, productPage.getSuccessAlert(productPage.getLinkForIPodClassicInAlert(), productPage.getCartLinkInAlert()));
    }

    @And("^shopping cart popup item count changes$")
    public void assertCartButtonPopupText(){
        assertEquals("1 item(s) - $122.00", productPage.getCartMainButton().getText());

    }
}

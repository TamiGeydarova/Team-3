package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import pageObjects.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TinaSteps extends GeneralSteps {

    static HomePage homePage;
    static CheckoutPage checkoutPage;

    @Given("^I am on shop page$")
    public void iAmOnShopPage(){
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }

    @When("^I add one item in Shopping Cart$")
    public void iAddOneItemInShoppingCart(){
        //homePage.clickOnCartButtonInItemCard();
        driver.findElement(By.xpath("//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")).click();

    }

    @Then("^I click to the Checkout link$")
    public void iClickToTheCheckoutLink(){
        //homePage.clickOnCheckoutLink();
        driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")).click();
    }

    @Then("^I am on Checkout page$")
    public void assertIAmOnCheckoutPage(){
        assertEquals("http://www.demoshop24.com/index.php?route=checkout/checkout",driver.getCurrentUrl());
    }

    @And("^I input e-mail and password:$")
    public void iInputEmailAndPassword(Map<String,String> accountValues){
        //checkoutPage.getEmailFieldInCheckoutPage().clear();
        //checkoutPage.getEmailFieldInCheckoutPage().sendKeys(accountValues.get("email"));

        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(accountValues.get("email"));
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys(accountValues.get("password"));
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton(){
        driver.findElement(By.id("button-login")).click();
    }

    @And("^I check Step 2: Billing Details block is available and opened$")
    public void assertBillingDetailesBlockIsEvaible(){
        assertTrue(driver.findElement(By.xpath("//*[@href='#collapse-payment-address']")).isDisplayed());
    }
}

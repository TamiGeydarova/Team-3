package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TinaSteps extends GeneralSteps {

    private TinaHomePage homePage = new TinaHomePage(driver);
    private TinaCheckoutPage checkoutPage = new TinaCheckoutPage(driver);

    @Given("^I am on shop page$")
    public void iAmOnShopPage(){
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }

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
}

package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ResultPage;
import pageObjects.CheckoutPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends GeneralSteps {

    private CheckoutPage checkoutPage = new CheckoutPage(driver);
    private MainPage mainPage = new MainPage(driver);
    private ResultPage resultPage = new ResultPage(driver);
    private LoginPage loginPage = new LoginPage(driver);

    @Before
    public void openBrowser() {
        driver.openBrowser();
    }


    @After
    public void closeBrowser() { driver.close();}

    @Given("^I log in$")
    public void iLogIn() {
        checkoutPage.logIn();
        assertEquals("http://www.demoshop24.com/index.php?route=account/account", driver.getCurrentUrl());
    }

    @Given("^I add to cart in stock item$")
    public void iAddToCartInStockItem() {
        checkoutPage.addInStockItem();
    }

    @Given("^I go to checkout$")
    public void iGoToCheckout() {
        checkoutPage.goToCheckout();
        assertEquals("http://www.demoshop24.com/index.php?route=checkout/checkout", driver.getCurrentUrl());
        assertEquals("true", driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).getAttribute("aria-expanded"));
    }

    @When("^I choose to add new address$")
    public void iChooseToAddANewAddress() {
        checkoutPage.clickUseNewAddress();
    }

    @When("^I fill the add new address fields$")
    public void iFillAddNewAddressFields() {
        checkoutPage.fillAddNewAddressFields("Name", "Surname",
                "Address", "City", "Latvia", "Rīga");
    }

    @Then("^I proceed to delivery details step$")
    public void iProceedToDeliveryDetailsStep() throws InterruptedException {
        checkoutPage.paymentAddressClickContinue();
        Thread.sleep(1000);
        assertEquals("false", driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).getAttribute("aria-expanded"));
        assertEquals("true", driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")).getAttribute("aria-expanded"));
    }

}
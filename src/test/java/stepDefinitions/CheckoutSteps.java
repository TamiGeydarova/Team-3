package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CheckoutPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends GeneralSteps {

    private CheckoutPage checkoutPage = new CheckoutPage(driver);

    String productName;
    String productModel;
    String productQuantity;
    String productUnitPrice;
    String cartTotal;

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
        assertEquals("true", checkoutPage.billingDetailsAccordion.getAttribute("aria-expanded"));
    }

    @When("^I choose to add new address$")
    public void iChooseToAddANewAddress() {
        checkoutPage.clickUseNewBillingAddress();
    }

    @When("^I fill the add new address fields$")
    public void iFillAddNewAddressFields() {
        checkoutPage.fillAddressBillingNameField("Name");
        checkoutPage.fillAddressBillingSurnameField("Surname");
        checkoutPage.fillAddressBillingAddressField("Adrese");
        checkoutPage.fillAddressBillingCityField("Rīga");
        checkoutPage.fillAddressBillingCountryField("Latvia");
        checkoutPage.fillAddressBillingRegionField("Rīga");
    }

    @Then("^I proceed to delivery details step$")
    public void iProceedToDeliveryDetailsStep() throws InterruptedException {
        checkoutPage.billingAddressClickContinue();
        Thread.sleep(1000);
        assertEquals("false", checkoutPage.billingDetailsAccordion.getAttribute("aria-expanded"));
        assertEquals("true", checkoutPage.deliveryDetailsAccordion.getAttribute("aria-expanded"));
    }

    @When("^I choose an existing billing address$")
    public void iChooseAnExistingBillingAddress() {
        checkoutPage.chooseAnExistingBillingAddress("Test User, Test street, City, Rīga, Latvia");
    }

    @When("^I choose an existing delivery address$")
    public void iChooseAnExistingDeliveryAddress() {
        checkoutPage.chooseAnExistingDeliveryAddress("Test User, Test street, City, Rīga, Latvia");
    }

    @When("^I choose to add new delivery address$")
    public void iChooseToAddANewDeliveryAddress() {
        checkoutPage.clickUseNewDeliveryAddress();
    }

    @When("^I fill the add new delivery address fields$")
    public void iFillAddNewDeliveryAddressFields() {
        checkoutPage.fillAddressDeliveryNameField("Name");
        checkoutPage.fillAddressDeliverySurnameField("Surname");
        checkoutPage.fillAddressDeliveryAddressField("Adrese");
        checkoutPage.fillAddressDeliveryCityField("Rīga");
        checkoutPage.fillAddressDeliveryCountryField("Latvia");
        checkoutPage.fillAddressDeliveryRegionField("Rīga");
    }

    @Then("^I proceed to delivery method step$")
    public void iProceedToDeliveryMethodStep() throws InterruptedException {
        checkoutPage.shippingAddressClickContinue();
        Thread.sleep(1000);
        assertEquals("true", checkoutPage.deliveryMethodAccordion.getAttribute("aria-expanded"));
        assertEquals("false", checkoutPage.deliveryDetailsAccordion.getAttribute("aria-expanded"));
    }

    @Given("^I go to the cart$")
    public void iGoToTheCart(){
        checkoutPage.openCart();
        productName = checkoutPage.productName();
        productModel = checkoutPage.productModel();
        productQuantity = checkoutPage.productQuantity();
        productUnitPrice = checkoutPage.productUnitPrice();
        cartTotal = checkoutPage.cartTotal();
    }

    @When("^I choose a payment method$")
    public void iChooseAPaymentMethod() {
        checkoutPage.choosePaymentMethod();
    }

    @When("^I proceed to payment method$")
    public void iProceedToPaymentMethod() throws InterruptedException {
        checkoutPage.continueToPaymentMethod();
        Thread.sleep(1000);
        assertEquals("false", checkoutPage.deliveryMethodAccordion.getAttribute("aria-expanded"));
        assertEquals("true", checkoutPage.paymentMethodAccordion.getAttribute("aria-expanded"));

    }

    @When("^I proceed to confirm order$")
    public void iProceedToConfirmOrder() throws InterruptedException {
        checkoutPage.continueToConfirmOrder();
    }

    @When("^I agree to terms and conditions$")
    public void iAgreeToTermsAndConditions() {
        checkoutPage.acceptTermsAndConditions();
    }
    @Then("^I check order summary$")
    public void iCheckOrderSummary(){
        assertEquals(productName, checkoutPage.productNameInCheckout());
        assertEquals(productModel, checkoutPage.productModelInCheckout());
        assertEquals(productQuantity, checkoutPage.productQuantityInCheckout());
        assertEquals(productUnitPrice, checkoutPage.productUnitPriceInCheckout());
        assertEquals(cartTotal, checkoutPage.cartTotalInCheckout());
    }

    @When("^I enter card details$")
    public void iEnterCardDetails() {
        checkoutPage.nameOnCard.sendKeys("Test user");
        checkoutPage.creditCardNumber.sendKeys("4111111111111111");
        Select drpExpMonth  = new Select(checkoutPage.expMonth);
        drpExpMonth.selectByVisibleText("12");
        Select drpExpYear  = new Select(checkoutPage.expYear);
        drpExpYear.selectByVisibleText("2023");
        checkoutPage.cardVerificationNumber.sendKeys("111");
    }

    @Then("^I confirm order$")
    public void iConfirmOrder() {
        checkoutPage.confirmOrder();
    }

    @Then("I see error message")
    public void iSeeErrorMessage() {
        assertTrue(checkoutPage.termsAndConditionsAlert.isDisplayed());
    }
}
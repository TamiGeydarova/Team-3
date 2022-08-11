package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends Page {

    private LoginPage loginPage = new LoginPage(driver);

    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
    public WebElement billingDetailsAccordion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[3]/div[1]/h4/a")
    public WebElement deliveryDetailsAccordion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[4]/div[1]/h4/a")
    public WebElement deliveryMethodAccordion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[5]/div[1]/h4/a")
    public WebElement paymentMethodAccordion;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]/span")
    public WebElement productInStockAddToCart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
    public WebElement productName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[3]")
    public WebElement productModel;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
    public WebElement productQuantity;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
    public WebElement productUnitPrice;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]")
    public WebElement cartTotal;
    @FindBy(how = How.ID, using = "input-payment-firstname")
    public WebElement nameField;
    @FindBy(how = How.ID, using = "input-payment-lastname")
    public WebElement surnameField;
    @FindBy(how = How.ID, using = "input-payment-address-1")
    public WebElement addressField;
    @FindBy(how = How.ID, using = "input-payment-city")
    public WebElement cityField;
    @FindBy(how = How.ID, using = "input-payment-country")
    public WebElement countryField;
    @FindBy(how = How.ID, using = "input-payment-zone")
    public WebElement regionField;
    @FindBy(how = How.ID, using = "input-shipping-firstname")
    public WebElement deliveryNameField;
    @FindBy(how = How.ID, using = "input-shipping-lastname")
    public WebElement deliverySurnameField;
    @FindBy(how = How.ID, using = "input-shipping-address-1")
    public WebElement deliveryAddressField;
    @FindBy(how = How.ID, using = "input-shipping-city")
    public WebElement deliveryCityField;
    @FindBy(how = How.ID, using = "input-shipping-country")
    public WebElement deliveryCountryField;
    @FindBy(how = How.ID, using = "input-shipping-zone")
    public WebElement deliveryRegionField;
    @FindBy(how = How.ID, using = "button-payment-address")
    public WebElement paymentAddressContinueBtn;
    @FindBy(how = How.ID, using = "button-shipping-address")
    public WebElement shippingAddressContinueBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"payment-existing\"]/select")
    public WebElement existingBillingAddress;
    @FindBy(how = How.XPATH, using = "//*[@id=\"shipping-existing\"]/select")
    public WebElement existingDeliveryAddress;
    @FindBy(how = How.CLASS_NAME, using = "fa-share")
    public WebElement checkoutBtn;
    @FindBy(how = How.CLASS_NAME, using = "fa-shopping-cart")
    public WebElement openCartBtn;
    @FindBy(how = How.XPATH, using = "//*[@value='new']")
    public WebElement useNewBillingAddress;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-shipping-address\"]/div/form/div[3]/label/input")
    public WebElement useNewDeliveryAddress;
    @FindBy(how = How.ID, using = "name_on_card")
    public WebElement nameOnCard;
    @FindBy(how = How.ID, using = "usaepay_cc_number")
    public WebElement creditCardNumber;
    @FindBy(how = How.ID, using = "usaepay_expiration")
    public WebElement expMonth;
    @FindBy(how = How.ID, using = "usaepay_expiration_yr")
    public WebElement expYear;
    @FindBy(how = How.ID, using = "usaepay_cc_cid")
    public WebElement cardVerificationNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-payment-method\"]/div[2]/div[2]/div/input[1]")
    public WebElement agreeToTerms;
    @FindBy(how = How.ID, using = "button-payment-method")
    public WebElement continueToConfirmOrderBtn;
    @FindBy(how = How.ID, using = "button-confirm")
    public WebElement confirmOrderBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[1]/a")
    public WebElement productNameInCheckout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[2]")
    public WebElement productModelInCheckout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[3]")
    public WebElement productQuantityInCheckout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[4]")
    public WebElement productUnitPriceInCheckout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[5]")
    public WebElement totalInCheckout;
    @FindBy(how = How.ID, using = "button-shipping-method")
    public WebElement continueToPaymentMethodBtn;
    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement termsAndConditionsAlert;
    @FindBy(how = How.XPATH, using = "//*[@id=\"collapse-payment-method\"]/div/div[2]/label/input")
    public WebElement choosePaymentMethod;


    public CheckoutPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void logIn() {
        driver.openWebPage("/index.php?route=account/login");
        loginPage.loginInto("karlinex98@gmail.com", "Asdf1234.");
        loginPage.clickSubmit();
    }

    public void addInStockItem() {
        driver.openWebPage("index.php?route=product/category&path=25_28");
        productInStockAddToCart.click();
    }

    public void openCart() { openCartBtn.click(); }

    public String productName() {
        String name = productName.getText();
        return name;
    }

    public String productModel() {
        String model = productModel.getText();
        return model;
    }

    public String productQuantity() {
        String qnt = productQuantity.getAttribute("value");
        return qnt;
    }

    public String productUnitPrice() {
        String unitPrice = productUnitPrice.getText();
        return unitPrice;
    }

    public String cartTotal() {
        String total = cartTotal.getText();
        return total;
    }

    public String productNameInCheckout() {
        String name = productNameInCheckout.getText();
        return name;
    }

    public String productModelInCheckout() {
        String model = productModelInCheckout.getText();
        return model;
    }

    public String productQuantityInCheckout() {
        String qnt = productQuantityInCheckout.getText();
        return qnt;
    }

    public String productUnitPriceInCheckout() {
        String unitPrice = productUnitPriceInCheckout.getText();
        return unitPrice;
    }

    public String cartTotalInCheckout() {
        String total = totalInCheckout.getText();
        return total;
    }

    public void goToCheckout() { checkoutBtn.click(); }


    public void clickUseNewBillingAddress() {
        useNewBillingAddress.click();
    }

    public void clickUseNewDeliveryAddress() {
        useNewDeliveryAddress.click();
    }


    public void fillAddressBillingNameField(String name) {
        nameField.sendKeys(name);
    }

    public void fillAddressBillingSurnameField(String surname) {
        surnameField.sendKeys(surname);
    }

    public void fillAddressBillingAddressField(String address) {
        addressField.sendKeys(address);
    }

    public void fillAddressBillingCityField(String city) {
        cityField.sendKeys(city);
    }

    public void fillAddressBillingCountryField(String country) {
        Select drpcountry = new Select(countryField);
        drpcountry.selectByVisibleText(country);
    }

    public void fillAddressBillingRegionField(String region) {
        Select drpregion  = new Select(regionField);
        drpregion.selectByVisibleText(region);
    }

    public void billingAddressClickContinue() {
        paymentAddressContinueBtn.click();
    }

    public void chooseAnExistingBillingAddress(String address) {
        Select drpBillingAddress = new Select(existingBillingAddress);
        drpBillingAddress.selectByVisibleText(address);
    }
    public void chooseAnExistingDeliveryAddress(String address) {
        Select drpDeliveryAddress = new Select(existingDeliveryAddress);
        drpDeliveryAddress.selectByVisibleText(address);
    }

    public void fillAddressDeliveryNameField(String name) {
        deliveryNameField.sendKeys(name);
    }

    public void fillAddressDeliverySurnameField(String surname) {
        deliverySurnameField.sendKeys(surname);
    }

    public void fillAddressDeliveryAddressField(String address) {
        deliveryAddressField.sendKeys(address);
    }

    public void fillAddressDeliveryCityField(String city) {
        deliveryCityField.sendKeys(city);
    }

    public void fillAddressDeliveryCountryField(String country) {
        Select drpcountry = new Select(deliveryCountryField);
        drpcountry.selectByVisibleText(country);
    }

    public void fillAddressDeliveryRegionField(String region) {
        Select drpregion  = new Select(deliveryRegionField);
        drpregion.selectByVisibleText(region);
    }

    public void shippingAddressClickContinue() {
        shippingAddressContinueBtn.click();
    }

    public void continueToPaymentMethod() { continueToPaymentMethodBtn.click(); }

    public void continueToConfirmOrder() { continueToConfirmOrderBtn.click(); }

    public void choosePaymentMethod() { choosePaymentMethod.click(); }

    public void acceptTermsAndConditions() { agreeToTerms.click(); }

    public void confirmOrder() { confirmOrderBtn.click(); }
}

package pageObjects;

import org.openqa.selenium.By;

import com.aventstack.extentreports.model.Log;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ResultPage;
import pageObjects.CheckoutPage;

public class CheckoutPage extends Page {

    private MainPage mainPage = new MainPage(driver);
    private ResultPage resultPage = new ResultPage(driver);
    private LoginPage loginPage = new LoginPage(driver);
   // private Select select = new Select(driver);

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
    @FindBy(how = How.ID, using = "button-payment-address")
    public WebElement paymentAddressContinueBtn;
//
//    public Select drpcountry = new Select(countryField);
//    public Select drpregion  = new Select(regionField);


    public CheckoutPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void homePage() {
        driver.openWebPage("");
    }

    public void logIn() {
        driver.openWebPage("/index.php?route=account/login");
        loginPage.loginInto("karlinex98@gmail.com", "Asdf1234.");
        loginPage.clickSubmit();
    }

    public void addInStockItem() {
        driver.openWebPage("index.php?route=product/category&path=25_28");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]/span")).click();
    }

    public void addOutOfStockItem() {
        homePage();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]/span")).click();
    }

    public void goToCheckout() { driver.findElement(By.className("fa-share")).click(); }

    public void clickUseNewAddress() {
        driver.findElement(By.xpath("//*[@value='new']")).click();
    }

    public void fillAddNewAddressFields(String name, String surname, String address,
                                        String city, String country, String region) {
        Select drpcountry = new Select(countryField);
        Select drpregion  = new Select(regionField);

        nameField.sendKeys(name);
        surnameField.sendKeys(surname);
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        drpcountry.selectByVisibleText(country);
        drpregion.selectByVisibleText(region);
    }

    public void paymentAddressClickContinue() {
        paymentAddressContinueBtn.click();
    }
}

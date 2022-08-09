package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {

    @FindBy(how = How.ID, using = "logo")
    public WebElement logo;
    @FindBy(how = How.CLASS_NAME, using = "#search > input")
    public WebElement searchField;
    @FindBy(how = How.CLASS_NAME, using = "caret")
    public WebElement myAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    public WebElement login;

    public MainPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String searchData) {
        driver.waitForElementPresent(searchField);
        searchField.clear();
        searchField.sendKeys(searchData);
        searchField.sendKeys(Keys.ENTER);;
    }

    public void clickLoginButton() {
        myAccount.click();
        driver.waitForElementPresent(login);
        login.click();
    }
}

package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{

    @FindBy(how = How.ID, using = "input-email")
    public WebElement emailField;
    @FindBy(how = How.ID, using = "input-password")
    public WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//*[@value='Login']")
    public WebElement loginButton;
    @FindBy(how = How.CSS, using = "alert")
    public WebElement errorMessageField;

    public LoginPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void loginInto(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        loginButton.click();
    }

    public String getErrorMessage() {
        driver.waitForElementPresent(errorMessageField);
        return errorMessageField.getText();
    }
}

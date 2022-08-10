package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TinaAuthorizationPage extends Page{

    @FindBy(id = "input-email")
    private WebElement emailFieldInCLoginPage;

    @FindBy(id = "input-password")
    private WebElement passwordFieldInLoginPage;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement loginButtonInLoginPage;


    public TinaAuthorizationPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getEmailFieldInLoginPage(){
        return this.emailFieldInCLoginPage;
    }

    public WebElement getPasswordFieldInLoginPage(){
        return this.passwordFieldInLoginPage;
    }

    public void clickOnLoginButtonInLoginPage(){
        loginButtonInLoginPage.click();
    }


}

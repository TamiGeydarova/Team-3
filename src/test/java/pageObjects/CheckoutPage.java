package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
    @FindBy(id = "input-email")
    private WebElement emailFieldInCheckoutPage;


    public WebElement getEmailFieldInCheckoutPage(){
        return this.emailFieldInCheckoutPage;
    }

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    @FindBy(xpath = "//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")
    private WebElement cartButtonInItemCard;

    @FindBy(xpath = "//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")
    private WebElement checkoutLink;

    public void clickOnCartButtonInItemCard(){
        cartButtonInItemCard.click();
    }

    public void clickOnCheckoutLink(){
        checkoutLink.click();
    }





}

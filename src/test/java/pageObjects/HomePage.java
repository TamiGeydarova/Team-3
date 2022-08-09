package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page{

    @FindBy(how = How.XPATH, using = "//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")
    private WebElement cartButtonInItemCard;

    @FindBy(how = How.XPATH, using = "//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")
    private WebElement checkoutLink;


    public HomePage(WebDriverLib driver){
        super(driver);
    };



    public void clickOnCartButtonInItemCard(){
        cartButtonInItemCard.click();
    }

    public void clickOnCheckoutLink(){
        checkoutLink.click();
    }





}

package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class TinaHomePage extends Page{

    Actions actions = new Actions(driver);
    private static WebDriverWait wait;
    @FindBy(how = How.XPATH, using = "//*[@type=\"button\" and @onclick=\"cart.add('43');\"]")
    private WebElement cartButtonInItemCard;

    @FindBy(how = How.XPATH, using = "//*[@href = 'http://www.demoshop24.com/index.php?route=checkout/checkout']")
    private WebElement checkoutLink;

    @FindBy(how = How.XPATH, using = "//*[@href='http://www.demoshop24.com/index.php?route=account/account']")
    private WebElement myAccountLink;

    @FindBy(how = How.XPATH, using = "//*[@href='http://www.demoshop24.com/index.php?route=account/login']")
    private WebElement loginLink;

    @FindBy(id = "wishlist-total")
    private WebElement wishListLink;


    public TinaHomePage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnCartButtonInItemCard(){
        cartButtonInItemCard.click();
    }

    public void clickOnCheckoutLink(){
        checkoutLink.click();
    }

    public void clickOnMyAccountLink(){myAccountLink.click();}

    public void clickOnLoginLink(){loginLink.click();}

    public String showWishListTitle(){
        return wishListLink.getAttribute("Title");
    }







}

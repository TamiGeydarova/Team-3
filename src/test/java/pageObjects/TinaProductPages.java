package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TinaProductPages extends Page{

    //MP3 Players---------------------------------------------------
    @FindBy(how = How.XPATH, using = "//*[@onclick=\"wishlist.add('48');\"]")
    private WebElement heartButtonIPodClassic;

    @FindBy(how = How.XPATH, using = "//div[@class=\"alert alert-success alert-dismissible\"]/a[@href=\"http://www.demoshop24.com/index.php?route=product/product&product_id=48\"]")
    private WebElement linkForIPodClassicInAlert;

    @FindBy(how = How.XPATH,using = "//div[@class=\"alert alert-success alert-dismissible\"]/a[@href=\"http://www.demoshop24.com/index.php?route=account/wishlist\"]")
    private WebElement linkForWishListInAlert;

    @FindBy(how = How.XPATH, using = "//*[@onclick=\"compare.add('48');\"]")
    private WebElement compareButtonIPodClassic;

    @FindBy(how = How.XPATH, using = "//div[@class=\"alert alert-success alert-dismissible\"]/a[@href=\"http://www.demoshop24.com/index.php?route=product/compare\"]")
    private WebElement compareLinkInAlert;

    @FindBy(how = How.XPATH,using = "//*[@onclick=\"cart.add('48', '1');\"]")
    private WebElement cartButtonIPodClassic;

    @FindBy(how = How.XPATH, using = "//div[@class=\"alert alert-success alert-dismissible\"]/a[@href=\"http://www.demoshop24.com/index.php?route=checkout/cart\"]")
    private WebElement cartLinkInAlert;

    @FindBy(how = How.ID, using = "cart-total")
    private WebElement cartMainButton;
//-----------------------------------------------------------

    public TinaProductPages(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //MP3 Players-----------------------------------------------
    public void clickOnHeartButton1(){
        heartButtonIPodClassic.click();
    }

    public WebElement getLinkForIPodClassicInAlert(){
        return linkForIPodClassicInAlert;
    }

    public WebElement getLinkForWishListInAlert(){
        return linkForWishListInAlert;
    }

    public String getSuccessAlert(WebElement product, WebElement place){
        String productText = product.getText();
        String placeText = place.getText();
        String message = "Success: You have added " + productText + " to your " + placeText + "!";
        return message;
    }

    public void clickOnCompareButton1(){compareButtonIPodClassic.click();}

    public WebElement getCompareLinkInAlert(){
        return compareLinkInAlert;
    }

    public void clickOnCardButton1(){cartButtonIPodClassic.click();}

    public WebElement getCartLinkInAlert(){
        return cartLinkInAlert;
    }

    public WebElement getCartMainButton(){
        return cartMainButton;
    }

    //-----------------------------------------------------------
}

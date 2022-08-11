package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KristinaCategories extends Page {

    @FindBy(how=How.XPATH, using = "//*[text()='Desktops']")
    private WebElement clickDesktopButton;
    @FindBy(how=How.XPATH, using = "//*[text()='My Account']" )
    private WebElement clickMyAccountButton;
    @FindBy(how=How.XPATH, using = "//*[text()='Register']")
    private WebElement clickRegisterButton;

    @FindBy(how=How.XPATH, using = "//*[text()='Shopping Cart']" )
    private WebElement clickOnShoppingCart;
    @FindBy(how=How.XPATH, using = "//*[text()='Laptops & Notebooks']" )
    private WebElement clickLaptopsAndNotebooks;
    @FindBy(how=How.XPATH, using = "//*[text()='Tablets']" )
    private WebElement clickTablets;

    @FindBy(how=How.XPATH, using = "//*[text()='Software']" )
    private WebElement clickSoftware;

//    @FindBy(how=How.XPATH, using = "//*[text()='There are no products to list in this category.']" )
//    private WebElement noProductsInSoftware;
    @FindBy(how=How.XPATH, using = "//*[text()='Phones & PDAs']" )
    private WebElement clickPhonesAndPdas;
    @FindBy(how=How.XPATH, using = "//*[text()='Cameras']" )
    private WebElement clickCameras;
    @FindBy(how=How.XPATH, using = "//*[text()='MP3 Players']" )
    private WebElement clickMP3players;






    public KristinaCategories(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDesktopButton(){
        clickDesktopButton.click();
    }
    public void clickOnMyAccountButton(){
        clickMyAccountButton.click();
    }
    public void clickRegisterButton(){
        clickRegisterButton.click();
    }
    public void ClickOnShoppingCart(){
        clickOnShoppingCart.click();

    }
    public void clickLaptopsAndNotebooks(){
        clickLaptopsAndNotebooks.click();
    }
    public void clickTablets(){
        clickTablets.click();
    }
    public void clickSoftware(){
        clickSoftware.click();
    }

//    public void noProductsInSoftware(){
//        noProductsInSoftware.getText();
//    }
    public void clickPhonesAndPdas(){
        clickPhonesAndPdas.click();
    }
    public void clickCameras(){
        clickCameras.click();
    }
    public void clickMP3players(){
        clickMP3players.click();
    }




}

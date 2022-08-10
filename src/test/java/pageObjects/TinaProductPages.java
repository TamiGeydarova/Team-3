package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TinaProductPages extends Page{

    //MP3 Players---------------------------------------------------
    @FindBy(how = How.XPATH, using = "//*[@data-toggle=\"tooltip\" and @onclick=\"wishlist.add('48');\"]")
    private WebElement heartButtonIPodClassic;

    @FindBy(how = How.CLASS_NAME,using = "alert alert-success alert-dismissible")
    private WebElement successAlert;
//-----------------------------------------------------------

    public TinaProductPages(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //MP3 Players-----------------------------------------------
    public void clickOnHeartButton1(){
        heartButtonIPodClassic.click();
    }

    public String getSuccessAlert(){
        return successAlert.getText();
    }


    //-----------------------------------------------------------
}

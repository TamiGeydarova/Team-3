package stepDefinitions;

import java.util.Map;
import java.util.List;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import static org.junit.Assert.*;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;

public class KristinaSteps extends GeneralSteps {
    private TinaHomePage homePage = new TinaHomePage(driver);
    private TinaCheckoutPage checkoutPage = new TinaCheckoutPage(driver);
    private KristinaCategories desktopButton = new KristinaCategories(driver);


//    protected WebDriverLib driver;
    public KristinaSteps() {this.driver = new WebDriverLib();}
    static MainPage mainPage;
    static ResultPage resultPage;
    static LoginPage loginPage;



    //____________________________________________________________
    @Given("^open shop page$")
        public void openShopPage(){
        driver.get("http://www.demoshop24.com/");
    }
    @Then("^click categories button Desktops$")
    public void clickCategoriesButtonDesktop(){

        desktopButton.clickOnDesktopButton();
    }
    @And("^i see dropdown$")
    public void iSeeDropdown(){
        assertTrue(driver.findElement(By.className("dropdown-menu")).isEnabled());

    }
    @Then("^click My Account button$")
    public void clickMyAccountButton(){
        desktopButton.clickOnMyAccountButton();


    }
    @Then("^click Register button$")
    public void clickRegisterButton(){
        desktopButton.clickRegisterButton();
    }

@Then("^click on shopping cart$")
    public void clickOnShoppingCart(){
        desktopButton.ClickOnShoppingCart();

}
@Then("click button Show all Desktops")
    public void clickButtonShowAllDesktops(){
//        driver.findElement(By.xpath("//*[text()=Show All Desktops']")).click();
    desktopButton.clickShowAllDesktops();
}

    @And("^I see number of Desktops$")
    public void iSeeNumberOfDesktops(){
        assertEquals("PC (0)", driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=20_26']"))
                .getText());
        assertEquals("Mac (1)", driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=20_27']")).getText());
    }

@Then("^click categories button Laptops and Notebooks$")
    public void clickCategoriesButtonNaptopsAndNotebooks(){
        desktopButton.clickLaptopsAndNotebooks();

}

@Then("^I see number of Laptops and Notebooks$")
    public void iSeeNumberOfLaptopsAndNotebooks(){
        assertEquals("Macs (0)",
                driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=18_46']")).getText());
        assertEquals("Windows (0)",
                driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=18_45']")).getText());

}
@Then("^click categories button Tablets$")
    public void clickCategoriesButtonTablets(){
        desktopButton.clickTablets();
}

@And("^i see number of Tablets$")
    public void iSeeNumberOfTablets(){
    assertTrue(driver.findElement(By.linkText("Tablets (1)")).isDisplayed());

}

@Then("^i click Software$")
    public void iClickSoftware(){
        desktopButton.clickSoftware();
}
@And("^i see number of Software$")
    public void iSeeNumbberOfSoftware(){
    assertTrue(driver.findElement(By.linkText("Software (0)")).isDisplayed());
    }

    @Then("^i click categories button Phones and PDAs$")
    public void iClickCategoriesButtonPhonesAndPDAs(){
        desktopButton.clickPhonesAndPdas();

    }

    @And("^i see number of Phones and PDAs$")
    public void iSeeNumberOfPhonesAndPdas(){
        assertTrue(driver.findElement(By.linkText("Phones & PDAs (3)")).isDisplayed());


    }
    @Then("^i click categories button Cameras$")
    public void iClickCategoriesButtonCameras(){
        desktopButton.clickCameras()
;

    }
    @And("^i see number of Cameras$")
    public void iSeeNumberOfCameras(){
        assertTrue(driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=33']")).isEnabled());



    }
    @Then("^i click categories button MP3 players$")
    public void iClickMP3players(){
        desktopButton.clickMP3players();
        driver.manage().deleteAllCookies();

    }
    @And("^i see number of MP3 players$")
    public void iSeeNumberOfMp3Players(){
        assertTrue(driver.findElement(By.className("dropdown-menu")).isEnabled());

        assertEquals("test 11 (0)", driver.findElement(By.xpath("//*[@href = 'http://www.demoshop24.com/index.php?route=product/category&path=34_43']")).getText());

    }



}
















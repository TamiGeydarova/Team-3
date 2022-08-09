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
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ResultPage;

public class KristinaSteps extends GeneralSteps {


    protected WebDriverLib driver;
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
        List<WebElement> categories = driver.findElements(By.xpath("//*[text()='Desktops']"));
        for (WebElement category : categories){
            categories.get(0).click();
        }
    }
    @And("^i see dropdown$")
    public void iSeeDropdown(){
        assertTrue(driver.findElement(By.className("dropdown-menu")).isEnabled());

    }
    @Then("^click My Account button$")
    public void clickMyAccountButton(){
        driver.findElement(By.xpath("//*[text()='My Account']")).click();
    }
    @Then("^click Register button$")
    public void clickRegisterButton(){
//        List<WebElement> elems = driver.findElements(By.className("dropdown-menu"));
//        Select dropdown = new Select(driver.findElement(By.className("My Account")));
//        dropdown.selectByVisibleText("Register");
        driver.findElement(By.xpath("//*[text()='Register']")).click();
    }

@Then("^click on shopping cart$")
    public void clickOnShoppingCart(){
        driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
}
@Then("click button Show all Desktops")
    public void clickButtonShowAllDesktops(){
        driver.findElement(By.xpath("//*[text()=Show All Desktops']")).click();
}
//@Then("^subcategory desktop has desktops$")
//    public void subcategoryDesktopHasDesktops(){
//    List<WebElement> desktops = driver.findElements(By.className("product-layout"));
//    if (desktops.contains("Canon "))
//
//}











}

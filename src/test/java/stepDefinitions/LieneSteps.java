package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import flowWorkers.WebDriverLib;


public class LieneSteps {
    public WebDriverLib driver;

    public LieneSteps() {
        this.driver = new WebDriverLib();
    }

    @Given("^I am on the Home page$")
    public void IAmOnTheMainPage() {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }


    @And("^I click on Checkout in top menu$")
    public void CheckoutInTopMenu() {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span")).click();
    }

    @Then("^I am on the Checkout Page$")
    public void CheckoutPage() {
        driver.get("http://www.demoshop24.com/index.php?route=checkout/cart");
    }


    @Then("^I click on Shopping Cart in top menu$")
    public void shoppingCartInTopMenu() {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
    }


    @Then("^I click on Checkout Button$")
    public void checkoutButton() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
    }

    @Then("^I click on Shopping Cart popup$")
    public void clickPopup() {
        driver.findElement(By.xpath("//*[@id=\"cart\"]")).click();

    }
    @And("^I see the the Shopping Cart popup displayed$")
    public void popupDisplayed() {
        assertTrue(driver.findElement(By.xpath("//*[@id=\"cart\"]/ul")).isDisplayed());
    }

    @Then("^I click on Checkout$")
    public void smallCheckoutButton() {
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong/i")).click();


    }

}




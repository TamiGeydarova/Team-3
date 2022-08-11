package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import pageObjects.LoginPage;
//import pageObjects.MainPage;
//import pageObjects.ResultPage;

//public class SortingSteps extends GeneralSteps {

    public class SortingSteps extends GeneralSteps{

//        private MainPage mainPage = new MainPage(driver);
//        private ResultPage resultPage = new ResultPage(driver);
//        private LoginPage loginPage = new LoginPage(driver);

//    public SortingSteps () {
//        this.driver = WebDriverLib.driver;
//        mainPage = PageFactory.initElements(WebDriverLib.driver, MainPage.class);
//    }

//    @Before
//    public void openBrowser() {
//        driver.openBrowser();
//    }

//    @After
//    public void closeBrowser() {
//        driver.close();
//    }

    @Given("^I am on Browse page$")
    public void iAmOnBrowsePage() {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20");

    }

    @Then("^I click sort button$")
            public void iClickSortButton(){
        driver.findElement(By.id("input-sort")).click();
    }
    @And("^I Sort by Alphabet AZ$")
        public void iSortByAlphabetAZ() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.id("input-sort")));
        dropdown.selectByVisibleText("Name (A - Z)");
        Thread.sleep(2000);
    }
//    @Then ("^I check merchendise AZ$")
//        public void iCheckMerchendiseAZ(){
//        driver.findElement(By.xpath("//a[contains(text(),'Apple Cinema 30')]"));
//        driver.findElement(By.xpath("//a[contains(text(),'Sony VAIO')]"));

        @Then ("^I Sort by Alphabet ZA$")
        public void iSortByAlphabetZA() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Name (Z - A)");
            Thread.sleep(2000);
        }

        //    @Then ("^I check merchendise ZA$")
//        public void iCheckMerchendiseZA(){
        //        driver.findElement(By.xpath("//a[contains(text(),'Sony VAIO')]"));
//        driver.findElement(By.xpath("//a[contains(text(),'Apple Cinema 30')]"));

        @Then ("^I Sort by Price Low to High$")
        public void iSortByPriceLowtoHigh() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Price (Low > High)");
            Thread.sleep(2000);
        }

////        @And ("^I check merchendise Price Low to High$")
//        public void iCheckmerchendisePriceLowtoHigh(){
//
//        }

        @Then ("^I Sort by Price High to Low$")
        public void iSortByPriceHighttoLow() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Price (High > Low)");
            Thread.sleep(2000);
    }

//        @And ("^I check merchendise Price High to Low$")
//         public void iCheckMerchendisePriceHightoLow() {
//        }

        @Then ("^I Sort by rating High to low$")
        public void iSortByRatingHightoLow() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Rating (Highest)");
            Thread.sleep(2000);
        }

//        @And ("^I check merchendise rating High to low$")
//        public void iCheckMerchendiseRatingHightoLow() {
//        }

        @Then ("^I Sort by rating Low to High$")
        public void iSortByRatingLowtoHigh() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Rating (Lowest)");
            Thread.sleep(2000);
        }
//        @And ("^I check merchendise rating Low to High$")
//        public void iCheckMerchendiseRatingLowtoHigh(){
//
//        }

        @Then ("^I Sort by Model name alphabetically AZ$")
        public void iSortByModelNameAlphabeticallyAZ() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Model (A - Z)");
            Thread.sleep(2000);
        }
//        @And ("^I check merchendise models AZ$")
//        public void iCheckMerchendiseModelsAZ(){
//
//        }

        @Then ("^I Sort by Model name alphabetically ZA$")
        public void iSortByModelNameAlphabeticallyZA() throws InterruptedException {
            Select dropdown = new Select(driver.findElement(By.id("input-sort")));
            dropdown.selectByVisibleText("Model (Z - A)");
            Thread.sleep(2000);
        }

//        @And ("^I check merchendise models ZA$")
//        public void iCheckMerchediseModelsZA(){
//
//        }
//        @Then ("^I hover over mp3player$")
//        public void iHoverOverMp3player() throws InterruptedException {
//            driver.findElement(By.xpath("//a[contains(text(),'MP3 Players')]"));
//            Thread.sleep(5000);
//        }
}
        //Name (A - Z)
//input-sort
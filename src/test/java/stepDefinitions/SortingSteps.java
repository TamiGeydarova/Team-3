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
        public void iSortByAlphabetAZ(){
        Select dropdown = new Select(driver.findElement(By.id("input-sort")));
        dropdown.selectByVisibleText("Name (A - Z)");
    }
    @Then ("^I check merchendise$")
        public void iCheckMerchendise(){
        
    }

}
        //Name (A - Z)
//input-sort
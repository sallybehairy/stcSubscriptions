package com.stcSubscriptions.steps;

import org.testng.Assert;

import com.stchSubscriptions.base.home.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;

import java.util.List;

public class Steps {

    private WebDriver driver;
    private WebDriverWait wait;
    private Home home;
    private Scenario scenario;
    
    public Steps() {
    }
    
    public Steps(Scenario scenario) {
    	this.scenario = scenario;
    }
    
    @Before
    public void setup() {
    	String driverPath = Steps.class.getClassLoader().getResource("chromedriver.exe").getPath();
    	System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/sa-en");
        home = new Home(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("the user is on the STC subscriptions page for {string}")
    public void the_user_is_on_the_stc_subscriptions_page_for_country(String countryName) {
        home.changeCountry();
        home.chooseCountry(countryName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='country-name' and (contains(text(),'" + countryName +"'))]")));
        scenario.log("The user is on stc subscriptions page for " + countryName );
    }

    @When("the user checks the available subscription plan types")
    public List<String> the_user_checks_the_available_subscription_plan_types() {
        return home.getPlanTypeName();
    }

    @Then("the user should find the following plan types:")
    public void the_user_should_find_the_plan_types(DataTable dataTable) {
        List<String> expectedPlanTypes = dataTable.asList();
        List<String> actualPlanTypes = the_user_checks_the_available_subscription_plan_types();
        for (String expectedPlanType : expectedPlanTypes) {
        	if (actualPlanTypes.contains(expectedPlanType)) {
                scenario.log("Validation passed: Found plan type - " + expectedPlanType);
            } else {
                scenario.log("Validation failed: Expected plan type - " + expectedPlanType);
                Assert.fail("Validation failed for plan type - " + expectedPlanType);
            }
        }
    }

}

package com.stcSubscriptions.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\starek\\projects\\testCrewTask\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://subscribe.stctv.com/sa-en");
	}
	@Given("the user is on the STC subscriptions page for KSA")
	public void the_user_is_on_the_stc_subscriptions_page_for_ksa() {
	   
	}

	@When("the user checks the available subscription plan types")
	public void the_user_checks_the_available_subscription_plan_types() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed plan types")
	public void the_user_should_find_the_agreed_plan_types() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the user is on the STC subscriptions page for Bahrain")
	public void the_user_is_on_the_stc_subscriptions_page_for_bahrain() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the user is on the STC subscriptions page for Kuwait")
	public void the_user_is_on_the_stc_subscriptions_page_for_kuwait() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price for LITE")
	public void the_user_checks_the_monthly_price_for_lite() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price for the LITE")
	public void the_user_should_find_the_agreed_price_for_the_lite() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price for CLASSIC")
	public void the_user_checks_the_monthly_price_for_classic() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price for the CLASSIC")
	public void the_user_should_find_the_agreed_price_for_the_classic() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price for PREMIUM")
	public void the_user_checks_the_monthly_price_for_premium() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price for the PREMIUM")
	public void the_user_should_find_the_agreed_price_for_the_premium() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price currency for LITE")
	public void the_user_checks_the_monthly_price_currency_for_lite() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price currency for the LITE")
	public void the_user_should_find_the_agreed_price_currency_for_the_lite() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price currency for CLASSIC")
	public void the_user_checks_the_monthly_price_currency_for_classic() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price currency for the CLASSIC")
	public void the_user_should_find_the_agreed_price_currency_for_the_classic() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user checks the monthly price currency for PREMIUM")
	public void the_user_checks_the_monthly_price_currency_for_premium() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should find the agreed price currency for the PREMIUM")
	public void the_user_should_find_the_agreed_price_currency_for_the_premium() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
}
}

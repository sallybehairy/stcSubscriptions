package com.stchSubscriptions.base.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.stcSubscriptions.PageObject.homepage.HomePage;

public class Home {
	
	private HomePage homePage;

	public Home(WebDriver driver) {
		homePage = new HomePage(driver);
	}


	public void changeCountry() {
		homePage.changeCountry();
	}

	public void chooseCountry(String countryName) {
		homePage.chooseCountry(countryName);
	}
	
	public void closeChooseCountryPopUp() {
		homePage.closeChooseCountryPopUp();
	}
	
	public List<String> getPlanTypeName() {
		return homePage.getPlanTypeName();
	}
	
	public String getPlanPrice(String planTitle) {
		return homePage.getPlanPrice(planTitle);
	}
	
	public String getPlanPriceCurrency(String planTitle) {
		return homePage.getPlanPriceCurrency(planTitle);
	}
	
	
}

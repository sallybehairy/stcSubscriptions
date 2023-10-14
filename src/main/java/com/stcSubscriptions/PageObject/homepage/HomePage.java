package com.stcSubscriptions.PageObject.homepage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriverWait wait;
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='country-btn']")
	public WebElement countryBtn;
	@FindBy(xpath = "//body[contains(@class,'countries')]")
	public WebElement selectCountryPopUp;
	@FindBy(xpath = "//div[contains(@id,'country-poppup-close')]")
	public WebElement selectCountryPopUpCloseBtn;

	public void changeCountry() {
		wait.until(ExpectedConditions.visibilityOf(countryBtn));
		countryBtn.click();
		wait.until(ExpectedConditions.visibilityOf(selectCountryPopUp));
	}

	public void chooseCountry(String countryName) {
		wait.until(ExpectedConditions.visibilityOf(selectCountryPopUp));
		switch (countryName) {
		case "KSA":
			selectCountryPopUp.findElement(By.xpath(".//a[@id='sa']")).click();
			wait.until(ExpectedConditions.urlToBe("https://subscribe.stctv.com/sa-en"));		
		case "Bahrain":
			selectCountryPopUp.findElement(By.xpath(".//a[@id='bh']")).click();
			wait.until(ExpectedConditions.urlToBe("https://subscribe.stctv.com/bh-en"));	
	    case "Kuwait":
	    	selectCountryPopUp.findElement(By.xpath(".//a[@id='kw']")).click();
	    	wait.until(ExpectedConditions.urlToBe("https://subscribe.stctv.com/kw-en"));
		}	

	}
	
	public void closeChooseCountryPopUp() {
		wait.until(ExpectedConditions.visibilityOf(selectCountryPopUp));
		selectCountryPopUpCloseBtn.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@id,'country-poppup-close')]")));
	}
	
	public List<String> getPlanTypeName() {
		List<WebElement> planTypesList = driver.findElements(By.xpath("//div[@class='plan-names']//strong[@class='plan-title']"));
		 List<String> availablePlanTypeNames = new ArrayList<>();
        for (WebElement planType : planTypesList) {
            String planTypeName = planType.getText();
            availablePlanTypeNames.add(planTypeName);
        }
        return availablePlanTypeNames;
	}
	
	public String getPlanPrice(String planTitle) {
		return driver.findElement(By.xpath("//div[@id='currency-" + planTitle.toLowerCase() + "']//b")).getText();
	}
	
	public String getPlanPriceCurrency(String planTitle) {
		return driver.findElement(By.xpath("//div[@id='currency-" + planTitle.toLowerCase() + "']//i")).getText();
	}
	
	
}

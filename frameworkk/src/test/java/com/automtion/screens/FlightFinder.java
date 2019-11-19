package com.automtion.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
	
	@FindBy(name="FindFlight")
	private WebElement btncontinue=null;
	
	@FindBy(name="FindFlight")
	private WebElement btncntinue=null;
	
	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickoncontinue() {
		
		btncontinue.click();
		
		btncntinue.click();
	}
	
}

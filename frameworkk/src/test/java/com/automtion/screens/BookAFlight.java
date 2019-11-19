package com.automtion.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	
	@FindBy(name="passFrist0")
	private WebElement txtFisrtName =null;
	
	@FindBy(name="passLast0")
	private WebElement txtLastName=null;
	
	@FindBy(name= "buyFlights")
	private WebElement btnFlights=null;
	
	@FindBy(name= "SIGN-OFF")
	private WebElement btnsignoff=null;
	
	
	
	public BookAFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public void enterdetails(String Firstname,String LastName) {
		
		txtFisrtName.sendKeys(Firstname);
		
		txtLastName.sendKeys(LastName);
		
		btnFlights.click();
		
		btnsignoff.click();
	}
	
}

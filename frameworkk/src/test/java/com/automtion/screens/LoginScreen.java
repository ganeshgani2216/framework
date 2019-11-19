package com.automtion.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
	
	@FindBy(name="userName")
	
	private WebElement txtuserName=null;
	
	@FindBy(name="password")
	
	private WebElement txtpassword=null;
	
	@FindBy(name="login")
	
	private WebElement btnlogin=null;
	
	public LoginScreen(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	
	}
	
	public void login (String userName, String password) {
		
		txtuserName.sendKeys(userName);
		
		txtpassword.sendKeys(password);
		
		btnlogin.click();
		
	}
	
	
	
	
	
	
	
	
}

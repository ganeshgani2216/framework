package com.automtion.testscripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automtion.core.FrameworkScript;
import com.automtion.screens.BookAFlight;
import com.automtion.screens.FlightFinder;
import com.automtion.screens.LoginScreen;

public class TC_02_creatEmployee extends FrameworkScript{
		
	@Test
	public void bookAFlight()throws Exception{
		driver.get("http://newtours.demoaut.com/");
		
		LoginScreen loginScreen = new LoginScreen(driver);
		
		loginScreen.login("mercury", "mercury");
		
		FlightFinder finder = new FlightFinder(driver);
		
		finder.clickoncontinue();
		
		BookAFlight bookAFlight = new BookAFlight(driver);
		
		bookAFlight.enterdetails("ganesh", "beast");
		
		}
		
		
	}
	


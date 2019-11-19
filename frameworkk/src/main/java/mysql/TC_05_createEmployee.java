package mysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_05_createEmployee {
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	String username = null;
	
	String password = null;
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
	
	Statement statement = connection.createStatement();
	
	ResultSet resultSet = statement.executeQuery("select*from users where username ='Admin'");
	
	while (resultSet.next()) {
		
		username= resultSet.getString(1);
		
		username= resultSet.getString(2);
		
	}
	
		Connec
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys(firstName);

		driver.findElement(By.id("lastName")).sendKeys(lastName);
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);

		
	}
	
	
}

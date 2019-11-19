package com.automtion.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TC_01_creatEmployee {
	
	
	WebDriver driver = null;
	
	@BeforeTest
		public void init() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
	}
	
		@Test(dataProvider="getTestData")
		
			public void creatEmployee(String userName,String password,String firstName,String lastName)throws Exception {
	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
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
		
		@AfterTest
			public void destroy() {
			
			driver.quit();
		}
		
		@DataProvider
			public String[][]getTestData()throws Exception{
			
			String[][]data = null;
			
			Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("D:\\Book2.xlsx")));
			
			Sheet sheet = workbook.getSheet("sheet1");
			
			data= new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
			
			for(int rowindex=0;rowindex<sheet.getPhysicalNumberOfRows();rowindex++) {
				
			for(int colindex=0;colindex<sheet.getRow(rowindex).getPhysicalNumberOfCells();colindex++) {
			
			data[rowindex][colindex]= sheet.getRow(rowindex).getCell(colindex).toString();
			
			}
	
		}
			
		workbook.close();
		
		return data;
			
		}
		
	}

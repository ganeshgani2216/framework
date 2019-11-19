package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hondacarindia.com/");
		
		driver.findElement(By.xpath("//i[@class='menuIcon serviceIcon']")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
		for(String windowID : windowids) {
			
			System.out.println(windowID);
			
			if(driver.switchTo().window(windowID).getTitle().equals("Honda Service - Procare Customer Service and Maintenance Tips"))
			break;
		}
	
		driver.findElement(By.xpath("//span[text()='BOOK A SERVICE']")).click();
			Thread.sleep(3000);
			
			driver.quit();
			
		}
	
}

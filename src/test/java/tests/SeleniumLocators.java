package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {

		//locators using xpath

		WebDriver driver = new ChromeDriver();
//		Launch the browser
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		Maximize the Browser
		driver.manage().window().maximize();
		
//		Launch the URL
		WebElement Solutions = driver.findElement(By.xpath("//ul[@class='leftmenu']/li[@class='Solutions']"));
		
	
	}

}

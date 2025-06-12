package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_23 {
	/*
	 * Assignment - 23
=============

1.Launch Chrome Browser
       
2.Maximize the browser window
       
3.Launch the application (https://demoqa.com/alerts)
       
4.Locate Alert buttons
       
5.Launch Information alert
       
6.Print Alert message
       
7.Click on OK button
       
8.Launch confirmation alert

9.Print Alert message
       
10.Click on Cancel button
       
11.Launch prompt alert with dialog box alert

12.Print message

13.Enter Text in Alert
       
14.Click on OK button
	 */

	static WebDriver driver;
	public static  void main(String[] args) {
		
		//1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");		
	       
		//2.Maximize the browser window
		driver.manage().window().maximize();
		       
		//3.Launch the application (https://demoqa.com/alerts)
		driver.get("https://demoqa.com/alerts");		
		       
		//4.Locate Alert buttons
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmAlertButtonButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		       
		//5.Launch Information alert
		infoAlertButton.click();
		       
		//6.Print Alert message
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message ="+ alertMessage);
		       
		//7.Click on OK button
		driver.switchTo().alert().accept();
		
		//8.Launch confirmation alert
		confirmAlertButtonButton.click();
		
		//9.Print Alert message
		String confirmAlertMessage = driver.switchTo().alert().getText();
		System.out.println("Confirmation Alert Message ="+confirmAlertMessage);
		
		//10.Click on Cancel button
		driver.switchTo().alert().dismiss();
		       
		//11.Launch prompt alert with dialog box alert
		promptButton.click();

		//12.Print message
		String promptAlertMessage = driver.switchTo().alert().getText();
		System.out.println("Prompt Alert Message = " + promptAlertMessage);

		//13.Enter Text in Alert
		driver.switchTo().alert().sendKeys("Hello , This is Alert Testing");
		       
		//14.Click on OK button		
		driver.switchTo().alert().accept();
	}
}

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_24 {

/*
Assignment - 24
=============
//1.Launch Chrome Browser
       
//2.Maximize the browser window
       
//3.Launch the application (https://demoqa.com/frames)
        
//4.Locate elements
               
//5.Print frame element text
           
//6.Print main window element text
       
//7.Close browser window
*/

	public static void main(String[] args) {
		
		//1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application (https://demoqa.com/frames)
		driver.get("https://demoqa.com/frames");
		
		//4.Locate elements
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		WebElement mainWindowElement = driver.findElement(By.id("sampleHeading"));
		
		//5.Print frame element text
		System.out.println("Frame Element Text: " + frameElement.getText());
		
		//6.Print main window element text
		System.out.println("Main Window Element Text: " + mainWindowElement.getText());
		
		//7.Close browser window
		driver.quit();
	}
	
}
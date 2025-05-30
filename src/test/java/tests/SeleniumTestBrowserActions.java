package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestBrowserActions {

	public static void main(String[] args) {

		//selenium browser actions
		WebDriver driver = new ChromeDriver();
		
//		Launch the browser
		driver.get("https://www.selenium.dev/");
		
//		Maximize the Browser
		driver.manage().window().maximize();
		
//		Launch the URL
		driver.get("www.google.com");
		
//		Navigate to different URL
		driver.navigate().to("https://www.selenium.dev/");
		
//		Go back to previous URL
		driver.navigate().back();
		
//		Move forward to next URL
		driver.navigate().forward();
		
//		Reload/Refresh Browser window
		driver.navigate().refresh();
		
//		Close current Browser Window
		driver.close();
		
//		Close multiple Browser Windows launched by selenium
		driver.quit();
		
//		Delete browser cookies
		driver.manage().deleteAllCookies();
		
//		Get Window Handle Id (Single window)
		driver.getWindowHandle();
		
//		Get Window Handle Id (Multiple windows)
		driver.getWindowHandles();
		
//		Get the window Size
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height -"+ size.getHeight());
		System.out.println("Width -"+ size.getWidth()); 

//		Set the window Size
		driver.manage().window().setSize(new Dimension(1200, 800));

//		Launch New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
//		Get Current Browser window URL
		driver.getCurrentUrl();
		
//		Launch New Window
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.close();
		
	}

}

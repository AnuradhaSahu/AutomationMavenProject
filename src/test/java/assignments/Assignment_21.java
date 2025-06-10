package assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Assignment_21 {
	/*
	 * Assignment -21
=============
1. Launch browser window
2. Maximize the browser window
3. Delete all the cookies
4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
5. Verify application title
6. Verify application logo
7. Verify application caption
8. Enter Invalid credentials in Username and Password textboxes
9. Click on Login Button
10. Verify error message is displayed (The username and password could not be verified.)
11. Click on Adminpage link
12. Wait for admin page
13. Select Data access mode as ' SOAP'
14. Scrolldown till Loan provider
15. Select Loanprovider as 'Web Service'
16. Click on Submit button
17.wait for Successful submission message
18.Click on Services Link
19.Wait for Services page
20.Scrolldown till Bookstore services
21.Get total rows, columns in the bookstore service table
22.Get Column headers of book store services table
23.Get all the data from book store service table
24.Close browser window
	 */
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//1. Launch browser window
		
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

//		5. Verify application title
		String expectedTitle ="ParaBank | Welcome | Online Banking";
		String actualTitle =driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle,"Application title does not match!!!");	
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "logo is not displayed");
		
//		7. Verify application caption
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String ExpectedCaption = "Experience the difference";
		String actualCaption = caption.getText();
		
		Assert.assertEquals(actualCaption, ExpectedCaption,"Caption does not match");
		
//		8. Enter Invalid credentials in Username and Password textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		username.clear();
		password.clear();
		
		username.sendKeys("test234");
		password.sendKeys("Welcome@123");

//		9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
		
		loginButton.click();
		
//		10. Verify error message is displayed (The username and password could not be verified.)
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"),0));
		
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class='error']"));
		String expectedError = "The username and password could not be verified.";
		String actualError = errorMsg.getText();
		Assert.assertEquals(expectedError, actualError,"Error does not match!!");
		
//		11. Click on Adminpage link
		WebElement adminPage = driver.findElement(By.xpath("//a[contains(text(),'Admin Page')]"));
		adminPage.click();
		
//		12. Wait for admin page
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[@class='title']"), 0));
		
//		13. Select Data access mode as ' SOAP'
        selectDataAccessMode("SOAP");
		
//		14. Scrolldown till Loan provider
        WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()", loanProvider);
        
		
//		15. Select Loanprovider as 'Web Service'
        Select s = new Select(loanProvider);
        s.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
        WebElement Submit = driver.findElement(By.xpath("//input[@type='submit'  and @value ='Submit'] "));
        Submit.click();
		
//		17.wait for Successful submission message
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[contains(text(),'Settings saved successfully.')]"), 0));
        
		
//		18.Click on Services Link
        WebElement Services = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[contains(text(),'Services')]"));
        Services.click();
		
//		19.Wait for Services page
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[contains(text(),'Available Bookstore SOAP services:')]"), 0));
		
//		20.Scrolldown till Bookstore services
        WebElement bookStore = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
        JavascriptExecutor jss = (JavascriptExecutor)driver;
        jss.executeScript("arguments[0].scrollIntoView()", bookStore);
		
//		21.Get total rows, columns in the bookstore service table
        List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr"));
        int totalRows = rows.size();
        
        List<WebElement> Coloumns = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr[1]/td"));
        int totalColoumns = Coloumns.size();
		
//		22.Get Column headers of book store services table
        for(WebElement header :Coloumns ) {
        	System.out.println(header.getText());
        }
		
//		23.Get all the data from book store service table
        
        for(int r=1; r<totalRows; r++) {
        	for(int c=1; c<totalColoumns;c++) {
        		WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tr["+r+"]/td["+c+"]"));
        		System.out.println("Row "+ r + "Colomn"+c+"Value is :"+cell.getText());
        	}
        }
		
//		24.Close browser window
        driver.quit();
	}
	
	public static void selectDataAccessMode(String option) {
		WebElement dataAccessMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dataAccessMode.click();
	}
}

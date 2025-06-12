package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_22 {
	/*
	 * Assignment - 22
=============
//1. Launch browser window(Chrome)
       
//2. Maximize the browser window

//3. Delete all the cookies
       
//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
       
//5. Wait for Page-load

//6. Enter First name and Last name
           
//7. Enter Email
               
//8. Select Gender (Female)
               
//9. Enter mobile number
               
//10.Select DOB (1-Feb-1991)
               
//11.Search and Select Computer Science
               
//12.Select Hobbies as Sports and Reading
               
//13.Upload photo
               
//14. Wait till file upload
               
//15.Submit Details
               
//16. Close browser window
	 */
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://demoqa.com/automation-practice-form");
	       
		//2. Maximize the browser window
		 driver.manage().window().maximize();

		//3. Delete all the cookies
		 driver.manage().deleteAllCookies();
		       
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		  driver.get("https://demoqa.com/automation-practice-form");
		  
		//5. Wait for Page-load
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  

		//6. Enter First name and Last name
		  WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		  
		  WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		  
		  firstName.sendKeys("Anuradha");
		  lastName.sendKeys("Sahu");
    
		//7. Enter Email
		  WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		  
		  email.sendKeys("anu123@gmail.com");

		               
		//8. Select Gender (Female)
		  selectGender("Female");
		               
		//9. Enter mobile number
		  WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		  mobileNumber.sendKeys("9090123458");
		               
		//10.Select DOB (1-Feb-1991)
		  selectDOB("7","January","2000");		  
		               
		//11.Search and Select Computer Science
		  selectSubject("Computer Science");		  
		               
		//12.Select Hobbies as Sports and Reading
		     String hobbies[] = {"Sports","Reading","Music"};
		     selectHobbies(hobbies);
		     
		//13.Upload photo
		     String filePath = System.getProperty("user.dir"+"\\File\\Photo.png");
		      WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		      uploadPhoto.sendKeys(filePath);
		      
		//14. Wait till file upload
		      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='uploadPicture']")));
		      
		               
		//15.Submit Details
		      WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		      JavascriptExecutor js = (JavascriptExecutor)driver;
		      js.executeScript("argumnets[0].click()", submit);
		               
		//16. Close browser window
		  driver.quit();
		
	}
	
	public static void selectGender(String option) {
		WebElement Gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		Gender.click();
	}
	
	public static void selectDOB(String date, String month, String year) {
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		DOB.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='react-datepicker__month-select']")));
		
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select m = new Select(monthDropdown);
		m.selectByVisibleText(month);
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select y = new Select(yearDropdown);
		y.selectByVisibleText(year);
		
		WebElement date1 = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text(),'"+date+"')]"));
		date1.click();		
	}
	
	public static void selectSubject(String subject) {
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		
		//as the subject input field is not visible we need to scroll till it is
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subjectInput);
		
		//enter the subject in the input field
		Actions action = new Actions(driver);
		action.sendKeys(subjectInput,subject).perform();
		
		//wait for subject option to appear
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]")));
	    
	    //click on subject option
	    WebElement subjectOption = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
	    subjectOption.click();
					
	}
	
	//method to select hobbies
	public static void selectHobbies(String[] hobbies) {
		
		for(String hobby : hobbies) {
			WebElement hobbyCheckBox = driver.findElement(By.xpath("//label[contains(text(),'"+hobby+"')]"));
			if(!hobbyCheckBox.isSelected()) {
				hobbyCheckBox.click();
			}
		}
		
		
	}
}

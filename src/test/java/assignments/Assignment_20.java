package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assignment_20 {
	
	@Test
	public static void test() {
		
	}
	
	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

        //	Launch the URL
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //	Maximize the Browser
		driver.manage().window().maximize();

		// locate all the elements
		WebElement Solutions = driver.findElement(By.xpath("//ul[@class='leftmenu']/li[@class='Solutions']"));
		
		WebElement AboutUs = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[contains(text(),'About Us')]"));
		
		WebElement Services = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[contains(text(),'Services')]"));
		
		WebElement Products = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[contains(text(),'Products')]"));
		
		WebElement Locations = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[contains(text(),'Locations')]"));
		
		WebElement AdminPage = driver.findElement(By.xpath("//ul[@class='leftmenu']//li//a[contains(text(),'Admin')]"));
		
		WebElement UserNameTextBox = driver.findElement(By.xpath("//div[@class='login']/input[@name='username']"));
		
		WebElement PasswordTextBox = driver.findElement(By.xpath("//div[@class='login']/input[@name='password']"));
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[@class='login']/input[@class='button']"));
		
		WebElement ForgotLoginInfo = driver.findElement(By.xpath("//a[contains(text(),'Forgot login info?')]"));
		
		WebElement Register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		
		WebElement Logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
		WebElement Tagline = driver.findElement(By.xpath("//div//p[contains(text(),'Experience the difference')]"));
		
		WebElement HomeButton = driver.findElement(By.xpath("//ul[@class='button']//li[@class='home']"));
		
		WebElement About = driver.findElement(By.xpath("//ul[@class='button']//li[@class='aboutus']"));
		
		WebElement Contact = driver.findElement(By.xpath("//ul[@class='button']//li[@class='contact']"));
		
		WebElement ATMServicesLink = driver.findElement(By.xpath("//li[contains(text(),'ATM Services')]"));
		
		WebElement WithdrawlFunds = driver.findElement(By.xpath("//ul[@class='services']/li/a[contains(text(),'Withdraw Funds')]"));

		WebElement TransferFunds = driver.findElement(By.xpath("//ul[@class='services']/li/a[contains(text(),'Transfer Funds')]"));
		
		WebElement CheckBalances = driver.findElement(By.xpath("//ul[@class='services']/li/a[contains(text(),'Check Balances')]"));
		
		WebElement MakeDeposits = driver.findElement(By.xpath("//ul[@class='services']/li/a[contains(text(),'Make Deposits')]"));
		
		WebElement OnlineServicesLink = driver.findElement(By.xpath("//ul[@class='servicestwo']/li[contains(text(),'Online Services')]"));

		WebElement BillPay = driver.findElement(By.xpath("//ul[@class='servicestwo']/li/a[contains(text(),'Bill Pay')]"));
		
		WebElement AccountHistory = driver.findElement(By.xpath("//ul[@class='servicestwo']/li/a[contains(text(),'Account')]"));
		
		WebElement TransferFundsOnline = driver.findElement(By.xpath("//ul[@class='servicestwo']/li/a[contains(text(),'Transfer')]"));
		
		WebElement newsLinks = driver.findElement(By.xpath("//ul[@class='events']//li//a[contains(text(),'ParaBank Is Now Re-Opened')]"));

		WebElement LatestNewsDate = driver.findElement(By.xpath("//ul[@class='events']//li[@class='captionthree']"));

		WebElement BottomHome = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Home')]"));

		WebElement BottomAboutUs = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'About')]"));

		WebElement BottomServices = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Ser')]"));

		WebElement BottomProducts = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Pro')]"));

		WebElement BottomLocations = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Location')]"));

		WebElement BottomForum = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Forum')]"));

		WebElement BottomSiteMap = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Site')]"));

		WebElement BottomContactUs = driver.findElement(By.xpath("//div[@id='footerPanel']//a[contains(text(),'Contact')]"));

		WebElement BottomWebSiteLink = driver.findElement(By.xpath("//div[@id='footerPanel']//p"));

//		WebElement ReadMore = driver.findElement(By.xpath("//div//p[contains(text(),'Experience the difference')]"));
//		WebElement ReadMoreBottom = driver.findElement(By.xpath("//div//p[contains(text(),'Experience the difference')]"));




}
	
}

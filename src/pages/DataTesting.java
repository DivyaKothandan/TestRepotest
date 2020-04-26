package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTesting {
	
	WebDriver driver; //global variable
	@BeforeMethod
	public void openBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
	}

	@Test(dataProvider="getData")
	public void login(String username,String password) throws InterruptedException {
		WebElement LoginLink = driver.findElement(By.xpath("//*[@id='pt-login']/a"));
		LoginLink.click();

		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.id("wpName1"));
		userName.sendKeys(username);

		WebElement passWord = driver.findElement(By.id("wpPassword1"));
		passWord.sendKeys(password);


		WebElement LoginButton = driver.findElement(By.id("wpLoginAttempt"));
		LoginButton.click();
		
		if(driver.findElement(By.xpath("//*[@id='userloginForm']/form/div[1]")).isDisplayed()) {
			System.out.println("Test case failed");
		}
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object data[][] = new Object[3][2];
		
		//1st data set
		data[0][0]="DivyaKothandan";
		data[0][1]="SeleniumTesting";
		//2nd data set
		data[1][0]="Divya";
		data[1][1]="Selenium";
		//3rd data set
		data[2][0]="";
		data[2][1]="";
		return data;
		
		
	}
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}

}

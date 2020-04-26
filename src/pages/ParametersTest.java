package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	WebDriver driver; //global variable
	@Parameters({"url","browser"})
	@BeforeTest
	public void openBrowser(String url,String browser) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			}
		
	}

	@Parameters({"username","password"})
	@Test
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
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}

}

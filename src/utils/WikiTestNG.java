package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WikiTestNG {
	WebDriver driver; //global variable

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}

	@BeforeClass
	public void login() throws InterruptedException {
		WebElement LoginLink = driver.findElement(By.xpath("//*[@id='pt-login']/a"));
		LoginLink.click();

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("wpName1"));
		username.sendKeys("DivyaKothandan");

		WebElement password = driver.findElement(By.id("wpPassword1"));
		password.sendKeys("SeleniumTesting");


		WebElement LoginButton = driver.findElement(By.id("wpLoginAttempt"));
		LoginButton.click();
	}


	@Test
	public void title() {
		System.out.println(driver.getTitle());
	}
	@Test
	public void printUsername() {
		WebElement username = driver.findElement(By.xpath("//*[@id='pt-userpage']/a"));
		System.out.println(username.getText());
	}



	@AfterClass
	public void logout() {
		driver.findElement(By.xpath("//*[@id='pt-logout']/a")).click();
	}

	@AfterTest
	public void closeApplication() {
		driver.quit();
	}

}

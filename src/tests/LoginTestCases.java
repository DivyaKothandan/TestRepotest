package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginTestCases {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		LoginPage login = new LoginPage(driver);
		
		login.clickLoginTab();
		login.typeUserName();
		login.typePassword();
		login.loginSubmit();
		
		System.out.println("Login successful");
		
		
	}


}

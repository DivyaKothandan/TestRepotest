package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	// TODO Auto-generated method stub

	//Object storage
	//for each object repesctive action are created in seperate methods

	By LoginLink = By.xpath("//*[@id='pt-login']/a");
	By userName = By.id("wpName1");
	By passWord = By.id("wpPassword1");
	By submit = By.id("wpLoginAttempt");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickLoginTab() {
		driver.findElement(LoginLink).click();
	}

	public void typeUserName() {
		driver.findElement(userName).sendKeys("DivyaKothandan");
	}

	public void typePassword() {
		driver.findElement(passWord).sendKeys("SeleniumTesting");
	}

	public void loginSubmit() {
		driver.findElement(submit).click();
	}

	


}

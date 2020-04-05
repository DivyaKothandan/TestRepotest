package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	
	@BeforeSuite
	public void openNetwork() {
		System.out.println("openNetwork : BeforeSuite");
	}
	
	@BeforeClass
	public void lanuchBrowser() {
		System.out.println("Launch Browser : BeforeClass");
	}
	@BeforeTest
	public void launchURL() {
		System.out.println("launchURL : BeforeTest");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login : BeforeMethod");
	}
	

	
	@AfterSuite
	public void closeNetwork() {
		System.out.println("openNetwork : AfterSuite");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Launch Browser : AfterClass");
	}
	@AfterTest
	public void closeURL() {
		System.out.println("laucloseURL : AfterTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout : AfterMethod");
	}
	
	@Test
	public void search() {
		System.out.println("Search : Test1");
	}
	
	@Test
	public void cart() {
		System.out.println("search : cart");
	}
	@Test
	public void payment() {
		System.out.println("search : payment");
	}
	
}

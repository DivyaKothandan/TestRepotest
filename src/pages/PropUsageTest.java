package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropUsageTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    
	    File f = new File("C:\\Users\\Ramya\\Desktop\\Selenium\\TrainingWorkspace\\WikiPageObjectModel\\Resources\\env.properties");
	    FileInputStream fis = new FileInputStream(f);	    
	    Properties prop = new Properties();
	    prop.load(fis);
	    
	    
	    driver.get(prop.getProperty("url"));
	    

	}

}

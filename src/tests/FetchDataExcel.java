package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		File f = new File("C:\\Users\\Ramya\\Desktop\\TestDataFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//Workbook wb = new HSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Data");
		int rowCount = s.getLastRowNum() - s.getFirstRowNum();
		
		//System.out.println(rowCount+1);
		
		for(int i=0;i<rowCount+1;i++) {
			
			Row row = s.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				
				System.out.println(row.getCell(j).getStringCellValue());
				String searchTerm = row.getCell(j).getStringCellValue();
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.clear();
				searchBox.sendKeys(searchTerm);
				searchBox.sendKeys(Keys.ENTER);
				
				System.out.println(driver.getTitle());
				
				driver.navigate().back();
		
				
				
				
			}
		}
		
		

	}

}

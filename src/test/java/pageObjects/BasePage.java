package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class BasePage {

	 WebDriver driver ;
	 String path = ".\\testData\\data.xlsx";// taking xl file from testData
	 ExcelUtility xlutil = new ExcelUtility(path);

	
	public BasePage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
}

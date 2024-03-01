package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//*[@id='search']") // search Bar
	WebElement searchbar;

	@FindBy(xpath = "//*[@id='search_button']") // search button
	WebElement searchbutton;

	// search bookshelves
	public void search(String data) throws InterruptedException {
		searchbar.sendKeys(data);
		
	}
	
	// To click bookshelves
	public void click() {
		searchbutton.click();
	}

}

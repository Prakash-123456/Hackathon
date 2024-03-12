package pageObjects;


import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class BookShelvesPage extends BasePage {

	public BookShelvesPage(WebDriver driver) {
		super(driver);
	}

	
	//title of the page
	@FindBy(xpath = "(//span[@class='key'])[1]")
	WebElement title;  

	//alert
	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	public WebElement popup;

	//price slider
	@FindBy(xpath = "//li[@class='item'][2]")
	WebElement price_slider;
	
	//Slider button
	@FindBy(xpath = "//*[@class='noUi-handle noUi-handle-upper']")
	WebElement upper;

	//category button
	@FindBy(xpath = "//li[@class='item'][1]")
	WebElement category_dropDown;

	//Category checkbox
	@FindBy(xpath = "//input[@id='filters_primary_category_Kids_Bookshelves']")
	WebElement category_checkbox;

    //Exclude checkbox
	@FindBy(xpath = "//input[@id='filters_availability_In_Stock_Only']")
	WebElement stock_checkbox;

	//Dropdown
	@FindBy(xpath = "//div[@class='item']")
	WebElement filter;

	//Dropdown checkbox
	@FindBy(xpath = "//li[@data-key='price_desc']")
	WebElement hi_to_low;

	//Bookshelves name
	@FindBy(xpath = "//div[@class='product-info-block']//span[@itemprop]")
	List<WebElement> details_name;

	//Bookshelves Price
	@FindBy(xpath = "(//div[@class='product-info-block'])//div[@class='price-number']/span")
	List<WebElement> details_price;

	//Navigation button
	@FindBy(xpath = "//li[@class='topnav_item livingunit']/span")
	WebElement living_button;

	//Navigation -submenu
	@FindBy(xpath = "(//ul[@class='taxonslist'])[8]//span")
	List<WebElement> submenu;
	
	

	//verify title of the page
	public boolean verifyTitle() {
		String pagetitle=driver.getTitle();
		if(pagetitle.equalsIgnoreCase("Buy Furniture Online and Get up to 50% Off | Shop Now - Urban Ladder"))
		{
			return true;
		}
		return false;
		
	}
	
	// To Handle alert
	public void handle_alert() {
		BaseClass.explicitWait(driver,Duration.ofSeconds(10),popup);
		popup.click();
	}

	//To click kids category
	public void category_click() {
		BaseClass.explicitWait(driver,Duration.ofSeconds(10),category_dropDown);
		category_dropDown.click();
		category_checkbox.click();
	}

	//To slide the button till 14,000
	public void price_slider() throws InterruptedException {
		Actions act = new Actions(driver);
		BaseClass.explicitWait(driver,Duration.ofSeconds(10),price_slider);
		price_slider.click();
		Thread.sleep(2000);
		act.dragAndDropBy(upper, -272, 0).perform();
		Thread.sleep(2000);
		
	}

	//To click exclude_out_of_box button
	public void storage_checkbox() throws InterruptedException {
		BaseClass.explicitWait(driver,Duration.ofSeconds(10),stock_checkbox);
		stock_checkbox.click();
		Thread.sleep(2000);
	}

	//To select high_to_low
	public void sort_dropDown() throws InterruptedException {
		BaseClass.explicitWait(driver,Duration.ofSeconds(10),filter);
		filter.click();
		hi_to_low.click();
		//Thread.sleep(3000);

	}
   
	//To print the first 3 Bookshelves name and price in console
	public void print_BookshelvesData() throws InterruptedException {
		
		System.out.println("************* Display the Name and Price of :High to Low ************* ");
		for (int i = 0; i < 3; i++) {
			String name = details_name.get(i).getText();
			String price = details_price.get(i).getText();
			System.out.println("");
			System.out.println(name + " : " + price);
			Thread.sleep(6000);
		}
	}

	//To print the first 3 Bookshelves name and price in Excel
	public void print_BSExceldata() throws IOException, InterruptedException {
		for (int i = 0; i < 3; i++) {
			String name = details_name.get(i).getText();
			xlutil.setCellData("Sheet1", i, 0, name);
			String price = details_price.get(i).getText();
			xlutil.setCellData("Sheet1", i, 3, price);
			Thread.sleep(6000);
		}
		System.out.println(" ");
	}

	
	//To click the navigation button -"living"
	public void clickNavbutton() throws InterruptedException {
		living_button.click();
		Thread.sleep(2000);
	}

	//To print the subbmenu from living button in console and Excel
	public void printNavExceldata() throws IOException, InterruptedException {
		System.out.println("*************Display the Leaving Storage *************");
		for (int i = 0; i < submenu.size(); i++) {
			String item = submenu.get(i).getText();
			System.out.println(item);
			Thread.sleep(2000);

			xlutil.setCellData("Sheet1", i + 5, 0, item);
			System.out.println(" ");


		}
	}
}
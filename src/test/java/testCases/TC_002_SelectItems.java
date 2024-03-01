package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookShelvesPage;
import testBase.BaseClass;

public class TC_002_SelectItems extends BaseClass {

	@Test(priority = 1)
	public void selectCategory() {
		
		logger.info("*** Starting TC_002_Select Items***");
		logger.info("*** Selecting Category***");
		try {
			// BookShelvesPage
			BookShelvesPage BS = new BookShelvesPage(driver);
			BS.handle_alert();
			BS.category_click();
			Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println(e);
			logger.info(e);
			Assert.fail();
		}
	}

	
	@Test(priority = 2)
	public void select_price() throws InterruptedException {
		
		logger.info("*** Selecting price***");
		
			// BookShelvesPage
			BookShelvesPage BS = new BookShelvesPage(driver);
			BS.price_slider();
			Thread.sleep(2000);
		
	}

	
	@Test(priority = 3)
	public void clickStorageButton() throws InterruptedException {
	
		logger.info("*** Clicking Storage Button***");
		
			// BookShelvesPage
			BookShelvesPage BS = new BookShelvesPage(driver);

			BS.storage_checkbox();
		
	}

	
	@Test(priority = 4)
	public void select_filter() throws InterruptedException {
	
		logger.info("*** Selecting filter***");
		
			// BookShelvesPage
			BookShelvesPage BS = new BookShelvesPage(driver);
			BS.sort_dropDown();
			
	}

	
	@Test(priority = 5, dependsOnMethods = "select_filter")
	public void print_data() throws IOException, InterruptedException {
		
		logger.info("*** printing Bookshelves data in Excel and Console***");
		
			BookShelvesPage BS = new BookShelvesPage(driver);
			BS.print_BookshelvesData();
			Thread.sleep(2000);
			BS.print_BSExceldata();
			Thread.sleep(2000);
			
		}
	
	
	@Test(priority = 6)
	public void displayNavBar_items() throws IOException, InterruptedException {
		
		logger.info("*** Displaying Navbar items***");

			BookShelvesPage BS = new BookShelvesPage(driver);

			BS.clickNavbutton();
			Thread.sleep(6000);
		}
	

	
	@Test(priority = 7, dependsOnMethods="displayNavBar_items")
	public void printNavBar_items() throws IOException, InterruptedException {
		
		logger.info("*** Printing Navbar items***");
		
			BookShelvesPage BS = new BookShelvesPage(driver);
			BS.printNavExceldata();
			Thread.sleep(6000);
		
		logger.info("*** Completed TC_002_Select Items***");
	}
}

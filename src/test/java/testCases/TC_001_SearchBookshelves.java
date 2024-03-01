package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookShelvesPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_001_SearchBookshelves extends BaseClass {

	@Test(priority = 1, dataProvider = "search_data", dataProviderClass = DataProviders.class)
	public void search(String data) {

		logger.info("*** Starting TC_001_SearchBookshelves***");
		logger.info("*** Searching for Bookshelves***");
		try {
			HomePage HP = new HomePage(driver);
			HP.search(data);
			Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println(e);
			logger.info(e);
			Assert.fail();
		}
	}

	@Test(priority = 2)
	public void titleValidation() {

		logger.info("*** Searching for Bookshelves***");
		try {
			HomePage HP = new HomePage(driver);
			BookShelvesPage BS = new BookShelvesPage(driver);
			HP.click();
			Assert.assertEquals(BS.verifyTitle(), true);

		} catch (Exception e) {
			System.out.println(e);
			logger.info(e);
			Assert.fail();
		}
		logger.info("*** Completed TC_001_SearchBookshelves***");
	}

}

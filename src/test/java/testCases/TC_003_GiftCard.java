package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GiftCardPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_GiftCard extends BaseClass {

	@Test(priority = 1)
	public void displayGiftPage() {
		
		logger.info("*** Starting TC_003_Select Items***");
		logger.info("*** Displaying Gift items***");
		try {
			GiftCardPage GC = new GiftCardPage(driver);
			GC.gift_click();
			Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println(e);
			logger.info(e);
			Assert.fail();
		}
	}

	
	@Test(priority = 2)
	public void clickBirthday() {

		logger.info("*** Clicking Birthday Button***");
		try {
			GiftCardPage GC = new GiftCardPage(driver);
			GC.birthday();
			Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println(e);
			logger.info(e);
			Assert.fail();
		}
	}

	
	@Test(priority = 3)
	public void enterAmount_Date() throws InterruptedException {

		logger.info("*** Clicking Birthday Button***");
		
			GiftCardPage GC = new GiftCardPage(driver);
			GC.select_amount();
			GC.month_date();
		
	}

	
	@Test(priority = 4,dataProvider = "GiftCardData", dataProviderClass = DataProviders.class)
	public void enterDetails(String recipientName, String recipientMail, String recipientNum, String senderName,
			String senderMail, String senderNum, String senderAddress, String senderPin)
			throws InterruptedException, IOException {

		logger.info("*** Clicking Birthday Button***");
			GiftCardPage GC = new GiftCardPage(driver);
			GC.recipient_data(recipientName, recipientMail, recipientNum);
			GC.sender_data(senderName, senderMail, senderNum, senderAddress, senderPin);

			GC.validation();
			//Thread.sleep(2000);		
	}
		
	@Test(priority = 5, dataProvider = "crctData", dataProviderClass = DataProviders.class)
	public void verifyValidEmail(String rmail) throws InterruptedException, IOException {
		
		logger.info("***Verifying with Valid email **");
		
			GiftCardPage GC = new GiftCardPage(driver);
			GC.correct_mail(rmail);
			
		logger.info("*** Validating mail***");
			GC.To_validation();
			//Thread.sleep(2000);
			
	}
		@Test(priority = 6, dataProvider = "crctData_2", dataProviderClass = DataProviders.class)
		public void verifyValidEmail_2(String smail) throws InterruptedException {
			
			logger.info("***Verifying with Valid email **");
				GiftCardPage GC = new GiftCardPage(driver);
				GC.To_crct_mail(smail);
				Thread.sleep(2000);
				GC.clickConfirm();
				
				
		
		logger.info("*** Finished TC_003_Select Items***");
	}

}
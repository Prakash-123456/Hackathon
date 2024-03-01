package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GiftCardPage extends BasePage {
	public GiftCardPage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// GiftCards button in the searchPage
	@FindBy(xpath = "(//a[@class='featuredLinksBar__link'])[3]")
	WebElement gift;
	
	// GiftCards button in the HomePage - cucumber
	@FindBy(xpath = "(//a[text()=\"Gift Cards\"])[1]")
	public WebElement giftcard;

	// Birthday button
	@FindBy(xpath = "(//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb'])[3]")
	WebElement birthday_button;

	// gift amount
	@FindBy(xpath = "(//button[@class='HuPJS'])[1]")
	WebElement gift_amount;

	// month button
	@FindBy(xpath = "(//select[@class='Upz18 _1hLiD UJU2v'])[1]")
	WebElement month_button;

	// day button
	@FindBy(xpath = "(//select[@class='Upz18 _1hLiD UJU2v'])[2]")
	WebElement day_button;

	// next button
	@FindBy(xpath = "//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	WebElement next;

	// recipient_name textbox
	@FindBy(xpath = "//input[@id='ip_4036288348']")
	public WebElement recipient_name;

	// recipient_email textbox
	@FindBy(xpath = "//input[@id='ip_137656023']")
	public WebElement recipient_email;

	// recipient_mobile textbox
	@FindBy(xpath = "//input[@id='ip_3177473671']")
	public WebElement recipient_mobile;

	// Sender_name textbox
	@FindBy(xpath = "//input[@id='ip_1082986083']")
	public WebElement senderName;

	// Sender_mail textbox
	@FindBy(xpath = "//input[@id='ip_4081352456']")
	public WebElement senderEmail;

	// Sender_mobile textbox
	@FindBy(xpath = "//input[@id='ip_2121573464']")
	public WebElement senderMobile;

	// Sender_address textbox
	@FindBy(xpath = "//input[@id='ip_2194351474']")
	public WebElement senderAddress;

	// Sender_pincode textbox
	@FindBy(xpath = "//input[@id='ip_567727260']")
	public WebElement pincode;

	// Sender_confirm textbox
	@FindBy(xpath = "//button[@class='_3Hxyv _1fVSi action-button _1gIUf _1XfDi']")
	WebElement confirm;

	// invalid email error popup
	@FindBy(xpath = "//input[@id='ip_137656023']")
	WebElement Re_error;
	
	//To error msg
	@FindBy(xpath="//*[@id='ip_4081352456']")
	WebElement To_error;

	// To click gift button
	public void gift_click() throws InterruptedException {
		js.executeScript("arguments[0].click();", gift);
		Thread.sleep(2000);
	}

	// To click birthday button
	public void birthday() throws InterruptedException {
		js.executeScript("arguments[0].click();", birthday_button);
		Thread.sleep(2000);
	}

	// To select the amount
	public void select_amount() throws InterruptedException {
		gift_amount.click();
		Thread.sleep(2000);
	}

	// To select the month
	public void month_date() throws InterruptedException {
		Select sc = new Select(month_button);
		sc.selectByValue("4/2024");
		Select sa = new Select(day_button);
		sa.selectByValue("18");
		js.executeScript("arguments[0].click();", next);
		Thread.sleep(2000);
	}

	// To fill the recipient data
	public void recipient_data(String recipients_name, String recipients_mail, String recipients_number) {
		recipient_name.sendKeys(recipients_name);
		recipient_email.sendKeys(recipients_mail);
		recipient_mobile.sendKeys(recipients_number);

	}

	// To fill the sender data
	public void sender_data(String sender_name, String sender_mail, String sender_number, String sender_address,
			String pincodee) {
		senderName.sendKeys(sender_name);
		senderEmail.sendKeys(sender_mail);
		senderMobile.sendKeys(sender_number);
		senderAddress.sendKeys(sender_address);
		pincode.sendKeys(pincodee);
	}

	// Validating the mail
	public void validation() throws IOException, InterruptedException {
		confirm.click();
		Thread.sleep(1000);
		String error = Re_error.getAttribute("validationMessage");
		xlutil.setCellData("Sheet1", 16, 0, error);
		//Thread.sleep(2000);
		System.out.println("");
		System.out.println("************ Display the Recipients Error message ************");
		System.out.println(error);

	}

	// To fill the correct mail after validation
	public void correct_mail(String rMail) {
		recipient_email.clear();
		recipient_email.sendKeys(rMail);
		
	}
	
	public void To_validation() throws IOException, InterruptedException {
		confirm.click();
		Thread.sleep(1000);
		String error_2 = To_error.getAttribute("validationMessage");
		xlutil.setCellData("Sheet1", 17, 0, error_2);
		//Thread.sleep(2000);
		System.out.println("");
		System.out.println("************ Display the Your Error message ************");
		System.out.println(error_2);
		//Thread.sleep(2000);

	}
	
	public void To_crct_mail(String sMail) throws InterruptedException {
		senderEmail.clear();
		senderEmail.sendKeys(sMail);
   Thread.sleep(2000);
	}

	public void clickConfirm() throws InterruptedException {
		confirm.click();
		Thread.sleep(2000);
	}

}

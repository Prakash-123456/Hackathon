package stepDefinitions;


import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.BookShelvesPage;
import pageObjects.HomePage;
import factory.BaseClass;

public class SearchBooks {
	

	HomePage HP=new HomePage(BaseClass.getDriver());;
	BookShelvesPage BS = new BookShelvesPage(BaseClass.getDriver());

	@Given("the user is on the UrbanLadder Homepage")
	public void the_user_is_on_the_urban_ladder_homepage() throws InterruptedException  {
		
		BaseClass.getLogger().info("Searching for Bookshelves");
	
	}

	@When("the user enters the search text as {string}")
	public void the_user_enters_the_search_text(String search) throws InterruptedException {
		HP=new HomePage(BaseClass.getDriver());
		HP.search(search);
	}

	@When("clicks on the search button")
	public void the_user_clicks_on_the_search_button() {
		HP=new HomePage(BaseClass.getDriver());
		HP.click();
	}

	@Then("the user should be redirected to the BookShelves page")
	public void the_user_should_be_redirected_to_the_book_shelves_page() {
		
       try {
		Assert.assertEquals(BS.verifyTitle(), true);
       }catch(Exception e){
    	   BaseClass.getLogger().info(e);
       }
	}
}

Feature: Display Bookshelves

	Scenario: Search Bookshelves
		Given the user is on the UrbanLadder Homepage
		When the user enters the search text as "Bookshelves" 
		And clicks on the search button
		Then the user should be redirected to the BookShelves page
		
	Scenario: Apply filters	
		Given the user is on the Bookshelves page
		When user close the popup
		And select category and Price
		And the user click the exclude out of box check box 
		And sort by high to low
		Then top three Bookshelves data will be stored in excel
	
	Scenario: Print Navbar menu
	  Given the user is on the UrbanLadder Homepage
	  When the user clicks the living button in navbar
	  Then print the list of submenu under Living Storage Category in excel	
		
	
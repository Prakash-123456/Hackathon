*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Display Bookshelves (Hybrid Framework)

1. Search for "BookShelves" with price below Rs. 15000, Category any one (like Wall Shelves / Kid Bookshelves / Study Tables, etc) & exclude out of stock. Sort by price "High to Low", fetch the top 3 items & print all details in console output.

2. From Living, retrieve all items under any one of sub-menu items like "Seating & Chairs" or "Living Storage". Also print the same in console output.

3. Under "Gift cards", choose "Birthday/Anniversay"; Fill "Customize your gift card" with valid price & date and click "Next" button; Fill "To" & "From" details under "who is this lucky person" with any one email id invalid (example: without @ symbol) and click "Submit"; Capture & display the error message in console output. Then give valid email id & validate all the given details in the "Confirm Details" section. 


Key Automation Scope

1.Handling alert, drag & drop, search option
2.Extract menu items & store in collections
3.Navigating back to home page
4.Scrolling down in web page
5.Filling form (in different objects in web page)
6.Capture warning message
7.Explore the Innovative Implementations.
8.Implement Best practices such as creating Smoke and Regression suite.
9.Implement Maven on the created automation test scripts
10.Explore Jenkins to execute the test scripts periodically on Selenium Grid.
11.Explore Selenium Grid to run test scripts on different platforms and against different browsers.
12.Integrate Jenkins with version controller (GIT) and scheduled builds to run automatically.


**********************************************************STEPS TO EXECUTE*************************************************************

->unzip the folder
->On eclipse, go to file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
->Now go to the TestNG.xml file and run as TestNGSuite.
->Now the file will Execute and we get the expected output as shown below.
-> Now go to TestRunner.java file and run as JUnit test.
-> Now the file will Execute in Cucumber and we get the expected output as shown below.

*******************************************************FILES DESCRIPTION**************************************************************

1.src/test/java - There are Seven packages present in this folder.
->   PageObjects     : In this Package there are three files
      1)BasePage     : In this file we have implemeted pagefactory which has a Factory class to make using Page Objects simpler and easier and also used WebDriver constructor.
      2)HomePage  : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and methods for verifying the UrbanLadderHomePage page.
      3)BookShelvesPage : In this file we extends basePage.java and we included required action mentods and Webelements to get the desired result.
      4)GiftCards : In this file we extends basePage.java and we included required action mentods and Webelements to get the desired result.	
    
->   testBase        : In this Package we have BaseClass.java file in which we Firstly invoke the selected browser and we add steps like Opening the UrbanLadder page (https://www.urbanladder.com/) and closing the browser, We also added Grid Setup.
     
->   testCases       : In this package we have 3 files.
	
	1) TC_001_SearchBookshelves : Searching for BookShelves.
	2) TC_002_SelectItems : Select Kids BookShleves, select price range below 15,000, include out of stock and select High to Low range,Select living and print all the options available. 
	3) TC_003_giftCard : Selecting Giftcards and Customzing it, Entering invalid and valid details and checking for error message.

-> testRunner : In this package we have TestRun.java file where we include feature file path and cucumber plugins to generate cucumber report.
 
-> StepDefinitions : This package contains BookShelves.java,GiftCarsd.java,SearchBooks.java which contains the testSteps to execute the project in Cucumber and Hooks.java contains the driver setup , screenshots and Closing the browser.
 
-> factory : In this package we have BaseClassCucumber.java file in which we invoke the browser initialization, we also added logger and properties method to include logs and access config.properties file.
	
->   Utilities       : In this package we have ExcelUtility.java, ExtendReportManager.java,DataProviders.java,ExcelUtility.java file.


2.src/test/resources- In this folder, there are three files one is Config.properties file and other is log4j2.xml,Extent.properites file is used to store the reusable values such as apprl,browser name and user text etc. and log4j2.xml is used to generate log informations about the execution of test cases.

3.JRE System Library: In this File we have all dependencies of JAR.files.         

4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.TestNG Dependencies : In this file all the jar files required for TestNG is downloaded.

6.Logs: The log file is stored in this folder

7.Report: In this folder the Test-Report-YYYY.MM.DD.html is present which is the report of the project.

8.ScreenShots: The screenshots for each test case is available.

9.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

10.target: It is an empty folder
 
11.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

12. TestData: Excel file used for data driven testing. 
***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************

************* Display the Name and Price of :High to Low ************* 

Wall E Engineered Wood Kids Bookshelf In Silver Grey Colour : ₹14,256

Ochre Solid Wood Kids Bookshelf In Natural Colour : ₹9,975

Ochre Solid Wood Kids Bookshelf In Pink Colour : ₹9,975
 
*************Display the Leaving Storage *************
TV Units
 
Bookshelves
 
Shoe Racks
 
Prayer Units
 
Showcases
 
Wall Shelves
 
Entryway & Foyer
 
Room Divider
 
Living Room Sets
 

************ Display the Recipients Error message ************
Please include an '@' in the email address. 'naveen221gmail.com' is missing an '@'.

************ Display the Your Error message ************
Please include an '@' in the email address. 'mohan511gmail.com' is missing an '@'.

===============================================
Suite
Total tests run: 15, Passes: 15, Failures: 0, Skips: 0
===============================================


***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************
Scenario: Search Bookshelves                                 # FeatureFiles/DisplayBookshelve.feature:3
  Given the user is on the UrbanLadder Homepage              # stepDefinitions.SearchBooks.the_user_is_on_the_urban_ladder_homepage()

    Embedding Search Bookshelves [image/png 671499 bytes]

  When the user enters the search text as "Bookshelves"      # stepDefinitions.SearchBooks.the_user_enters_the_search_text(java.lang.String)

    Embedding Search Bookshelves [image/png 672632 bytes]

  And clicks on the search button                            # stepDefinitions.SearchBooks.the_user_clicks_on_the_search_button()

    Embedding Search Bookshelves [image/png 702192 bytes]

  Then the user should be redirected to the BookShelves page # stepDefinitions.SearchBooks.the_user_should_be_redirected_to_the_book_shelves_page()

    Embedding Search Bookshelves [image/png 710070 bytes]


Scenario: Apply filters                                   # FeatureFiles/DisplayBookshelve.feature:9
  Given the user is on the Bookshelves page               # stepDefinitions.BookShelves.the_user_is_on_the_bookshelves_page()

    Embedding Apply filters [image/png 579024 bytes]

  When user close the popup                               # stepDefinitions.BookShelves.user_close_the_popup()

    Embedding Apply filters [image/png 878729 bytes]

  And select category and Price                           # stepDefinitions.BookShelves.select_category_and_price()

    Embedding Apply filters [image/png 602695 bytes]

  And the user click the exclude out of box check box     # stepDefinitions.BookShelves.the_user_click_the_exclude_out_of_box_check_box()

    Embedding Apply filters [image/png 623998 bytes]

  And sort by high to low                                 # stepDefinitions.BookShelves.sort_by_high_to_low()

    Embedding Apply filters [image/png 382613 bytes]

************* Display the Name and Price of :High to Low ************* 

Ochre Solid Wood Kids Bookshelf In Natural Colour : ₹9,975

Ochre Solid Wood Kids Bookshelf In Natural Colour : ₹9,975

Ochre Solid Wood Kids Bookshelf In Pink Colour : ₹9,975
 
  Then top three Bookshelves data will be stored in excel # stepDefinitions.BookShelves.top_three_bookshelves_data_will_be_stored_in_excel()

    Embedding Apply filters [image/png 517723 bytes]


Scenario: Print Navbar menu                                             # FeatureFiles/DisplayBookshelve.feature:17
  Given the user is on the UrbanLadder Homepage                         # stepDefinitions.SearchBooks.the_user_is_on_the_urban_ladder_homepage()

    Embedding Print Navbar menu [image/png 738022 bytes]

  When the user clicks the living button in navbar                      # stepDefinitions.BookShelves.the_user_clicks_the_living_button_in_navbar()

    Embedding Print Navbar menu [image/png 544120 bytes]

*************Display the Leaving Storage *************
TV Units
 
Bookshelves
 
Shoe Racks
 
Prayer Units
 
Showcases
 
Wall Shelves
 
Entryway & Foyer
 
Room Divider
 
Living Room Sets
 
  Then print the list of submenu under Living Storage Category in excel # stepDefinitions.BookShelves.print_the_list_of_submenu_under_living_storage_category_in_excel()

    Embedding Print Navbar menu [image/png 475228 bytes]


Scenario: Send Gift Card                                                                      # FeatureFiles/SendGiftCard.feature:3
  Given the user is on the UrbanLadder Homepage                                               # stepDefinitions.SearchBooks.the_user_is_on_the_urban_ladder_homepage()

    Embedding Send Gift Card [image/png 665317 bytes]

  Then the user should be redirected to the GiftCard page after clicking the GiftCards button # stepDefinitions.GiftCards.the_user_should_be_redirected_to_the_gift_card_page_after_clicking_the_GiftCards_button()

    Embedding Send Gift Card [image/png 1164395 bytes]

  And the user have to choose Bithday/Anniversary button                                      # stepDefinitions.GiftCards.the_user_have_to_choose_bithday_anniversary_button()

    Embedding Send Gift Card [image/png 406662 bytes]

  And the user should select git amound and the delivery date                                 # stepDefinitions.GiftCards.the_user_should_select_git_amound_and_the_delivery_date()

    Embedding Send Gift Card [image/png 82647 bytes]

  And the user have to fill the sender details                                                # stepDefinitions.GiftCards.the_user_have_to_fill_the_sender_details()

    Embedding Send Gift Card [image/png 90206 bytes]

  And the user have to fill the receiver details                                              # stepDefinitions.GiftCards.the_user_have_to_fill_the_receiver_details()

    Embedding Send Gift Card [image/png 92771 bytes]


************ Display the Recipients Error message ************
Please include an '@' in the email address. 'naveen221gmail.com' is missing an '@'.
  When the user enters invalid email, error should be saved in excel                          # stepDefinitions.GiftCards.the_user_enters_invalid_email_it_should_validate()

    Embedding Send Gift Card [image/png 97115 bytes]

  And the user should enter Recipients_correct email                                          # stepDefinitions.GiftCards.the_user_should_enter_recipients_correct_email()

    Embedding Send Gift Card [image/png 94586 bytes]


************ Display the Your Error message ************
Please include an '@' in the email address. 'mohan511gmail.com' is missing an '@'.
  And the user enters invalid To_email, error should be saved in excel                        # stepDefinitions.GiftCards.the_user_enters_invalid_to_email_error_should_be_saved_in_excel()

    Embedding Send Gift Card [image/png 100589 bytes]

  And the user should enter To_correct email                                                  # stepDefinitions.GiftCards.the_user_should_enter_to_correct_email()

    Embedding Send Gift Card [image/png 93205 bytes]

  Then clicks the confirm button                                                              # stepDefinitions.GiftCards.clicks_the_confirm_button()

    Embedding Send Gift Card [image/png 99189 bytes]


┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/42c29815-1180-4915-a197-c9c1bd4db0b4 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘

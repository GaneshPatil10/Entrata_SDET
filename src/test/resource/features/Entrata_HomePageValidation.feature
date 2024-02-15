Feature: Entra Home Page
  

 	Scenario: Entra Home Page URL & Title Validation
    Given User is on Home Page
    Then Home page URL is displayed as "https://www.entrata.com/"
    Then Home page title is displayed as "Property Management Software | Entrata"
    
#@pause
  Scenario: Home Page Tabs & Options Validation
    Given User is on Home Page
    Then Verify Tabs Products, Solutions, Resources are displayed on page 
    Then Tabs count should be 3
    Then Verify Watch Demo buttons are displayed on home page  
    Then Verify Sign In button displayed on home page
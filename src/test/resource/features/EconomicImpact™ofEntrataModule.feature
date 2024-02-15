Feature: Economic Impact™ of Entrata feature
 
 	Background:
 		Given User is on Home Page
 		When cookie-consent-form is displayed then user should accept that
 		
  Scenario: Economic Impact™ of Entrata 
    When Learn More button should be displayed on Home page
    And User can click on Learn More button
    Then User redirect to the page "The Total Economic Impact™ of Entrata" 
    
    
    Scenario: Economic Impact™ of Entrata Form Validation
    When User can click on Learn More button
    Then form with all field is displayed 
    And First Name field should be displayed
    And Last Name field should be displayed
    And Email field should be displayed
    And Phone Number filed should be displayed
    And Company Name field should be displayed
    And Job Title field should be displayed
    And Unit Count field should be displayed
    And Download button should be displayed
    
    Scenario Outline: Economic Impact™ of Entrata Result successfully downloaded
    When User can click on Learn More button
    Then user enters <First Name>, <Last Name>, <Email>, <Phone Number>, <Company Name>, <Job Title>
    And user select Unit Count  
    And user click on Download button
    Then Thank you for downloading message should be reflected on page
    
    Examples:
    |First Name|Last Name|Email|Phone Number|Company Name|Job Title|
    |"Ganesh"|"Patil"|"Erganesh@gmail.com"|"+91-1234567890"|"QA-1"|"SDET-1"|
    |"Sanket"|"Jadhav"|"Ersanket@gmail.com"|"+91-103547890"|"QA-2"|"SDET-2"|
    #|"Suraj"|"Shinde"|"Ersuraj@gmail.com"|"+91-1134597890"|"QA-3"|"SDET-3"|
    #|"Shubham"|"Patel"|"Ershubham@gmail.com"|"+91-1234007890"|"QA-4"|"SDET-4"|
    
         
    
    



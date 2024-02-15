Feature: Entrata SignIn feature
 		 		
  Scenario: SignIn Page
  	Given User is on Home Page
 		When cookie-consent-form is displayed then user should accept that
    Given User clicks on Sign In option
    Then user redirect to sign in page
    When User clicks on Property Manager Login button
    Then user redirect to login page
    When user enters userName
    And user enters password
    And user clicks on Sign In button

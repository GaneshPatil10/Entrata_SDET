package org.stepDefinations;

import org.pages.EconomicImpactOfEntrataPage;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EconomicImpactOfEntrataStepDef {
	EconomicImpactOfEntrataPage eIE = new EconomicImpactOfEntrataPage(EntrataHomePageStepDef.driver);
	
	@When("cookie-consent-form is displayed then user should accept that")
	public void cookie_consent_form_is_displayed_then_user_should_accept_that() {
		eIE.cookieAlertAccept();
	}
	@When("Learn More button should be displayed on Home page")
	public void learn_more_button_should_be_displayed_on_home_page() {
		Assert.assertTrue(eIE.learnMoreBtnIsDisplayed());
	}

	@When("User can click on Learn More button")
	public void user_can_click_on_learn_more_button() {
		eIE.clickOnLearnMoreBtn();
		System.out.println("User successfully clicked on Learn More Button");
	}

	@Then("User redirect to the page {string}")
	public void user_redirect_to_the_page(String expText) {
	    String actText = eIE.userRedirectToTotalEcoImpactPage();
		Assert.assertEquals(actText, expText, "user is not redirected to the- The Total Economic Impact™ of Entrata Page ");
	}

	@Then("form with all field is displayed")
	public void form_with_all_field_is_displayed() {
		Assert.assertTrue(eIE.formIsDisplayed());
	}

	@Then("First Name field should be displayed")
	public void first_name_field_should_be_displayed() {
		Assert.assertTrue(eIE.firstNameFieldIsDisplayed());
	}

	@Then("Last Name field should be displayed")
	public void last_name_field_should_be_displayed() {
		Assert.assertTrue(eIE.lastNameFieldIsDisplayed());
	}

	@Then("Email field should be displayed")
	public void email_field_should_be_displayed() {
		Assert.assertTrue(eIE.emailFieldIsDisplayed());
	}

	@Then("Phone Number filed should be displayed")
	public void phone_number_filed_should_be_displayed() {
		Assert.assertTrue(eIE.phoneNumFieldIsDisplayed());
	}

	@Then("Company Name field should be displayed")
	public void company_name_field_should_be_displayed() {
		Assert.assertTrue(eIE.companyNameFieldIsDisplayed());
	}

	@Then("Job Title field should be displayed")
	public void job_title_field_should_be_displayed() {
		Assert.assertTrue(eIE.jobTitleFieldIsDisplayed());
	}

	@Then("Unit Count field should be displayed")
	public void unit_count_field_should_be_displayed() {
		Assert.assertTrue(eIE.unitCountDropdownIsDisplayed());
	}

	@Then("Download button should be displayed")
	public void download_button_should_be_displayed() {
		Assert.assertTrue(eIE.downloadBttnIsDisplayed());
	}
	
	
	@Then("user enters {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters(String fName, String lName, String email, String phoneNum, String compName, String jobTitle) {
	    eIE.userEntersFirstName(fName, lName, email, phoneNum, compName, jobTitle);
	}

	@When("user select Unit Count")
	public void user_select_unit_count() {
		eIE.selectfromUnitCountDropdown();
	}

	@When("user click on Download button")
	public void user_click_on_download_button() {
		eIE.clickOndownloadBttn();
	}

	@Then("Thank you for downloading message should be reflected on page")
	public void message_should_be_reflected_on_page() {
	    eIE.userRedirectToThankYouMsg();
	}
}

package org.stepDefinations;

import org.pages.EntrataSignInPage;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EntrataSignInStepDef {
	EntrataSignInPage sp = new EntrataSignInPage(EntrataHomePageStepDef.driver);
	
	@Given("User clicks on Sign In option")
	public void user_clicks_on_sign_in_option() {
		sp.clickOnSignInOpt();
	}

	@Then("user redirect to sign in page")
	public void user_redirect_to_sign_in_page() {
		Assert.assertTrue(sp.redirectToSignInPage(), "User is not redirected to Sign In Page");
	    
	}

	@When("User clicks on Property Manager Login button")
	public void user_clicks_on_property_manager_login_button() {
	    sp.clickOnPropManLogInopt();
	}

	@Then("user redirect to login page")
	public void user_redirect_to_login_page() {
		Assert.assertTrue(sp.redirectToLoginPage(), "User is not redirected to Login Page");
	}

	@When("user enters userName")
	public void user_enters_user_name() {
	    sp.senduName();
	}

	@When("user enters password")
	public void user_enters_password() {
	    sp.sendPwd();
	}

	@When("user clicks on Sign In button")
	public void user_clicks_on_sign_in_button() {
	    sp.clickOnSignInBtn();
	}
}

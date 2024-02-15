package org.stepDefinations;
import java.util.Properties;

import org.applicationHooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.pages.EntrataHomePage;
import org.testng.Assert;
import org.utilities.BaseUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EntrataHomePageStepDef {
	public static WebDriver driver;
	public static Properties prop;
	public static BaseUtility bu;
	EntrataHomePage hp;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = AppHooks.driver;
		prop = AppHooks.prop;
		bu = AppHooks.bu;
		hp = new EntrataHomePage(driver);
	}

	@Then("Home page URL is displayed as {string}")
	public void home_page_url_is_displayed_as(String expURL) {
		hp = new EntrataHomePage(driver);
		String actURL = hp.getHomePageURL();
		System.out.println("actURL="+actURL);
		Assert.assertEquals(actURL, expURL);
	}

	@Then("Home page title is displayed as {string}")
	public void home_page_title_is_displayed_as(String expTitle) {
		hp = new EntrataHomePage(driver);
		String actTitle = hp.getHomePageTitle();
		System.out.println("actTitle="+actTitle);
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Then("Verify Tabs Products, Solutions, Resources are displayed on page")
	public void verify_tabs_products_solutions_resources_are_displayed_on_page() {
		hp = new EntrataHomePage(driver);
		Assert.assertTrue(hp.tabsAreDisplayed(), "All tabs are not displayed on home page");
	}

	@Then("Tabs count should be {int}")
	public void tabs_count_should_be(Integer actTabCount) {
		hp = new EntrataHomePage(driver);
		int expTabCount = hp.getHomePageTabsCount();
		Assert.assertTrue(actTabCount==expTabCount);
	}

	@Then("Verify Watch Demo buttons are displayed on home page")
	public void verify_watch_demo_buttons_are_displayed_on_home_page() {
		hp = new EntrataHomePage(driver);
		Assert.assertTrue(hp.demoButtonIsDisplayed());
	}

	@Then("Verify Sign In button displayed on home page")
	public void verify_sign_in_button_displayed_on_home_page() {
		hp = new EntrataHomePage(driver);
		Assert.assertTrue(hp.signInBtnIsDisplayed());
	}
}

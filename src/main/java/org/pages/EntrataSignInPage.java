package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class EntrataSignInPage {
	private WebDriver driver;
	BaseUtility bu = new BaseUtility();
	
	@FindBy(css=".button-default.outline-dark-button")
	private WebElement signInOpt;
	
	@FindBy(xpath="//*[@title='Client Login Button']")
	private WebElement PropManLogInopt;
	
	@FindBy(id="entrata-username")
	private WebElement uNameField;
	
	@FindBy(id="entrata-password")
	private WebElement pwdField;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement signInBtn;
	
	public EntrataSignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInOpt() {
		signInOpt.click();
	}
	
	public boolean redirectToSignInPage() {
		if(bu.waitForURLContains(driver, 10, "sign-in")) {
			System.out.println("User is on Sign In Page");
			return true;
		}else {
			return false;
		}
	}
	
	public void clickOnPropManLogInopt() {
		PropManLogInopt.click();
	}
	
	public boolean redirectToLoginPage() {
		if(bu.waitForURLContains(driver, 10, "login")) {
			System.out.println("User is on Login Page");
			return true;
		}else {
			return false;
		}
	}
	
	public void senduName() {
		uNameField.sendKeys("ABC");
	}
	
	public void sendPwd() {
		pwdField.sendKeys("12345678");
	}
	
	public void clickOnSignInBtn() {
		signInBtn.click();
	}
	
	
}

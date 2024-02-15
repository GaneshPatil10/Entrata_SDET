package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class EconomicImpactOfEntrataPage {
	private WebDriver driver;
	BaseUtility bu = new BaseUtility();
	
	@FindBy(css="#rcc-confirm-button")
	private WebElement cookiesAccept;

	@FindBy(xpath="//*[@title='TEI Study Button']")
	private WebElement learnMoreBtn;

	@FindBy(xpath="//div[@class='mktoText']//div[text()='The Total Economic Impact™ of Entrata']")
	private WebElement totalEcoImpactPage;

	@FindBy(xpath="(//form[@class='mktoForm mktoHasWidth mktoLayoutLeft'])[1]")
	private WebElement form;

	@FindBy(css="#FirstName")
	private WebElement firstNameField;

	@FindBy(css="#LastName")
	private WebElement lastNameField;

	@FindBy(css="#Email")
	private WebElement emailField;

	@FindBy(css="#Phone")
	private WebElement phoneNumField;

	@FindBy(css="#Company")
	private WebElement companyNameField;

	@FindBy(css="#Title")
	private WebElement jobTitleField;

	@FindBy(css="#Unit_Count__c")
	private WebElement unitCountDropdown;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement downloadBttn;

	@FindBy(xpath="//div[@id='Banner_Title']//div")
	private WebElement thankYouMsgDisplayed;


	public EconomicImpactOfEntrataPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public void cookieAlertAccept() {
		
		if(cookiesAccept.isDisplayed()) {
			cookiesAccept.click();
		}else {
			System.out.println("Cookies Window is not displayed");
		}
	}

	public boolean learnMoreBtnIsDisplayed() {
		return learnMoreBtn.isDisplayed();
	}

	public void clickOnLearnMoreBtn() {
		bu.waitForElementToBeClickable(driver, 10, learnMoreBtn);
		bu.clickByJS(driver, learnMoreBtn);
	}

	public String userRedirectToTotalEcoImpactPage() {
		return totalEcoImpactPage.getText();
	}

	public boolean formIsDisplayed() {
		return form.isDisplayed();
	}

	public boolean firstNameFieldIsDisplayed() {
		return firstNameField.isDisplayed();
	}

	public boolean lastNameFieldIsDisplayed() {
		return lastNameField.isDisplayed();
	}

	public boolean emailFieldIsDisplayed() {
		return emailField.isDisplayed();
	}

	public boolean phoneNumFieldIsDisplayed() {
		return phoneNumField.isDisplayed();
	}

	public boolean companyNameFieldIsDisplayed() {
		return companyNameField.isDisplayed();
	}

	public boolean jobTitleFieldIsDisplayed() {
		return jobTitleField.isDisplayed();
	}

	public boolean unitCountDropdownIsDisplayed() {
		return unitCountDropdown.isDisplayed();
	}

	public boolean downloadBttnIsDisplayed() {
		return downloadBttn.isDisplayed();
	}


	public void userEntersFirstName(String fName, String lName, String email, String phoneNum, String compName, String jobTitle) {
		firstNameField.sendKeys(fName);
		lastNameField.sendKeys(lName);
		emailField.sendKeys(email);
		phoneNumField.sendKeys(phoneNum);
		companyNameField.sendKeys(compName);
		jobTitleField.sendKeys(jobTitle);
	}
	
	public void selectfromUnitCountDropdown() {
		Select sel = new Select(unitCountDropdown);
		sel.selectByIndex(1);
	}
	
	public void clickOndownloadBttn() {
		downloadBttn.click();
	}
	
	public boolean userRedirectToThankYouMsg() {
		bu.waitForVisibiltyOfElementLocated(driver, 10, "xpath", "//div[@id='Banner_Title']//div");
		return thankYouMsgDisplayed.isDisplayed();
	}

}

package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EntrataHomePage {
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='header-nav-item']//*[@class='main-nav-link']")
	private List<WebElement> Tabs;
	
	@FindAll({@FindBy(xpath="//div[@class='header-desktop-buttons hide-on-mobile']//a[text()='Watch Demo']"),
		@FindBy(xpath="(//div[@class='button-holder']//a[text()='Watch Demo'])[1]")})
	private List<WebElement> DemoButtons;
	
	@FindBy(css=".button-default.outline-dark-button")
	private WebElement signInBtn;
	
	public EntrataHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageURL() {
		return driver.getCurrentUrl();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean tabsAreDisplayed() {
		for(WebElement ele : Tabs) {
			return ele.isDisplayed();
		}
		return false;
	}
	
	public int getHomePageTabsCount()
	{
		return Tabs.size();
	}
	
	public boolean demoButtonIsDisplayed() {
		for(WebElement ele : DemoButtons) {
			return ele.isDisplayed();
		}
		return false;
	}
	
	
	public boolean signInBtnIsDisplayed() {
		return signInBtn.isDisplayed();
	}
	
}

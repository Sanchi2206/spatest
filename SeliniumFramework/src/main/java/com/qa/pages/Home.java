package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Home extends TestBase
{
	@FindBy (xpath="//td[contains(text(),'User: Sanchi Rai')]")
	WebElement usernameLabel;
	
	@FindBy (xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;

	
	@FindBy (xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy (xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	
	public Home() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateHomePageTitle() 
	{
		return driver.getTitle();
	}
	
	public Contact ClickonContact() {
		contactslink.click();
		return new Contact();
	}
	
	public Deals ClickonDeals() {
		dealslink.click();
		return new Deals();
	}
	
	public Tasks ClickonTasks() {
		taskslink.click();
		return new Tasks();
	}
	
	
	public boolean verifycorrectUsername() {
		return usernameLabel.isDisplayed();
	}
}




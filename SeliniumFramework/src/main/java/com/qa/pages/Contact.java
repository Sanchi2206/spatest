package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Contact extends TestBase{

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	
	
	public Contact() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ContactlabelDispalyed() {
		return ContactsLabel.isDisplayed();
		
	}
}

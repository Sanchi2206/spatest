package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
public class Login extends TestBase{

	@FindBy (name = "username")
	WebElement username;
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy (xpath="//input[@class='btn btn-small']")
	WebElement loginbtn;
	
	@FindBy (xpath="//input[contains(text(),'Sign Up')]")
	WebElement signupbtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement CRMLogo;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	public String ValidateLoginPageTitle() {
	return	driver.getTitle();
	}
	
	public boolean ValidCRMImage() {
		return CRMLogo.isDisplayed();
	}
	
	public Home ValidLogin(String usr, String pwd) {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));	
//		if(driver.findElement(By.id("preloader")).isDisplayed())
//		{    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
//		}		
		username.sendKeys(usr);
		password.sendKeys(pwd);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		loginbtn.click();
		return new Home();
	}
}

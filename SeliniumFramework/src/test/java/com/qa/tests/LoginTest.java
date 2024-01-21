package com.qa.tests;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Login;

public class LoginTest extends TestBase
{
	Login login;
	

	@BeforeMethod
	public void BeforeTestExecution() {
		init();
		login=new Login();

	}
	@Test 
	public void getTitle() {
	 String title=login.ValidateLoginPageTitle();
	 Assert.assertEquals(true, title.contains("Free CRM"));
	}
	@Test
public void getCRMLogo() {
	boolean logo=login.ValidCRMImage();
	Assert.assertEquals(true,logo);
}
	@Test
	public void validateLogin() {
		login.ValidLogin(prop.getProperty("username"), prop.getProperty("pass"));
		
	}
	
	@AfterMethod
public void AfterTestExecution() {
		driver.quit();
	}
	
	
}

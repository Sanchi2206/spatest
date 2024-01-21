package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Home;
import com.qa.pages.Login;
import com.qa.util.Util;

public class HomeTest extends TestBase{
 
	Login login;
	Home home;
	Util util;
	
	@BeforeMethod
	public void BeforeTestExecution() {
		init();
	
		 login=new Login();
		 home =login.ValidLogin(prop.getProperty("username"), prop.getProperty("pass"));
		 
	}
	
	@Test (priority = 1)
	public void verifyHomePageTitle() {
		
	String HomePageTitle =home.ValidateHomePageTitle();
		Assert.assertEquals(HomePageTitle, "CRMPRO");
		
	}
	
	@Test (priority = 2)
	
	public void VerifyusernameTest() {
		util.switchtomethod();
	boolean username=	home.verifycorrectUsername();
	Assert.assertTrue(username);
	}
	
	@Test (priority = 3)

	public void ClickonContactsPage() {
		util.switchtomethod();
		home.ClickonContact();
	}
		 
		 @AfterMethod
		 public void Teardown() 
		 {
			 driver.quit();
		 }

	

	
}

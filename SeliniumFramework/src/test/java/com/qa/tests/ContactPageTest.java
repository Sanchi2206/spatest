package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Contact;
import com.qa.pages.Home;
import com.qa.pages.Login;
import com.qa.util.Util;

public class ContactPageTest extends TestBase{

	Login login;
	Home home;
	Contact contact;
	Util util;
	
	@BeforeMethod
	public void BeforeTestExecution() {
		init();
		login=new Login();
		home=login.ValidLogin(prop.getProperty("username"), prop.getProperty("pass"));
		home=new Home();
		util=new Util();
		util.switchtomethod();
		contact=home.ClickonContact();
	}
	
	@Test
	public void VerifyContactlabel() {
		boolean Contactlabel=contact.ContactlabelDispalyed();
		Assert.assertEquals(true, Contactlabel);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}

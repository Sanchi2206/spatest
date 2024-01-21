package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase()  {
		prop=new Properties();
		FileInputStream fi;
		try {
			fi = new FileInputStream("src/main/java/com/qa/config/Config.properties");
		
		
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void init() {
	
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
			driver=new ChromeDriver();
		}
		else 
			if(browser.equalsIgnoreCase("ff")) {
				System.setProperty("webdriver.firefox.driver", "Driver/firefoxdriver");
				driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Integer.parseInt(prop.getProperty("Pageload"));
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("Pageload")),TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("ImplicitWait")), TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
}

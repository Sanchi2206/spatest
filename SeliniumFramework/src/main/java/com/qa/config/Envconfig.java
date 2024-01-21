package com.qa.config;

public class Envconfig {

	String username;
	String password;
	String browser;
	String headless;
	public String getHeadless() {
		return headless;
	}
	public void setHeadless(String headless) {
		this.headless = headless;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

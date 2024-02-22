package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
	/*
	 * constructor
	 */
public WelcomePage(WebDriver driver) {
	super(driver);}
	
	/*
}
	 * storing web element
	 */
	@FindBy(partialLinkText = "Log in")
	WebElement loginlink;
	@FindBy(partialLinkText = "Register")
	WebElement Registerlink;
	
	public void clicklogin() {
		loginlink.click();
	}
	
	public void RegisterPage() {
		Registerlink.click();
	}
	
	
	}

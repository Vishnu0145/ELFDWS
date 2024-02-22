package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	 public LoginPage(WebDriver driver) 
	 {
		 super(driver);	
	}
	 

	
	
	@FindBy(id = "Email")
	WebElement EmailTextFeild;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement PasswordTextFeild;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement LoginButton;
	
	@FindBy(className = "ico-logout")
	WebElement Logoutlink;

	public void LoggedinPage(String email,String Password) {
		
		EmailTextFeild.sendKeys(email);
		PasswordTextFeild.sendKeys(Password);
		LoginButton.click();
	}
	
	public void logout() {
		Logoutlink.click();
	}


}

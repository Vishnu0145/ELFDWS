package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	WebElement MaleRadio;
	
	@FindBy(id ="gender-female")
	WebElement FemaleRadio;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement FirstNameTextFeild;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement LastNameTextFeild;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement EmailTextFeild;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement PasswordTextFeild;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement ConfirmPasswordTextfeild;
	
	@FindBy(id = "register-button")
	WebElement registerbuttonsubmit;
	
	@FindBy(xpath = "//div[@class='header-logo']")
	WebElement HomeImg;
	
//	public void selectGenderRadioButton(String Gender)
//	{
//		if (Gender=="Male") {
//			MaleRadio.click();
//		}
//		else if (Gender=="Female") {
//			FemaleRadio.click();
//		}
//		else {
//			System.out.println("Invalid selection of Radio");
//			}
//		
//		registerbuttonsubmit.click();
//
//		}
//		


	
	public void FillRegisterPage(String FirstName,String LastName,String Email,String Password,String ConfirmPassword,String Gender){

		FirstNameTextFeild.sendKeys(FirstName);
		LastNameTextFeild.sendKeys(LastName);
		EmailTextFeild.sendKeys(Email);
		PasswordTextFeild.sendKeys(Password);
		ConfirmPasswordTextfeild.sendKeys(ConfirmPassword);
		if (Gender.equalsIgnoreCase("Male")) {
			MaleRadio.click();
		}
		else if (Gender.equalsIgnoreCase("Female")) {
			FemaleRadio.click();
		}
		
		registerbuttonsubmit.click();
		}

		

	}
	


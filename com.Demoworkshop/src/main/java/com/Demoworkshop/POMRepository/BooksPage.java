package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{
	public BooksPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text()='Computing and Internet']/parent::h2/..//input")
	private WebElement ComputingInternetaddtoCartButton;
	
	
	@FindBy(xpath = "")
	private WebElement ShoppingCartLinkafterAddingProducttoCart;
	
	
}

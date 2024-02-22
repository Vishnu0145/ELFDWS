package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "removefromcart")
	WebElement _1stRemoveCartCheckBox;
	
	@FindBy(className = "product-name")
	WebElement _1stCartProductName;
	
	@FindBy(className = "product-unit-price")
	WebElement _1stCartProductPrice;
	
	@FindBy(className = "product-subtotal")
	WebElement _1stCartProductSubTotal;
	
	@FindBy(className = "qty-input")
	WebElement _1stCartProductQuantityTxtFld;
	
	@FindBy(name = "updatecart")
	WebElement updateCartBtn;
	
	public void removeFromCart() {
		_1stRemoveCartCheckBox.click();
		updateCartBtn.click();
	}
	
	public String getProductName() {
		return _1stCartProductName.getText();
	}
	
	public String get1stProductName() {
		return _1stCartProductName.getText();
	}
	
	public String get1stProductPrice() {
		return _1stCartProductPrice.getText();
	}
	public String get1stProductSubTotal() {
		return _1stCartProductSubTotal.getText();
	}
	public String get1stProductQuantityTxtFld() {
		return _1stCartProductQuantityTxtFld.getText();
	}
	public void change1stProductQuantity(String qty) {
		_1stCartProductQuantityTxtFld.clear();
		_1stCartProductQuantityTxtFld.sendKeys(qty);
		updateCartBtn.click();		
	}
}


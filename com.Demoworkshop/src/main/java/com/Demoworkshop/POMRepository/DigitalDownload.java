package com.Demoworkshop.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class DigitalDownload extends BasePage {
	public DigitalDownload(WebDriver driver){
		super(driver);
	}
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement DigitalLink;
	@FindBy(xpath = "//h2[@class='product-title']//a[text()='3rd Album']")
	private WebElement AlbumProductIcon;
	@FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement ShoppingCartLink;
	@FindBy(xpath = "//div[@class='name' ]//a[text()='3rd Album']")
	private WebElement ProductTitle;
	@FindBy(xpath = "//div[@class='header-menu']//a[@href='/books']")
	private WebElement Bookslink;
	@FindBy(xpath = "//h2[@class='product-title']//a[text()='Fiction']")
	private WebElement FictionProduct;
	@FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
	private WebElement AddToCartButton1;
	@FindBy(xpath = "//h1[@itemprop='name']")
	private WebElement ProductTitle2;
	@FindBy(xpath = "(//tr[@class='cart-item-row']/td[@class='remove-from-cart']/input)[1]")
	private WebElement RemoveFromCartCheckbox1;
	@FindBy(xpath = "(//tr[@class='cart-item-row']/td[@class='remove-from-cart']/input)[2]")
	private WebElement RemoveFromCartCheckbox2;
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement UpdateShoppingCartButton;
	@FindBy(xpath = "//input[@name='continueshopping']")
	private WebElement ContinueShopping;
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement TermsCheckbox;
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement CheckoutButton;
	
	
	
	public WebElement getDigitalLink() {
		return DigitalLink;
	}
	public WebElement getAlbumProductIcon() {
		return AlbumProductIcon;
	}
	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}
	public WebElement getProductTitle() {
		return ProductTitle;
	}
	
	public WebElement getBookslink() {
		return Bookslink;
	}
	public WebElement getFictionProduct() {
		return FictionProduct;
	}
	public WebElement getAddToCartButton1() {
		return AddToCartButton1;
	}
	public WebElement getProductTitle2() {
		return ProductTitle2;
	}
	public WebElement getRemoveFromCartCheckbox1() {
		return RemoveFromCartCheckbox1;
	}
	public WebElement getRemoveFromCartCheckbox2() {
		return RemoveFromCartCheckbox2;
	}
		public WebElement getUpdateShoppingCartButton() {
		return UpdateShoppingCartButton;
	}
	public WebElement getContinueShopping() {
		return ContinueShopping;
	}
	public WebElement getTermsCheckbox() {
		return TermsCheckbox;
	}
	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}
	public void addAlbumProduct() throws InterruptedException {
		DigitalLink.click();
		AlbumProductIcon.click();
		System.out.println(ProductTitle.getText());
		AddToCartButton.click();
		Thread.sleep(3000);
		ShoppingCartLink.click();
		Bookslink.click();
		FictionProduct.click();
		System.out.println(ProductTitle2.getText());
		AddToCartButton1.click();
		Thread.sleep(3000);
		ShoppingCartLink.click();
		Thread.sleep(3000);
		RemoveFromCartCheckbox2.click();
		UpdateShoppingCartButton.click();
		TermsCheckbox.click();
		CheckoutButton.click();
	}
	
}

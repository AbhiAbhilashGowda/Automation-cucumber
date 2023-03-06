package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPage {
	
public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//span[@class='caret']")    
	public static WebElement myAccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	public static WebElement login;
	
	@FindBy(xpath = "//input[@id='input-email']")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	public static WebElement loginButton;
	
	@FindBy(xpath = "//a[normalize-space()='Account']")
	public static WebElement loginSuccess;
	
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	public static WebElement wishList;
	
	@FindBy(xpath = "//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	public static WebElement shoppingCart;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	public static WebElement logout;
	

}

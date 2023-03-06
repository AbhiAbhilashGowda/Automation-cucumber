package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class YourStorePage {
	
	public YourStorePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Your Store']")
	public static WebElement yourStore;
	
	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	public static WebElement desktop;
	@FindBy(xpath = "//a[normalize-space()='Show All Desktops']")
	public static WebElement showAllDesktop;
	
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	public static WebElement lappyAndNote;
	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	public static WebElement showAllLappy;
	
	@FindBy(xpath = "//a[normalize-space()='Components']")
	public static WebElement components;
	@FindBy(xpath = "//a[normalize-space()='Show All Components']")
	public static WebElement showAllComponents;

	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	public static WebElement tablets;
	
	@FindBy(xpath = "//a[normalize-space()='Software']")
	public static WebElement software;
	
	@FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
	public static WebElement phones;
	
	@FindBy(xpath = "//a[normalize-space()='Cameras']")
	public static WebElement camera;
	
	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	public static WebElement players;
	@FindBy(xpath = "//a[normalize-space()='Show All MP3 Players']")
	public static WebElement showAllPlayers;
	
}

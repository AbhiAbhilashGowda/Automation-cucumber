package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class ScenarioAPage {
	
public ScenarioAPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//button[@id='gh-shop-a']")
	public static WebElement shopByCategory;
	
	@FindBy(xpath = "(//a[normalize-space()='Cell phones & accessories'])[1]")
	public static WebElement cellPhoneAndAccessories;
	
	@FindBy(xpath = "//a[contains(text(),'Cell Phones & Smartphones')]")
	public static WebElement smartPhones;
	
	@FindBy(xpath = "//div[@id='mainContent']//div//section[1]//div[1]//div[2]//button[1]//span[1]")
	public static WebElement seeAll;
	
	@FindBy(xpath = "//span[normalize-space()='Screen Size']")
	public static WebElement screenSize;
	
	@FindBy(xpath = "//span[contains(text(),'4.0 - 4.4 in')]")
	public static WebElement size1;
	
	@FindBy(xpath = "//span[contains(text(),'4.5 - 4.9 in')]")
	public static WebElement size2;
	
	@FindBy(xpath = "//span[contains(text(),'5.0 - 5.4 in')]")
	public static WebElement size3;
	
	@FindBy(xpath = "//span[contains(text(),'5.5 - 5.9 in')]")
	public static WebElement size4;
	
	@FindBy(xpath = "//span[contains(text(),'6 in or More')]")
	public static WebElement size5;
	
	@FindBy(xpath = "//span[contains(@class,'cbx x-refine__multi-select-cbx')][normalize-space()='Not Specified']")
	public static WebElement size6;
	
	@FindBy(xpath = "//button[normalize-space()='Apply']")
	public static WebElement applyFilter;
	
	@FindBy(xpath = "//span[@class='b-pageheader__text']")
	public static WebElement filterSuccess;

}

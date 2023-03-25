package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class ScenarioBPage {
	
public ScenarioBPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='gh-ac']")
	public static WebElement searchString;
	
	@FindBy(xpath = "//input[@id='gh-btn']")
	public static WebElement searchApply;
	
	@FindBy(xpath = "//h1[@class='srp-controls__count-heading']")
	public static WebElement searchSuccess;
	
}

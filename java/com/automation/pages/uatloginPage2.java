package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class uatloginPage2 {
	
public uatloginPage2() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
	public static WebElement clickonlogin;
	
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public static WebElement emailid;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public static WebElement invalidemailid;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement invalidpassword;
	
	@FindBy(xpath = "//p[@class='warning-tittle mb-0']")
	public static WebElement verifyerrormessage;
	
	
}

package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.LoginPage;

import cucumber.api.java.en.Then;

public class Logout {
	LoginPage logPage = new LoginPage();
	
	@Then("^I click on Logout$")
	public void i_click_on_Logout() {
		
		Elements.click(LoginPage.logout);
		System.out.println("Logout Successful");
		
	}
	
}

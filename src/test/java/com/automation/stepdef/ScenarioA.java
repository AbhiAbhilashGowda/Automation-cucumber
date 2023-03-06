package com.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.ScenarioAPage;

import cucumber.api.java.en.*;

public class ScenarioA {
	
	ScenarioAPage scenA = new ScenarioAPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException{
		
		Base.driver.get(Base.reader.getUrl());
		System.out.println("Launch the application");
		Thread.sleep(5000);
		
	}
	
	@Then("^I navigate to Cell Phones and Accessories$")
	public void i_navigate_to_Cell_Phones_and_Accessories() {
		
		Elements.click(ScenarioAPage.shopByCategory);
		Elements.click(ScenarioAPage.cellPhoneAndAccessories);
				
	}

	@Then("^I navigate to Cell Phones and Smartphone$")
	public void i_navigate_to_Cell_Phones_and_Smartphone() {
		
		Elements.click(ScenarioAPage.smartPhones);
		
	}
	
	@Then("^I click on See All$")
	public void i_click_on_See_All() {
		
		Elements.click(ScenarioAPage.seeAll);
		
	}
	
	@Then("^I apply the filters as ScreenSize$")
	public void i_apply_the_filters_as_ScreenSize() {
		
		Elements.click(ScenarioAPage.screenSize);
		Elements.click(ScenarioAPage.size1);
		Elements.click(ScenarioAPage.size2);
		Elements.click(ScenarioAPage.size3);
		Elements.click(ScenarioAPage.size4);
		Elements.click(ScenarioAPage.size5);
		Elements.click(ScenarioAPage.size6);
		
		Elements.click(ScenarioAPage.applyFilter);
		
		
	}

	@Then("^I Verfy the filter tags applied$")
	public void i_Verfy_the_filter_tags_applied() {
		
		Assert.assertTrue(Elements.isDisplayed(ScenarioAPage.filterSuccess));
				
	}
	
}

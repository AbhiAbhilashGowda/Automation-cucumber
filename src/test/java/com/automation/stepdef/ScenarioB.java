package com.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.ScenarioBPage;

import cucumber.api.java.en.*;

public class ScenarioB {
	
	ScenarioBPage scenB = new ScenarioBPage();
	
	@Then("^I enter \"([^\"]*)\" in the search bar$")
	public void i_enter_in_the_search_bar(String arg1) {
		
		Elements.TypeText(ScenarioBPage.searchString, arg1);
				
	}

	@Then("^I change the search category to Computer or Tablets and Networking$")
	public void i_change_the_search_category_to_Computer_or_Tablets_and_Networking() throws InterruptedException {
		
		//Elements.click(ScenarioBPage.searchCategory);
		Select dropdown = new Select(Base.driver.findElement(By.xpath("//select[@id='gh-cat']")));
		dropdown.selectByVisibleText("Computers/Tablets & Networking");
		Elements.click(ScenarioBPage.searchApply);
		Thread.sleep(5000);
	}

	@Then("^I verfy the first result name matches with search string$")
	public void i_verfy_the_first_result_name_matches_with_search_string() {
		
		Assert.assertTrue(Elements.isDisplayed(ScenarioBPage.searchSuccess));
		
	}
	
}

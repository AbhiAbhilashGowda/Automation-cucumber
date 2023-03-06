package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.YourStorePage;

import cucumber.api.java.en.*;

public class YourStore {
	
	YourStorePage yspage = new YourStorePage();
	
	@Then("^I navigate to Your Store$")
	public void i_navigate_to_Your_Store(){
		
		Elements.click(YourStorePage.yourStore);
		System.out.println("I navigate yo Your Store");
		
	}
	
	@Then("^I view all the products from Desktop$")
	public void i_view_all_the_products_from_Desktop(){
		
		Elements.click(YourStorePage.desktop);
		Elements.click(YourStorePage.showAllDesktop);
		System.out.println("I view all the products from Desktop");
		
	}

	@Then("^I view all the products from Laptop and Notebooks$")
	public void i_view_all_the_products_from_Laptop_and_Notebooks(){
		
		Elements.click(YourStorePage.lappyAndNote);
		Elements.click(YourStorePage.showAllLappy);
		System.out.println("I view all the products from Laptop and Notebook");
		
	}

	@Then("^I view all the products from components$")
	public void i_view_all_the_products_from_components(){
		
		Elements.click(YourStorePage.components);
		Elements.click(YourStorePage.showAllComponents);
		System.out.println("I view all the products from Components");
		
	}

	@Then("^I view all the products from Tablates$")
	public void i_view_all_the_products_from_Tablates(){
		
		Elements.click(YourStorePage.tablets);
		System.out.println("I view all the products from Tablets");
		
	}

	@Then("^I view all the products from Software$")
	public void i_view_all_the_products_from_Software(){
		
		Elements.click(YourStorePage.software);
		System.out.println("I view all the products from Software");
		
	}

	@Then("^I view all the products from Phones and PDA's$")
	public void i_view_all_the_products_from_Phones_and_PDA_s(){
		
		Elements.click(YourStorePage.phones);
		System.out.println("I view all the products from Phones and PDA's");
		
	}

	@Then("^I view all the products from Cameras$")
	public void i_view_all_the_products_from_Cameras(){
		
		Elements.click(YourStorePage.camera);
		System.out.println("I view all the products from Cameras");
		
	}

	@Then("^I view all the products from MP Players$")
	public void i_view_all_the_products_from_MP_Players(){
		
		Elements.click(YourStorePage.players);
		Elements.click(YourStorePage.showAllPlayers);
		System.out.println("I view all the products from Players");
		
	}

}

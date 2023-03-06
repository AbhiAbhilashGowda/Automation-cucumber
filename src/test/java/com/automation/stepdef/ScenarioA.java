package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.LoginPage;

import cucumber.api.java.en.*;

public class Login {
	
	LoginPage logPage = new LoginPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application(){
		
		Base.driver.get(Base.reader.getUrl());
		System.out.println("Launch the application");
		
	}

	@And("^I click on My Account$")
	public void i_click_on_My_Account(){
		
		Elements.click(LoginPage.myAccount);
		System.out.println("I click on My Account");
		
	}

	@And("^I click on Login$")
	public void i_click_on_Login(){
		
		Elements.click(LoginPage.login);
		System.out.println("I click on Login");
		
	}

	@And("^I enter the Email Address \"([^\"]*)\"$")
	public void i_enter_the_Email_Address(String arg1){
		
		Elements.TypeText(LoginPage.email, arg1);
		System.out.println("I enter the Email Address");
		
	}

	@And("^I enter the Password \"([^\"]*)\"$")
	public void i_enter_the_Password(String arg1){
		
		Elements.TypeText(LoginPage.password, arg1);
		System.out.println("I enter the Password");
		
	}
	
	@And("^I click on Login button$")
	public void i_click_on_Login_button(){
		
		Elements.click(LoginPage.loginButton);
		System.out.println("I click on Login Button");
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful(){
		
		Assert.assertTrue(Elements.isDisplayed(LoginPage.loginSuccess));
		System.out.println("Login Success");
		
	}
	
	@Then("^I view the products from the Wishlist$")
	public void i_view_the_products_from_the_Wishlist(){
		
		
		Elements.click(LoginPage.wishList);
		System.out.println("I view the products form the WishList");
		
	}

	@Then("^I view the products from the Shopping Cart$")
	public void i_view_the_products_from_the_Shopping_Cart(){
		
		Elements.click(LoginPage.shoppingCart);
		System.out.println("I view the products from the shopping cart");
		
	}

}

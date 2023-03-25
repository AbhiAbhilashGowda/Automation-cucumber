package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;

import com.automation.pages.uatloginPage2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class uatlogin extends Base {

	uatloginPage2 msp = new uatloginPage2();

	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		Base.driver.get(Base.reader.getUrl());
		System.out.println("launch the application");
		Thread.sleep(2000);

	}

	@When("^I enter emailid \"([^\"]*)\"$")
	public void i_enter_emailid(String arg1) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(uatloginPage2.emailid, arg1);
	}

	@When("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String arg2) throws Throwable {
		Elements.TypeText(uatloginPage2.password, arg2);
		Thread.sleep(2000);
	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		Thread.sleep(2000);
		Elements.click(uatloginPage2.clickonlogin);
		Thread.sleep(2000);

	}

	@When("^I enter invalid emailid \"([^\"]*)\"$")
	public void i_enter_invalid_emailid(String arg3) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(uatloginPage2.invalidemailid, arg3);
	}

	@When("^I enter invalid password \"([^\"]*)\"$")
	public void i_enter_invalid_password(String arg4) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(uatloginPage2.invalidpassword, arg4);
		Thread.sleep(2000);
	}

	@Then("^I should get the error message$")
	public void i_should_get_the_error_message() throws Throwable {
//	Assert msg="Incorrect email or password";
//	assert.assertEquals(msg, Incorrect email or password);
//    
	}

}

package com.omrbranch.stepdefinition;


import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.pageManagement.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager pom= new PageObjectManager();
	
	@Given("User is on omrbranch page")
	public void userIsOnOmrbranchPage() throws FileNotFoundException, IOException {
	   
	}
	
	@When("User enter {string} and {string}")
	public void userEnterAnd(String emailid, String password) {
		pom.getLoginPage().login(emailid, password);
	    
	}
	@When("User click login button")
	public void userClickLoginButton() {
	    
	}


	@When("User enter {string} and {string} with ENTER key")
	public void userEnterAndWithENTERKey(String emailid1, String password1) throws AWTException {
	    pom.getLoginPage().login1(emailid1, password1);
	}
	

	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMsg) {
		String actWelcomeuserNameMsgText = pom.getSearchHotelPage().getTxtWelcomeuserNameMsgText();
		System.out.println(actWelcomeuserNameMsgText);
		Assert.assertEquals("verify login message", expLoginSuccessMsg, actWelcomeuserNameMsgText);
	    
	}
	

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String errormsg) {
	    String txtErrorMsg = pom.getLoginPage().getTxtErrorMsgText();
	    boolean b = txtErrorMsg.contains("Invalid Login details or Your Password");
	    Assert.assertTrue("Invalid error msg",b);
	    
	}







}

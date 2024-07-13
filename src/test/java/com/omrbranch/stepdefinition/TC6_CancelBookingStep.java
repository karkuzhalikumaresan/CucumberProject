package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.pageManagement.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep extends BaseClass{
	
	PageObjectManager pom= new PageObjectManager();

	
	@When("User Click cancel button and handle popUp")
	public void userClickCancelButtonAndHandlePopUp() {
	   pom.getCancelBookingPage().cancelButton();
	}
	
	
	@Then("User should verify the success message {string}")
	public void userShouldVerifyTheSuccessMessage(String string) {
	   Assert.assertTrue(string,pom.getCancelBookingPage().getPrintCancelBookingSuccessMsgTxt());
	}




}

package com.omrbranch.stepdefinition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pages.SelectHotelPage;
import com.pageManagement.PageObjectManager;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClass{
	
	PageObjectManager pom= new PageObjectManager();

	
	

	@Then("User should verify after success message {string}")
	public void userShouldVerifyAfterSuccessMessage(String string) {
	  Assert.assertTrue(string, pom.getBookHotelPage().txtgetPrintBookingTxt());
	}

	@Then("User should enter valid guest details {string}, {string},{string},{string} and {string}")
	public void userShouldEnterValidGuestDetailsAnd(String salution, String firstName, String lastName, String mobile, String email) {
	    pom.getBookHotelPage().enterGuestDetails(salution, firstName, lastName, mobile, email);
	}



	@Then("User enter GST details  {string},{string} and {string}")
	public void userEnterGSTDetailsAnd(String regno , String cname, String caddress) {
	   pom.getBookHotelPage().enterGSTDetails(regno, cname, caddress);
	}
	@Then("User add special request {string}")
	public void userAddSpecialRequest(String req) {
	    pom.getBookHotelPage().enterSpecialReq(req);
	}
	@When("User select payment options")
	public void userSelectPaymentOptions() {
	   pom.getBookHotelPage().selectPaymentOption();
	}
	@When("User enter payment details,proceed with card type {string}")
	public void userEnterPaymentDetailsProceedWithCardType(String string, io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps();
	    Map<String, String> map = asMaps.get(0);
	   String s1 = map.get("Select card");
	   String s2 = map.get("Card No");
	   String s3 = map.get("Card Name");
	   String s4 = map.get("Month");
	   String s5 = map.get("Year");
	   String s6 = map.get("cvv");
	   pom.getBookHotelPage().fillPaymentDetails(string,s1,s2,s3,s4,s5,s6);
	}
	
	@When("User should select Submit button")
	public void userShouldSelectSubmitButton() {
	    pom.getBookingConfirmPage().firstOrderId();
	}
	@Then("User should verify booking success message {string}")
	public void userShouldVerifyBookingSuccessMessage(String string) {
	   Assert.assertTrue(pom.getBookingConfirmPage().txtPrintBookingConfirmedTxt());
	}
	@Then("User should verify selected hotel and booked hotel are same {string}")
	public void userShouldVerifySelectedHotelAndBookedHotelAreSame(String string) {
	 Assert.assertTrue(SelectHotelPage.firstHotelName.contains(pom.getBookingConfirmPage().bookedHotelName()));
	   
	}
	

	@When("User Click next Button")
	public void userClickNextButton() {
	   
	}
	


	@Then("Verify error message {string},{string},{string},{string},{string} and {string}")
	public void verifyErrorMessageAnd(String string, String string2, String string3, String string4, String string5, String string6) {
		Assert.assertTrue(string2,pom.getBookHotelPage().errorBookingFor()); 
		Assert.assertTrue(string,pom.getBookHotelPage().errorSalutionmsg());   
		Assert.assertTrue(string3,pom.getBookHotelPage().errorFirstNamemsg());
		Assert.assertTrue(string4,pom.getBookHotelPage().errorLastNamemsg());
		Assert.assertTrue(string5,pom.getBookHotelPage().errorMobilemsg());
		Assert.assertTrue(string6,pom.getBookHotelPage().errorEmailmsg());
	}
	


	@When("User enter payment details,proceed with upi payment {string}")
	public void userEnterPaymentDetailsProceedWithUpiPayment(String string) {
	    pom.getBookHotelPage().upiPaymentDetails(string);
	}

	

	@Then("User should verify upi error message {string}")
	public void userShouldVerifyUpiErrorMessage(String string) {
		Assert.assertTrue(string,pom.getBookHotelPage().txtUpiIdErrorMsgTxt()); 
	}

















}

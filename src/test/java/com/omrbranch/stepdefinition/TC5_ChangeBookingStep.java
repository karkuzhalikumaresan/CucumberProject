package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.SelectHotelPage;
import com.pageManagement.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep extends BaseClass {
	
	PageObjectManager pom= new PageObjectManager();
	
	
	@When("User navigate to my booking page")
	public void userNavigateToMyBookingPage() {
	  pom.getChangeBookingPage().btnClickBooking();
	}
	
	@Then("User should verify my booking {string}")
	public void userShouldVerifyMyBooking(String string) {
		Assert.assertTrue(string,pom.getChangeBookingPage().getPrintBookingTxt());
	}
	
	@When("User should search the order Id")
	public void userShouldSearchTheOrderId() {
	 
	}
	
	@Then("User should verify same order Id")
	public void userShouldVerifySameOrderId() {
		Assert.assertTrue(BookingConfirmPage.firstOrderId.contains(pom.getChangeBookingPage().getOrderIdTxt()));
	}
	
	@Then("User should verify Hotel name as selected")
	public void userShouldVerifyHotelNameAsSelected() {
		Assert.assertTrue(SelectHotelPage.firstHotelName.contains(pom.getChangeBookingPage().bookedHotelName())); 
	}
	
	
	@Then("User should verify Hotel price as selected")
	public void userShouldVerifyHotelPriceAsSelected() {
		Assert.assertTrue(SelectHotelPage.firstHotelPrice.contains(pom.getChangeBookingPage().bookedHotelPrice()));  
	}
	
	@When("User click edit button and change checking date {string}")
	public void userClickEditButtonAndChangeCheckingDate(String string) {
	  pom.getChangeBookingPage().editBookingTxt();
	}
	
	
	@Then("User verify booking updated success message {string}")
	public void userVerifyBookingUpdatedSuccessMessage(String string) {
		Assert.assertTrue(pom.getChangeBookingPage().getPrintBookingSuccessMsgTxt());
	}

	

	@When("User click user name and my account")
	public void userClickUserNameAndMyAccount() {
	   pom.getSearchHotelPage().existingOrerIdtxt();
	}









}

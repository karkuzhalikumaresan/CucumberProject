package com.omrbranch.stepdefinition;

import com.omrbranch.baseclass.BaseClass;
import com.pageManagement.PageObjectManager;

import io.cucumber.java.en.When;

public class TC3_SelectHotel extends BaseClass{
	PageObjectManager pom= new PageObjectManager();
	
	@When("User save first hotel and price")
	public void userSaveFirstHotelAndPrice() {
		pom.getSelectHotelPage().FirstHotelName();
		pom.getSelectHotelPage().FirstHotelPrice();
		pom.getSelectHotelPage().selectContinue();
	    
	}
	@When("User handle confirm booking popup")
	public void userHandleConfirmBookingPopup() {
		pom.getSelectHotelPage().alertConfirm();
		
	    
	}

	@When("User save last hotel name and price")
	public void userSaveLastHotelNameAndPrice() {
		pom.getSelectHotelPage().LastHotelName();
		pom.getSelectHotelPage().LastHotelPrice();
		pom.getSelectHotelPage().selectContinue();
	   
	}
	@When("User dismiss booking popup")
	public void userDismissBookingPopup() {
		pom.getSelectHotelPage().alertDismiss();
	    
	}



}

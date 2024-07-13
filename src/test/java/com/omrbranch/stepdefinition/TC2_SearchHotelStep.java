package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.baseclass.BaseClass;
import com.pageManagement.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass {
	
	PageObjectManager pom= new PageObjectManager();
	
	@When("User search hotel with valid credentials in omrbranch website")
	public void userSearchHotelWithValidCredentialsInOmrbranchWebsite() {
	  
	}
	
	@When("User click search button")
	public void userClickSearchButton() {
		
	   
	}
	


	@When("User Search {string},{string},{string},{string},{string},{string} and {string}")
	public void userSearch(String state,String city,String roomtype,String checkin,String checkout,String room,String adult,String child) {
		pom.getSearchHotelPage().searchHotel(state,city,roomtype,checkin,checkout,room,adult,child);
	   
	}
	
	@Then("User should verify after search Success message {string}")
	public void userShouldVerifyAfterSearchSuccessMessage(String exp) {
		String txtPrintSelectHotelTxt = pom.getSelectHotelPage().txtPrintSelectHotelTxt();
		System.out.println(txtPrintSelectHotelTxt);
		Assert.assertEquals(exp,txtPrintSelectHotelTxt);
	    
	}



	@Then("User should Verify same selected roomtype is pesent in the header or not {string}")
	public void userShouldVerifySameSelectedRoomtypeIsPesentInTheHeaderOrNot(String string) {
		  Assert.assertEquals("Verify header",string, pom.getSelectHotelPage().roomTypeHeader());
	}





	@When("User search {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchAnd(String state,String city,String roomtype,String checkin,String checkout,String room,String adult,String child) {
		pom.getSearchHotelPage().searchHotel(state,city,roomtype,checkin,checkout,room,adult,child);
		   
	}




	@When("User search {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userEnter(String state,String city,String roomtype,String checkin,String checkout,String room,String adult,String child) {
		pom.getSearchHotelPage().searchHotel(state,city,roomtype,checkin,checkout,room,adult,child);
	   
	}
	
	
	@When("User enter {string},{string},{string},{string},{string},{string},{string}")
	public void userEnter(String state,String city,String checkin,String checkout,String room,String adult,String child) {
	   pom.getSearchHotelPage().searchHotelwithMandatoryDetails(state, city, checkin, checkout, room, adult, child);
	}
	

	@Then("User should verify error message of mandatory fields {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageOfMandatoryFieldsAnd(String state,String city,String checkin,String checkout,String room,String adult) {
		switchToParentFrame();
		
	    Assert.assertTrue(state,pom.getSearchHotelPage().StateErrorMsgTxt());
	    Assert.assertTrue(city,pom.getSearchHotelPage().CityErrorMsgTxt());
	    Assert.assertTrue(checkin,pom.getSearchHotelPage().ErrorCheckInText());
	    Assert.assertTrue(checkout,pom.getSearchHotelPage().ErrorCheckOutText());
	    Assert.assertTrue(room,pom.getSearchHotelPage().ErrorNoOfRoomText());
	    Assert.assertTrue(adult,pom.getSearchHotelPage().ErrorAdultCountTxt());
	    
	}

	@When("User click Price low to high")
	public void userClickPriceLowToHigh() throws InterruptedException {
		pom.getSelectHotelPage().sortByLtoHOption();
	    
	}

	@When("User click Price High to low")
	public void userClickPriceHighToLow() throws InterruptedException {
	   pom.getSelectHotelPage().sortPriceByHtoLOption();
	}
	
	@When("User click Price Name Ascending")
	public void userClickPriceNameAscending() throws InterruptedException {
	   pom.getSelectHotelPage().sortHotelNameByAscendingOrderText();
	}


	@When("User click Price Name Descending")
	public void userClickPriceNameDescending() throws InterruptedException {
	   pom.getSelectHotelPage().sortHotelNameByDescendinOrder();
	}


	
	@Then("User should verify hotel name end room type is mentioned or not")
	public void userShouldVerifyHotelNameEndRoomTypeIsMentionedOrNot() {
	   Assert.assertFalse(pom.getSelectHotelPage().checkHotelName());
	}

















		

}

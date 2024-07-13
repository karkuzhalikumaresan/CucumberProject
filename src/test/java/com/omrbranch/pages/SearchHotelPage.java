package com.omrbranch.pages;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement txtWelcomeuserNameMsg;
	
	public WebElement getTxtWelcomeuserNameMsg() {
		return txtWelcomeuserNameMsg;
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myAccont;
	
	public WebElement getMyAccont() {
		return myAccont;
	}

	@FindBy(id="state")
	private WebElement selectState;
	
	@FindBy(xpath="//select[@id='city']")
	private WebElement selectCity;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement selectRoomType;
	
	@FindBy(xpath="//input[@placeholder='Check-In --/--/-- *']")
	private WebElement checkIndate;
	
	@FindBy(xpath="//input[@placeholder='Check-Out --/--/-- *']")
	private WebElement checkOutDate;
	
	@FindBy(id="no_rooms")
	private WebElement selectRoom; 	
	
	@FindBy(id="no_adults")
	private WebElement adultCount;
	
	@FindBy(id="no_child")
	private WebElement childCount;
	
	@FindBy(xpath="//iframe[@id='hotelsearch_iframe']")
	private WebElement outerFrame;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	private WebElement btnSearch;

	@FindBy(xpath="//div[@id='invalid-state']")
	private WebElement errorState;
	
	@FindBy(xpath="//div[@id='invalid-city']")
	private WebElement errorCity;
	
	@FindBy(xpath="//div[@id='invalid-check_in']")
	private WebElement errorCheckIn;
	
	@FindBy(xpath="//div[@id='invalid-check_out']")
	private WebElement errorCheckOut;
	
	@FindBy(xpath="//div[@id='invalid-no_rooms']")
	private WebElement errorNoOfRoom;
	
	@FindBy(xpath="//div[@id='invalid-no_adults']")
	private WebElement errorAdultCount;
	
	


	public WebElement getErrorState() {
		return errorState;
	}



	public WebElement getErrorCity() {
		return errorCity;
	}



	public WebElement getErrorCheckIn() {
		return errorCheckIn;
	}



	public WebElement getErrorCheckOut() {
		return errorCheckOut;
	}



	public WebElement getErrorNoOfRoom() {
		return errorNoOfRoom;
	}



	public WebElement getErrorAdultCount() {
		return errorAdultCount;
	}



	public String getTxtWelcomeuserNameMsgText() {
	String elementGetText = elementGetText(txtWelcomeuserNameMsg);
	return elementGetText;
	}



	public WebElement getSelectState() {
		return selectState;
	}



	public WebElement getSelectCity() {
		return selectCity;
	}



	public WebElement getSelectRoomType() {
		return selectRoomType;
	}



	public WebElement getCheckIndate() {
		return checkIndate;
	}



	public WebElement getCheckOutDate() {
		return checkOutDate;
	}



	public WebElement getSelectRoom() {
		return selectRoom;
	}



	public WebElement getAdultCount() {
		return adultCount;
	}



	public WebElement getChildCount() {
		return childCount;
	}



	public WebElement getOuterFrame() {
		return outerFrame;
	}


	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void selectRoomType(String roomType) {
		String[] s = roomType.split("/");
		for(String k:s) {
			selectOptionByText(selectRoomType, k);
		}
	}
	
	public void existingOrerIdtxt() {
		elementJavaScriptClick(txtWelcomeuserNameMsg);
		elementJavaScriptClick(myAccont);
		
	}
	
	public void searchHotel(String state,String city,String roomtype,String checkin,String checkout,String room,String adult,String child) {
		selectOptionByText(selectState, state);
		selectOptionByText(selectCity, city);
	//	selectOptionByText(selectRoomType, roomtype);
		selectRoomType(roomtype);
		elementSendKeysJs(checkIndate, checkin);
		elementSendKeysJs(checkOutDate, checkout);
		selectOptionByText(selectRoom, room);
		selectOptionByText(adultCount, adult);
		elementSendKeys(childCount, child);
		swithFrameByWebElement(outerFrame);
		elementClick(btnSearch);
		switchToParentFrame();
		
	}
	
	public void searchHotelwithMandatoryDetails(String state,String city,String checkin,String checkout,String room,String adult,String child) {
		selectOptionByText(selectState, state);
		selectOptionByText(selectCity, city);
		elementSendKeysJs(checkIndate, checkin);
		elementSendKeysJs(checkOutDate, checkout);
		selectOptionByText(selectRoom, room);
		selectOptionByText(adultCount, adult);
		elementSendKeys(childCount, child);
		
	}
	
	public boolean StateErrorMsgTxt() {
		String error1 = elementGetText(errorState);
		boolean error11 = error1.contains("state");
		return error11;
	}
	
	public boolean CityErrorMsgTxt() {
		 String cityErrorMsgTxt = elementGetText(errorCity);
		 boolean cityError = cityErrorMsgTxt.contains("city");
		 return cityError;
	}
	
	public boolean ErrorCheckInText() {
		String errorCheckInText = elementGetText(errorCheckIn);
		boolean checkinError = errorCheckInText.contains("Check-in date");
		return checkinError;
	}
	
	public boolean ErrorCheckOutText() {
		String errorCheckOutText = elementGetText(errorCheckOut);
		boolean checkoutError = errorCheckOutText.contains("Check-out date");
		return checkoutError;
	}
	
	public boolean ErrorNoOfRoomText() {
		String errorNoOfRoomText = elementGetText(errorNoOfRoom);
		boolean roomerror = errorNoOfRoomText.contains("no. of rooms");
		return roomerror;
	}
	
	public boolean ErrorAdultCountTxt() {
		
		String elementGetText = elementGetText(errorAdultCount);
		boolean contains = elementGetText.contains("no. of adults");
		return contains;
		
	}
	
	public void btnSearchText() {
		swithFrameByWebElement(outerFrame);
		elementClick(btnSearch);
		
	}
	
	
	
	
	
}

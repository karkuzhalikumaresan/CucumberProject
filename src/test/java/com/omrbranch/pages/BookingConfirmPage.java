package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass{
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static String firstOrderId;
	

	public WebElement getTxtCom() {
		return txtCom;
	}

	public WebElement getHoteltxt() {
		return hoteltxt;
	}

	@FindBy(xpath="//h2[@class='couppon-code']//child::strong")
	private WebElement bookingId;
	
	public WebElement getBookingId() {
		return bookingId;
	}

	
	@FindBy(xpath="//h2[contains(text(),'Booking is Confirmed')]")
	private WebElement txtCom;
	
	@FindBy(xpath="//strong[text()='Park Hyatt']")
	private WebElement hoteltxt;
	
	 public void firstOrderId() {
		  firstOrderId = elementGetText(bookingId);
		  System.out.println(firstOrderId);
	 }
	 
	
	public String bookedHotelName() {
		 String bookedHotel = elementGetText(hoteltxt); 
		System.out.println(bookedHotel);
		return bookedHotel;
	}
	
	 public boolean txtPrintBookingConfirmedTxt() {
		 String elementGetText = elementGetText(txtCom); 
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("Booking is Confirmed");
		  return contains;
	 }

	 public boolean verifyHotelName() {
		 String elementGetText = elementGetText(hoteltxt); 
		 System.out.println(elementGetText);
		 boolean contains = elementGetText.contains("Park Hyatt");
		 return contains;
	 }
}

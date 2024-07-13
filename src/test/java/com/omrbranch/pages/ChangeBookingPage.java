package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class ChangeBookingPage extends BaseClass {
	
	public ChangeBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement btnBook;
	
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement printBooking;
	
	@FindBy(xpath="(//div[@class='room-code']//child::span)[1]")
	private WebElement orderId;
	

	@FindBy(xpath="(//button[text()='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath="//input[@placeholder='Check-In --/--/--']")
	private WebElement modifyCheckin;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnConfirm;
	
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement popupConfirm;
	
	@FindBy(xpath="(//h5[text()='Park Hyatt Suite'])[1]")
	private WebElement hoteltxt;
	
	@FindBy(xpath="(//strong[text()='Rs 3,776'])[1]")
	private WebElement txtPrice;

	public WebElement getHoteltxt() {
		return hoteltxt;
	}
	
	public WebElement getOrderId() {
		return orderId;
	}


	public WebElement getTxtPrice() {
		return txtPrice;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getPrintBooking() {
		return printBooking;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getModifyCheckin() {
		return modifyCheckin;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getPopupConfirm() {
		return popupConfirm;
	}
	
	public boolean getPrintBookingTxt() {
		String elementGetText = elementGetText(printBooking);
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("Bookings");
		  return contains;
	}
	
	public String getOrderIdTxt() {
		String elementGetText = elementGetText(getOrderId());
		 System.out.println(elementGetText);
		 return elementGetText;
	}
	
	public void btnClickBooking() {
		elementJavaScriptClick(btnBook);
	}
	
	public String bookedHotelName() {
		 String bookedHotel = elementGetText(hoteltxt); 
		System.out.println(bookedHotel);
		return bookedHotel;
	}
	
	public String bookedHotelPrice() {
		String bookedPrice = elementGetText(txtPrice);
		System.out.println(bookedPrice);
		String trim = bookedPrice.replace("Rs","").trim();
		System.out.println(trim);
		return trim;
	}
	
	public void editBookingTxt() {
		elementJavaScriptClick(btnEdit);
		String modifyDate = elementGetText(modifyCheckin);
		elementJavaScriptClick(btnConfirm);
	}
	
	public boolean getPrintBookingSuccessMsgTxt() {
		String elementGetText = elementGetText(popupConfirm);
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("Booking updated successfully");
		  return contains;
	}
	
}		
		
	



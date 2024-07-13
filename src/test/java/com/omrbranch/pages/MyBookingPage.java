package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass{
	
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement btnBook;
	
	@FindBy(xpath="(//button[text()='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath="//input[@placeholder='Check-In --/--/--']")
	private WebElement modifyCheckin;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnConfirm; 
	
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement popupConfirm;
	
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement printBooking;
	
	@FindBy(xpath="(//a[text()='Cancel'])[1]")
	private WebElement btnCancel;
	
	@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
	private WebElement cancelMsg;
	
	

}

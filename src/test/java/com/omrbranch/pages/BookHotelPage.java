package com.omrbranch.pages;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[@class='px-3 py-2']")
	private WebElement printBooking;
	
	public WebElement getPrintBooking() {
		return printBooking;
	}

	@FindBy(xpath="//label[text()='Myself']")
	private WebElement selectGuest;
	
	@FindBy(id="user_title")
	private WebElement selectSal;
	
	@FindBy(xpath="//input[@placeholder='First Name *']")
	private WebElement txtFristName;
	
	@FindBy(xpath="//input[@placeholder='Last Name *']")
	private WebElement txtlastName;
	
	@FindBy(id="user_phone")
	private WebElement txtMobileNum;
	
	@FindBy(id="user_email")
	private WebElement txtEmailId;
	
	@FindBy(xpath="//input[@id='gst']")
	private WebElement checkBoxgst;

	@FindBy(id="gst_registration")
	private WebElement txtGst;
	
	public WebElement getSelectGuest() {
		return selectGuest;
	}

	public WebElement getSelectSal() {
		return selectSal;
	}

	public WebElement getTxtFristName() {
		return txtFristName;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtMobileNum() {
		return txtMobileNum;
	}

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getCheckBoxgst() {
		return checkBoxgst;
	}

	public WebElement getTxtGst() {
		return txtGst;
	}

	public WebElement getTxtComName() {
		return txtComName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getSpecialReq() {
		return specialReq;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getBtnClick2() {
		return btnClick2;
	}

	public WebElement getClickPaymenyt() {
		return clickPaymenyt;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	@FindBy(xpath="//input[@placeholder='Enter Company Name *']")
	private WebElement txtComName;
	
	@FindBy(xpath="//input[@placeholder='Enter Company Address *']")
	private WebElement txtAddress;
	
	
	@FindBy(id="step1next")
	private WebElement btnClick;
	
	@FindBy(xpath="//label[text()='Early Check-in']")
	private WebElement specialReq;
	
	@FindBy(id="other_request")
	private WebElement reason;
	
	@FindBy(id="step2next")
	private WebElement btnClick2;
	
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement clickPaymenyt;
	
	@FindBy(css="select.form-control.selectpiker[id=payment_type]")
	private WebElement paymentType;
	
	@FindBy(css="select.form-control.selectpiker[id=card_type]")
	private WebElement cardType;
	
	
	@FindBy(xpath="//input[@placeholder='Enter Card Number *']")
	private WebElement cardNo;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Name On Card *']")
	private WebElement cardName;
	
	@FindBy(css="select[id=card_month]")
	private WebElement selectMonth;
	
	@FindBy(css="select[id=card_year]")
	private WebElement selectYear;
	
	@FindBy(xpath="//input[@placeholder='Enter Card CVV *']")
	private WebElement txtCVV;
	
	@FindBy(id="submitBtn")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//div[text()='Let us know for whom you are booking the hotel']")
	private WebElement errorbookingFor;
	
	@FindBy(xpath="//div[text()='Please select Salutation of the user']")
	private WebElement errorSalutation;
	
	@FindBy(xpath="//div[text()='Please provide First Name of the user']")
	private WebElement errorFirstName;
	
	@FindBy(xpath="//div[text()='Please provide Last Name of the user']")
	private WebElement errorLastName;
	
	@FindBy(xpath="//div[text()='Please provide Contact Number of the user to ease the communication (if required)']")
	private WebElement errorNumber;
	
	@FindBy(xpath="//div[text()='Please provide Email ID of the user to ease the communication (if required)']")
	private WebElement errorEmailId;
	
	@FindBy(xpath="//div[@class='upi pm']")
	private WebElement upiIdClick;
	
	@FindBy(xpath="//input[@id='upi_id']")
	private WebElement enterUpiTxt;
	
	@FindBy(xpath="//button[@id='submitBtn']")
	private WebElement btnupiSubmit;
	
	@FindBy(xpath="//div[text()='Please provide your UPI ID']")
	private WebElement errorUpiId;
	
	 public WebElement getErrorUpiId() {
		return errorUpiId;
	}

	public WebElement getUpiIdClick() {
		return upiIdClick;
	}

	public WebElement getEnterUpiTxt() {
		return enterUpiTxt;
	}

	public WebElement getBtnupiSubmit() {
		return btnupiSubmit;
	}

	public WebElement getErrorbookingFor() {
		return errorbookingFor;
	}

	public WebElement getErrorSalutation() {
		return errorSalutation;
	}

	public WebElement getErrorFirstName() {
		return errorFirstName;
	}

	public WebElement getErrorLastName() {
		return errorLastName;
	}

	public WebElement getErrorNumber() {
		return errorNumber;
	}

	public WebElement getErrorEmailId() {
		return errorEmailId;
	}
	
	public boolean txtUpiIdErrorMsgTxt() {
		elementJavaScriptClick(btnupiSubmit);
		 String elementGetText = elementGetText(errorUpiId); 
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("your UPI ID");
		  return contains;
	 }

	public boolean txtgetPrintBookingTxt() {
		 String elementGetText = elementGetText(printBooking); 
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("Book Hotel");
		  return contains;
	 }
	 
	public void enterGuestDetails(String salution, String firstName, String lastName, String mobile, String email) {
		elementJavaScriptScrolIntoView(selectGuest);
		elementJavaScriptClick(selectGuest);
		selectOptionByText(selectSal, salution);
		elementSendKeys(txtFristName, firstName);
		elementSendKeys(txtlastName, lastName);
		elementSendKeys(txtMobileNum, mobile);
		elementSendKeys(txtEmailId, email);	
		//elementClick(btnClick);
		//elementClick(btnClick2);
	}
	
	public void enterGSTDetails(String regno , String cname, String caddress) {
		elementJavaScriptClick(checkBoxgst);
		elementSendKeys(txtGst, regno);
		elementSendKeys(txtComName, cname);
		elementSendKeys(txtAddress, caddress);
		elementClick(btnClick);
		//elementClick(btnClick2);
	}
	
	public void enterSpecialReq(String req) {
		elementJavaScriptClick(specialReq);
		elementSendKeys(reason, req);
		elementClick(btnClick2);
	}
	
	public void selectPaymentOption() {
		elementClick(clickPaymenyt);
		//elementJavaScriptClick(upiIdClick);
		
	}
	public void fillPaymentDetails(String payment,String card,String num,String name,String mon,String year,String cvv) {
		selectOptionByText(paymentType, payment);
		selectOptionByText(cardType, card);
		elementSendKeysJs(cardNo, num);
		elementSendKeysJs(cardName, name);
		selectOptionByText(selectMonth, mon);
		selectOptionByText(selectYear, year);
		elementSendKeysJs(txtCVV, cvv);
		elementJavaScriptClick(btnSubmit);
		
	}
	
	public boolean errorBookingFor() {
		elementJavaScriptScrolIntoView(btnClick);
		elementClick(btnClick);
		String elementGetText = elementGetText(errorbookingFor);
		boolean contains = elementGetText.contains("booking the hotel");
		return contains;
	}
	
	public boolean errorSalutionmsg() {
		String elementGetText = elementGetText(errorSalutation);
		boolean contains = elementGetText.contains("Salutation of the user");
		return contains;
	}
	
	public boolean errorFirstNamemsg() {
		String elementGetText = elementGetText(errorFirstName);
		boolean contains = elementGetText.contains("First Name of the user");
		return contains;
	}
	
	public boolean errorLastNamemsg() {
		String elementGetText = elementGetText(errorLastName);
		boolean contains = elementGetText.contains("Last Name of the user");
		return contains;
	}
	
	public boolean errorMobilemsg() {
		String elementGetText = elementGetText(errorNumber);
		boolean contains = elementGetText.contains("Number of the user");
		return contains;
	}
	
	public boolean errorEmailmsg() {
		String elementGetText = elementGetText(errorEmailId);
		boolean contains = elementGetText.contains("Email ID of the user");
		return contains;
	}
	
	public void upiPaymentDetails(String string) {
		elementJavaScriptClick(upiIdClick);
		elementSendKeys(enterUpiTxt,string);
		elementJavaScriptClick(btnupiSubmit);
	}
	
	
	

}

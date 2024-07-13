package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class CancelBookingPage extends BaseClass {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Cancel'])[1]")
	private WebElement btnCancel;
	
	@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
	private WebElement cancelMsg;

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getCancelMsg() {
		return cancelMsg;
	}
	
	public void cancelButton() {
		elementJavaScriptClick(btnCancel);
		clickOkInAlert();
	}
	
	public boolean getPrintCancelBookingSuccessMsgTxt() {
		String elementGetText = elementGetText(cancelMsg);
		 System.out.println(elementGetText);
		  boolean contains = elementGetText.contains("Your booking cancelled successfully");
		  return contains;
	}

}

package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id= "email")
	private WebElement txtEmail;

	@FindBy(id="pass")
	private WebElement txtPass;

	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//div[@id='errorMessage']")
	private WebElement txtErrorMsg;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String emailId,String password) {
		elementSendKeys(txtEmail, emailId);
		elementSendKeys(txtPass, password);
		elementClick(btnLogin);
	}
	
	public void login1(String emailId,String password) throws AWTException {
		elementSendKeys(txtEmail, emailId);
		elementSendKeys(txtPass, password);
		robotEnterKey(btnLogin);
	}
	
	public String getTxtErrorMsgText() {
		String elementGetText = elementGetText(getTxtErrorMsg());
		return elementGetText;
		}
	
	
	

}

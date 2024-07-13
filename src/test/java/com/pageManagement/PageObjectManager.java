package com.pageManagement;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.CancelBookingPage;
import com.omrbranch.pages.ChangeBookingPage;
import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.SearchHotelPage;
import com.omrbranch.pages.SelectHotelPage;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private MyBookingPage myBookingPage;
	private ChangeBookingPage changeBookingPage;
	private CancelBookingPage cancelBookingPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)? bookingConfirmPage=new BookingConfirmPage():bookingConfirmPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)? myBookingPage=new MyBookingPage():myBookingPage;
	}
	
	public ChangeBookingPage getChangeBookingPage() {
		return (changeBookingPage==null)? changeBookingPage=new ChangeBookingPage():changeBookingPage;
	}
	
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)? cancelBookingPage=new CancelBookingPage():cancelBookingPage;
	}

}

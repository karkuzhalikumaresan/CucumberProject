package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	public static String firstHotelName;
	
	public static String firstHotelPrice;
	
	public static String lastHotelName;
	
	public static String lastHotelPrice;
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement selectHotel;
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
	
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement LtoH;
	
	@FindBy(xpath="//label[text()='Price High to low']")
	private WebElement HToL;

	public WebElement getLtoH() {
		return LtoH;
	}

	public WebElement getHToL() {
		return HToL;
	}
	
	@FindBy(xpath="//div[@class='prize']//child::strong")
	private List<WebElement> listPrList;

	public List<WebElement> getListPrList() {
		return listPrList;
	}
	
	@FindBy(xpath="//div[@class='prize']//child::strong")
	private List<WebElement> listPriceH2L;
	
	

	public List<WebElement> getListPriceH2L() {
		return listPriceH2L;
	}
	
	@FindBy(xpath="//label[text()='Name Ascending']")
	private WebElement nameAscending;
	
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement nameDescending;
	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//child::h5")
	private List<WebElement> devList;
	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//child::h5")
	private List<WebElement> devList11;

	public WebElement getNameAscending() {
		return nameAscending;
	}

	public WebElement getNameDescending() {
		return nameDescending;
	}

	public List<WebElement> getDevList() {
		return devList;
	}

	public List<WebElement> getDevList1() {
		return devList11;
	}

	@FindBy(xpath="//h5[text()='Park Hyatt Suite']")
	private WebElement printProduct;
	
	@FindBy(xpath="//h5[text()='The Leela Palace Suite']")
	private WebElement lastHotel;
	
	public WebElement getLastHotel() {
		return lastHotel;
	}

	@FindBy(xpath="(//strong[@class='total-prize'])[1]")
	private WebElement txtPrice;
	
	@FindBy(xpath="(//strong[text()='$ 2,832'])[2]")
	private WebElement lastPrice;
	
	public WebElement getLastPrice() {
		return lastPrice;
	}

	@FindBy(xpath="(//a[text()='Continue'])[1]")
	private WebElement btnCon;
	
	@FindBy(id="room_type")
	private WebElement roomHeader;
	
	
	public WebElement getRoomHeader() {
		return roomHeader;
	}


	public WebElement getPrintProduct() {
		return printProduct;
	}

	public WebElement getTxtPrice() {
		return txtPrice;
	}

	public WebElement getBtnCon() {
		return btnCon;
	}
	
	 public String txtPrintSelectHotelTxt() {
		 String elementGetText = elementGetText(selectHotel);
		 return elementGetText;
	 }
//	 public String txtPrintFirstHotelTxt() {
//		 String elementGetText1 = elementGetText(printProduct);
//		 return elementGetText1;
//		 
//	 }
	 
	 public void LastHotelName() {
		 elementJavaScriptScrolIntoView(lastHotel);
		 lastHotelName = elementGetText(lastHotel);
		 System.out.println(lastHotelName);
	 }
	 
	 public void LastHotelPrice() {
		 elementJavaScriptScrolIntoView(lastPrice);
		 lastHotelPrice = elementGetText(lastPrice);
		 System.out.println(lastHotelPrice);
	 }
	 
	 public void FirstHotelName() {
		  firstHotelName = elementGetText(printProduct);
		  System.out.println(firstHotelName);
	 }
	 
	 public String FirstHotelPrice() {
		 firstHotelPrice=elementGetText(txtPrice);
		 System.out.println(firstHotelPrice);
		 String trim = firstHotelPrice.replace("$","").trim();
		 System.out.println(trim);
		return trim;
		  
	 }

	public String txtPrintHotelPriceTxt() {
		 String elementGetText2 = elementGetText(txtPrice);
		 return elementGetText2;
	 }
	
	public void selectContinue() {
		elementJavaScriptScrolIntoView(btnCon);
		elementJavaScriptClick(btnCon);
	}
	
	public void alertConfirm() {
		clickOkInAlert();
	}
	
	public void alertDismiss() {
		clickCancelAlert();
	}
	
	public String roomTypeHeader()
	{
		String elementGetText = elementGetText(roomHeader);
		System.out.println(elementGetText);
		return elementGetText;
	}
	
	public boolean checkHotelName() {
		String roomType="Suite";
		List<Boolean> list =new ArrayList<>();
		for(WebElement element:devList) {
			String dev = elementGetText(element);
			boolean endsWith = dev.endsWith(roomType);
			list.add(endsWith);
			}
		boolean contains = list.contains(false);
		System.out.println(contains);
		return contains;
	}
	
	 public void sortByLtoHOption() throws InterruptedException {
		 elementClick(LtoH);
			Thread.sleep(5000);
			
			List<String> listPrList1= new ArrayList<String>();
			
			for(WebElement element:listPrList) {
				String dev = elementGetText(element);
				listPrList1.add(dev);
			}
			
			ArrayList<Integer> test1 = new ArrayList<Integer>();

			for (String s : listPrList1) {
				String re = s.replace("$", "");
				String trim = re.replace(",", "").trim();
				int st = Integer.parseInt(trim);
				test1.add(st);
			}
			ArrayList<Integer> test2 = new ArrayList<Integer>();

			test2.addAll(test1);

			System.out.println(listPrList1);
			System.out.println("developer sorting:" + test1);

			Collections.sort(test2);
			System.out.println("After sorting:" + test2);
			Thread.sleep(5000);
			if (test1.equals(test2)) {
				System.out.println("prize in ascending order test passed");
			} else {
				System.out.println("Test Failed");
			}
	 }
	 
	 public void sortPriceByHtoLOption() throws InterruptedException {
		 elementClick(HToL);
			Thread.sleep(5000);
			List<String> listPrList1= new ArrayList<String>();
			
			for(WebElement element:listPrList) {
				String dev = elementGetText(element);
				listPrList1.add(dev);
			}
			
			ArrayList<Integer> test1 = new ArrayList<Integer>();

			for (String s : listPrList1) {
				String re = s.replace("$", "");
				String trim = re.replace(",", "").trim();
				int st = Integer.parseInt(trim);
				test1.add(st);
			}
			ArrayList<Integer> test2 = new ArrayList<Integer>();

			test2.addAll(test1);

			
			
			List<String> listPriceHToL= new ArrayList<String>();
			
			for(WebElement element:listPriceH2L) {
				String dev = elementGetText(element);
				listPriceHToL.add(dev);
			}
			
			ArrayList<Integer> des1 = new ArrayList<Integer>();

			for (String s1 : listPriceHToL) {
				String re1 = s1.replace("$", "");
				String trim1 = re1.replace(",", "").trim();
				int st1 = Integer.parseInt(trim1);
				des1.add(st1);
			}
			ArrayList<Integer> des2 = new ArrayList<Integer>();

			des2.addAll(des1);

			System.out.println(listPrList1);
			System.out.println("developer sorting:" + des1);

			Collections.reverse(test1);
			System.out.println("After sorting:" + des2);
			Thread.sleep(5000);
			if (des1.equals(des2)) {
				System.out.println("prize in descending order test passed");
			} else {
				System.out.println("Test Failed");
			}

	 }

	public void sortHotelNameByAscendingOrderText() throws InterruptedException{
		elementClick(nameAscending);
		Thread.sleep(5000);
		List<String> devList1 =new ArrayList<String>();
		for(WebElement element:devList) {
			String dev = elementGetText(element);
			devList1.add(dev);
		}
		System.out.println(devList1);

		List<String> qa = new ArrayList<>();

		qa.addAll(devList1);
		Collections.sort(qa);
		System.out.println(qa);

		if (qa.equals(devList)) {
			System.out.println("Hotel Name is displayed in ascending Order");
		} else {
			System.out.println("Test failed");
		}
	}
	
	public void sortHotelNameByDescendinOrder() throws InterruptedException {
		elementClick(nameDescending);

		Thread.sleep(5000);
		
		List<String> devList1 =new ArrayList<String>();
		for(WebElement element:devList) {
			String dev = elementGetText(element);
			devList1.add(dev);
		}

		List<String> qa = new ArrayList<>();

		qa.addAll(devList1);
		
		List<String> devList2 =new ArrayList<String>();
		for(WebElement element:devList11) {
			String dev = elementGetText(element);
			devList2.add(dev);
		}
		System.out.println(devList2);
		List<String> qa1 = new ArrayList<>();

		qa1.addAll(devList2);
		Collections.reverse(qa);
		System.out.println(qa1);

		if (qa1.equals(devList1)) {
			System.out.println("Hotel Name is displayed in descending Order");
		} else {
			System.out.println("Test failed");
		}
		}
	

}

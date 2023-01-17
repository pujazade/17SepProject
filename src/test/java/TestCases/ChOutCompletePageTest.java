package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.ChOutCompletePage;
import Pages.ChOutPage2;
import Pages.CheckOutPage1;
import Pages.InventoryPage;
import Pages.LoginPage;

public class ChOutCompletePageTest extends TestBase{
	
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage1 check;
	ChOutPage2 ch;
	ChOutCompletePage comp;
	
	@BeforeMethod
	public void Setup() throws Exception
	{
		initialzation();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		check = new CheckOutPage1();
		ch = new ChOutPage2();
		comp = new ChOutCompletePage();
		login.loginToApp();
		invent.VerifyProductCount();
		cart.verifyCheckOutBtn();
		check.verifyTextboxToAdd();
		ch.VerifyFinishBtn();
	}
	
	@Test(enabled=false)
	public void verifyBmLableTest()
	{
		boolean res = comp.verifyBmLable();
		Assert.assertEquals(res, true);
	}
	@Test(enabled=false)
	public void verifycheckoutLogoTest()
	{
	  boolean res = comp.verifycheckoutLogo();
	  Assert.assertEquals(res, true);
	}
	@Test(enabled=false)                                                   
	public void verifythnkuTextTest()
	{
	 String expRes = "THANK YOU FOR YOUR ORDER";
	 String actRes = comp.verifyThnkuText();
	 Assert.assertEquals(expRes, actRes);
	}
	
	@Test                                                   
	public void verifybackBtnTest() throws Exception
	{
	  String expRes = "https://www.saucedemo.com/inventory.html";  
	  String actRes = comp.verifyBackToHomeBtn();
	  Assert.assertEquals(expRes, actRes);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

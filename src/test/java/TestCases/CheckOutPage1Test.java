package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage1;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckOutPage1Test extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage1 check;

	@BeforeMethod
	public void setup() throws Exception
	{
	 initialzation();
	 login = new LoginPage();
	 invent = new InventoryPage();
	 cart = new CartPage();
	 check = new CheckOutPage1();
	 login.loginToApp();
	 invent.VerifyProductCount();
	 cart.verifyCheckOutBtn();
	 
	}
	@Test(enabled=false)
	public void VerifyCheckoutTitleLableTest()
	{
		  boolean actRes = check.VerifyCheckoutTitleLable();
		  Assert.assertEquals(actRes, true);
	}
	@Test(enabled=false)
	public void verifyEnterTextboxTest() throws Exception
	{
		check.verifyEnterTextbox();
	}
	@Test(enabled=true)
	public void VerifyCancelBtnTest() throws Exception
	{
		check.VerifyCancelBtn();
	}
	@Test(enabled=true)
	public void verifyTextboxToAddText() throws Exception
	{
		check.verifyTextboxToAdd();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.ChOutPage2;
import Pages.CheckOutPage1;
import Pages.InventoryPage;
import Pages.LoginPage;

public class ChOutPage2Test extends TestBase{
	
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage1 check;
	ChOutPage2 ch;
	
	@BeforeMethod
	public void Setup() throws Exception
	{
		initialzation();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		check = new CheckOutPage1();
		ch = new ChOutPage2();
		login.loginToApp();
		invent.VerifyProductCount();
		cart.verifyCheckOutBtn();
		check.verifyTextboxToAdd();
	}
	@ Test(enabled= false)
	public void verifyCheckOverviewLableTest()
	{
		boolean res = ch.verifyCheckOverviewLable();
		Assert.assertEquals(res, true);
	}
	@ Test(enabled= false)
	public void verifyDescriptionTest()
	{
		boolean res = ch.verifyDescription();
		Assert.assertEquals(res, true);
	}
	@ Test(enabled= false)
	public void verifySummaryTest()
	{
		boolean res = ch.verifySummary();
		Assert.assertEquals(res, true);
	}
	@ Test(enabled= false)
	public void VerifyCnclBtnTest()
	{
		 ch.VerifyCnclBtn();//String actRes =
//		Assert.assertEquals(actRes, true);
	}
	@ Test(enabled= true)
	public void VerifyFinishBtn()
	{
		 ch.VerifyFinishBtn();//String res =
//		Assert.assertEquals(res, true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}

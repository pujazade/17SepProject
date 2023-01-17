package TestCases1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;


public class InvPageTest extends TestBase{
//	InventoryPage invent ;// = new InventoryPage();
	
	LoginPage login;
	InventoryPage invent;

	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		
		initialzation();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
	}

//	@Test(enabled=true)                                                      
//	public void verifyProductLogoTest()
//	{
//		String expProdLable = "PRODUCTS";//Not considered.
//	    String actProdLable = invent.verifyProductLable();
//		Assert.assertEquals(actProdLable, true);
//		Reporter.log("Product Lable title= " + actProdLable);
//	}
	
	@Test(enabled=true,groups ="Sanity")//using wrong
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
//	    Assert.assertTrue(invent.verifyPeekLogo());
	    Assert.assertEquals(result,false);
	}
	                                                                      
	@Test//using wrong
	public void VerifyProductTest() throws Exception
	{
		 String result = invent.VerifyProductCount();
		 Assert.assertEquals(result, "4");    //4 -true
	     Reporter.log("Product Total count =" + result);
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() 
	{
	  driver.close();
    }
}

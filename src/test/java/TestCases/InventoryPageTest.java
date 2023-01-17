package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;


public class InventoryPageTest extends TestBase{
//	InventoryPage invent ;// = new InventoryPage();
	
	LoginPage login;
	InventoryPage invent;

	@BeforeMethod
	public void setup() throws Exception
	{
		
		initialzation();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
	}
//	@Test
//	public void verifyUrlTest() throws Exception 
//	{
//	   String expUrl = "https://www.saucedemo.com/inventory.html";
//	   String actUrl = invent.verifyUrl();
//	   Assert.assertEquals(expUrl, actUrl);
//	   Reporter.log("Title of url opened:-"+ actUrl);
//	}
	@Test(enabled=true)                                                      
	public void verifyProductLableTest()
	{
		String expRes = "PRODUCTS";                     //"Products";//both r fail. when use exp ->PRODUCTS= then use false   //not used =>(actRes,true)
	    String actRes = invent.verifyProductLable();
	    Assert.assertEquals(expRes,	actRes);
		Reporter.log("Product Lable title= " +actRes);
	}
	
	@Test(enabled=true)
	public void verifyPeekLogoTest()
	{
		invent.verifyPeekLogo();
	    Assert.assertTrue(invent.verifyPeekLogo());
	}
	                                                                      
/*	@Test  //OR                                                                 
	public void verifySwagBotImgTest()                                    	
	{                                                                   
	boolean actResult = invent.verifySwagBotImg().isDisplayed();          	
	Assert.assertTrue(actResult);                                         	
	} */                                                                    
	@Test(enabled=false)
	public void verifySwagBotImgTest()
	{
		boolean actResult = invent.vrifySwagBotImg();
//		Assert.assertEquals(actResult, true); //Or
		Assert.assertTrue(actResult);
	}
	
	@Test(enabled=false)
	public void verifySwagLabsLogoTest()
	{
		   boolean result = invent.verifySwagLabsLogo();
		   Assert.assertEquals(result, true);
	}
	
	@Test(enabled=true)
	public void VerifyAddProductTest() throws Exception
	{
		invent.VerifyAddProduct();
		Reporter.log("URL of WebApp:-https://www.saucedemo.com/inventory.html" + invent);
	}

	@Test(enabled=false)
	public void VerifyRemoveProductTest() throws Exception
	{
		invent.VerifyRemoveProduct();
	}
	
	@Test
	public void VerifyProductCountTest() throws Exception
	{
		 String result = invent.VerifyProductCount();
		 Assert.assertEquals(result, "4");    //passed             //product total counted passed 4 elements->positive senarioes
//		 Assert.assertEquals(result, "2");    //failed             //product total counted passed 2 elements->negative senarioes
	     Reporter.log("Product Total count =" + result);
	}	
	
	@AfterMethod
	public void closeBrowser() 
	{
	  driver.close();
    }
}

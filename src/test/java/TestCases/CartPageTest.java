package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	
	@BeforeMethod
	public void setup() throws Exception
	{
	 initialzation();
	 login = new LoginPage();
     invent= new InventoryPage();
	 cart = new CartPage();
	 login.loginToApp();
	 invent.VerifyProductCount();
	}
		
	@Test(enabled=false)
	public void VerifyCartLableTest()
	{
	   boolean actRes = cart.VerifyCartLable();
	   Assert.assertEquals(actRes,true);
	}
	
	@Test(enabled=false)
	public void verifyUrlTest()
	{
		String expUrl = " https://www.saucedemo.com/cart.html";
		String actUrl = cart.verifyUrl();
	}
	
	@Test(enabled=false)
	public void verifyReactBurgerMenuBtnTest()
	{
		cart.verifyReactBurgerMenuBtn();
	}
	@Test(enabled=false)
	public void VerifyRemovebikeLightBtn1Test()
	{
		cart.VerifyRemovebikeLightBtn1();
	}
	@Test(enabled=false)
	public void VerifyProdCountingTest()
	{
		String result = cart.VerifyProdCounting();
		Assert.assertEquals(result, "3");
	}
	
	@Test(enabled=true)
	public void verifyCheckOutBtnTest()
	{
		String expRes = "https://www.saucedemo.com/checkout-step-one.html";
        String actRes = cart.verifyCheckOutBtn();
		Assert.assertEquals(actRes,expRes);
	}
	@Test
	public void verifyContinuShopingBtnTest()
	{
		cart.verifyContinuShopingBtn();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
	  driver.close();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package TestCases;             //execution

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadData;

public class LoginPageTest extends TestBase{
	LoginPage login ;// = new LoginPage();
	@BeforeMethod
	public void setup() throws Exception
	{
		initialzation();
		login = new LoginPage();
	}
	@Test(enabled=false)
	public void verifyTitleTest() throws Exception                                                    //LoginPage Title
    {
	String expTitle = ReadData.readPropertyFile("title");                                             //OR ->"Swag Labs";                                                                    //if(expTitle.equals(actTitle))     	               
    String actTitle = login.verifyTitle();                                                            //System.out.println("Title - Test case pass");  //else {
    Assert.assertEquals(expTitle, actTitle);                                                          //  System.out.println("Title - Test case failed");    	    
    Reporter.log("Title of the page:-" +expTitle );
    }
	@Test(enabled=true)
	public void verifyUrl_1Test() throws Exception                                                    //Login PageURL
	{
	   String expUrl = ReadData.readPropertyFile("url");                                             //"https://www.saucedemo.com/";
	   String actUrl = login.verifyUrl_1();
	   Assert.assertEquals(expUrl, actUrl);
	   Reporter.log("Current URL is:-"+expUrl);
	}
	@Test(enabled=true)
	public void verifyloginToApp_1() throws Exception  //By Properties method                          //Login the page and going to next Inventory pageURL
	{
		String expResult = ReadData.readPropertyFile("url2");                                         //or"https://www.saucedemo.com/inventory.html"; 
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Login to App & Obtained Url:-"+expResult);
	}
	@Test(enabled=false)
	public void verifyLoginToApp_2Test() throws Exception  //By Excel method
	{
		String expResult = "https://www.saucedemo.com/inventory.html";                                 // or url2
		String actResult = login.verifyLoginToApp_2();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Login to App & Obtained Url:-"+expResult);

	}
	@Test(enabled=true)
	public void verifyLableToInventoryPageTest() throws Exception                                      //Inventory page Lable
	{
		String expRes = ReadData.readPropertyFile("lable1");                                           //"PRODUCTS";
		String actRes = login.verifyLableToInventoryPage();
		Assert.assertEquals(expRes, actRes);
		Reporter.log("The Title Of InventoryPage is:-"+expRes);
	}
	
	//other test cases
	@Test(enabled=false)                                                                               //(enabled=false)-->means testcase is run/passed but on every run time is not required to run everytime. 
	public void verifyLoginLogoTest()
	{
	 boolean result	= login.verifyLoginLogo();
	 Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void verifyBotLogoTest()              
	{                                                                                                                      
	   boolean result = login.verifyBotLogo();                               
	   Assert.assertEquals(result, true);                                    
	}
	//OR //boolean expLogo = "";// boolean actLogo = login.verifyBotLogo();//if (expLogo(equals.actLogo))...->syso("true")else syso ("false") 
	
	@Test(enabled=false)
	public void verifyInputTextboxFocusedTest() throws Exception
	{
		login.verifyInputTextboxFocused();
	}	
	@Test(enabled=false)
	public void verifyInputTextboxclearTest() throws Exception
	{
		login.verifyInputTextboxclear();
	}
	@Test(enabled=false)
	public void verifyLoginBtnEnabledTest()
	{
		login.verifyLoginBtnEnabled();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}



















package TestCases1;             //execution

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadData;

public class LogPgTest extends TestBase{
	LoginPage login ;// = new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initialzation();
		login = new LoginPage();
	}
	@Test(enabled=true,groups ="Sanity")//using wrong
	public void verifyTitleTest() throws Exception                                                    //LoginPage Title
    {
	String expTitle ="Swag Labs";            // ReadData.readPropertyFile("title");                                             //OR ->"Swag Labs";                                                                    //if(expTitle.equals(actTitle))     	               
    String actTitle = login.verifyTitle();                                                            //System.out.println("Title - Test case pass");  //else {
    Assert.assertEquals(expTitle, actTitle);                                                          //  System.out.println("Title - Test case failed");    	    
    Reporter.log("Title of the page:-" +expTitle );
    }
	
	@Test(enabled=true,groups ="Sanity")
	public void verifyloginToApp_1() throws Exception  //By Properties method                          //Login the page and going to next Inventory pageURL
	{
		String expResult = ReadData.readPropertyFile("url2");                                         //or"https://www.saucedemo.com/inventory.html"; 
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult, actResult);
		Reporter.log("Login to App & Obtained Url:-"+expResult);
	}
		
	@Test(enabled=true)
	public void verifyLoginBtnEnabledTest()
	{
		login.verifyLoginBtnEnabled();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}



















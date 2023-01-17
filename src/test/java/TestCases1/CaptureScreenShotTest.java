package TestCases1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenShotTest extends TestBase {
	
	LoginPage login;//	= new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
	initialzation();
	login = new LoginPage();
	}
	@Test (enabled = true,groups = "Regression")
	public void verifyTitleTest() throws Exception
	{
	String	expTitle ="Swag1 Labs";
	String	actTitle =login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	@Test (enabled = true)
	public	void verifyUrlTest1() throws Exception
	{
	String	expTitle = "Swag Labs";
	String	actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	@Test (enabled = true)
	public void loginToAppTest() throws Exception
	{
	String	expRes	= "https://www.saucedemo.com/inventory.html";
	String	actRes	= login.loginToApp();
	Assert.assertEquals(expRes,	actRes);
	Reporter.log("URL of web application	:- " + actRes);
	}
//	@Test(enabled = false)
//	public	void verifyLabelofInventoryTest() throws Exception
//	{
//	String	expRes	= "PRODUCTS";
//	String	actRes	= login.verifyLabelofInventory();
//	Assert.assertEquals(expRes,	actRes);
//	Reporter.log("Label	Title :- " + actRes);
//	}
	@AfterMethod (alwaysRun	= true)
	public	void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())                          //when ITestResult (Interface) is FAILURE(like function) then these are compare(==) to status of failure page so used getStatus method. these provide status.          
		{
			System.out.println(ITestResult.FAILURE);    //integer type data provide :2 in syso.                       //if Interface ITestResult is failure ,then compare with status of webpage.
			System.out.println(a.getStatus());         //integer type data provide :2 in syso obtained by getStaus    //if getStatus provide failure status then by utility method capture the screenshot    
			UtilityMethod.CaptureScreenshot(a.getName());                 //like GetStatus provide Status of fail/pass same GetName give which  Method/TestCase method name should be failed.
		}
		driver.close();
	}
		
}

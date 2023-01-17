package TestCases1;                                                                                               //04.01.23

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsOnTest extends TestBase{
	
	LoginPage login;//=new LoginPage();
	
	@BeforeMethod
	public	void setup() throws	Exception
	{
	 initialzation();
	 login = new LoginPage();
	}
	
	@Test	
	public void	verifyTitleTest() throws Exception                                   //If Title test commented then( org.testng.TestNGException:) occure
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of web application :- "+actTitle);
	}
	
	@Test(dependsOnMethods ="verifyTitleTest")                                       //(dependsOnMethods ={"verifyTitleTest","verifyUrlTest"})->multiple dependent                             
	public void verifyloginToApp_1() throws	Exception                                //VerifyLoginToApp_1 test depends on verifyTitleTest..
	{
	String expRes = "https://www.saucedemo.com/inventory.html";
	String actRes =	login.loginToApp();
	Assert.assertEquals(expRes,	actRes);
	Reporter.log("URL of web application :- "+actRes);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
	}
}
	
//If a dependent method fails,All subsequent test methods is skipped NOT failed.	
//if verifyTitle is failed then both test cases are not passed means title test fail and loginToApp are skipped.	
//If title passed then loginToApp also passed bcoz loginToApp is depends on title method	
	
	
	



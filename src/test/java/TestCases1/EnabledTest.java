package TestCases1;                                                                                            //04.01.23

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class EnabledTest extends TestBase{
	
LoginPage login;//= new LoginPage();
	
	@BeforeMethod(alwaysRun	= true)                                                          //Always run this test--> before and after method so given true.
	public void setup()	throws Exception
	{
	initialzation();
	login = new LoginPage();
	}
	
	@Test(enabled=false)                                
	public	void verifyTitleTest()	throws Exception
	{
	String expTitle	= "Swag Labs";
	String actTitle	= login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of web application :- "+actTitle);
	}
	
    //0	1 -1 -200 -1000	12	34	= -1000	-200 -1	 0  1	12	34
	@Test(priority = -122)   //-20)    //5)
	public	void verifyTitleTest1()	throws	Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	@Test(priority = -122)   //4)
	public	void verifyTitleTest2()	throws	Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	
	@Test(priority = 3)
	public	void verifyTitleTest3()	throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of web application :- "	+actTitle);
	}
	@Test(priority = 2)
	public	void verifyTitleTest4()	throws	Exception
	{
	String	expTitle = "Swag Labs";
	String	actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle,actTitle);
	Reporter.log("Title	of web application:- "+actTitle);
	}
	@Test(priority=1)
	public	void verifyTitleTest5()	throws	Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}	

}
//when the method multiple times checked (minimum three times checked)
//then these method is not necessory to execute for multiple times ,so give (enabled=false) or else necessory to execute so give true.






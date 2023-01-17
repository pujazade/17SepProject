package TestCases1;                                                                                            //04.01.23

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase{
	
	LoginPage login;//= new LoginPage();
	
	@BeforeMethod(alwaysRun	= true)                                                          //Always run this test--> before and after method so given true.
	public void setup()	throws Exception
	{
	initialzation();
	login = new LoginPage();
	}
	//-5 -4 -3 -2 -1  0  1 2 3 4 5
	@Test(priority=0,groups	="Sanity")
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
//Q.HOW WE MANAGE THE SEQUENCE OF METHODS?
//->MANAGING THE SEQUENCE OF METHODS BY PRIORITY
//Q.HOW WE MANAGE THE SEQUENCE WHEN GIVEN SIMILAR PRIORITY?
//-> THE SEQUENCE OF SIMILAR PRIORITY MANAGING BY THE ALPHABETICAL ORDER OF METHODS.
//Q.CAN WE GIVE THE NEGATIVE PRIORITY TO METHOD AND WHAT IS THE RESULT?
//->YES ,RESULT IS FIRSTLY EXECUTE THE METHOD.
 
//priority method are used for user given the sequence of methods to execution time.	
//-1000 -122 -99 -20 -5 -4 -3 -2 -1    0   1 2 3 4 5 20 99 122 1000 (This is the line sequence)
//-> whenever negative values increases then these are first priority to execute.	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



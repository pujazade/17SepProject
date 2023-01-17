package TestCases1;             //InvocationCount,timeout, hardAssertion                                   //5.01.23


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase{
	
	LoginPage login;//	= new LoginPage();
	@BeforeMethod
	public void setup() throws Exception
	{
	initialzation();
	login = new	LoginPage();
	}
	
	//senario-1
	//keyword-> invocationCount
	@Test(invocationCount =	1,enabled = false)        //=3             
	public void verifyTitleTest() throws Exception
	{
	String expTitle	= "Swag Labs";
	String actTitle	= login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of web application :- "	+actTitle);
	}
	
//	//senario-2
//	//keyword-> timeout
//	@Test (timeOut = 2000)                //(timeout=200) //(timeout=2)
//	public void verifyTitleTest1() throws Exception
//	{
//	String expTitle = "1Swag Labs";       //="Swag Labs";
//	//Thread.sleep(1000);
//	String actTitle	= login.verifyTitle();
//	Assert.assertEquals(expTitle, actTitle);
//	Reporter.log("Title	of web application	:- "+ actTitle);
//	Assert.assertTrue(true);              //(fails);
//	}
	
	//senario-3
	//keyword-> Assertion(HardAssertion)
	@Test (timeOut = 2000)   
	public void verifyTitleTest2() throws Exception
	{
	String expTitle = "1Swag Labs";       //="Swag Labs";
	//Thread.sleep(1000);
	String actTitle	= login.verifyTitle();
//	Assert.assertEquals(expTitle, actTitle);
	Assert.assertEquals(expTitle, actTitle,"Test case fail zali	ka");
	System.out.println("This is	test case of title");                      //not runned or printed when test case failed
	Reporter.log("Title	of web application	:- "+ actTitle);
	Assert.assertTrue(true);              //(fails);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
//senario-1
//(invocationCount =1)->used for Retest multiple times,minimum three times runned or five times sufficient for real time.
//means these testCase run multiple times and executed everytime.

//senario-2
//(timeOut = 2000)-> used fot given time executed the testCase-->this keyword used for puropsefully failed testCase.
//way to puropsefully Failed-> 1.expResult is wrong; 2.timeout is given less time for timeout; 3. Assert.assertTrue(fails)

//senario-3
//HARD ASSERTION ->In both TestCases when we run Assert testCase is failed and another next TestCase is passed. this is hard assertion.
//HARD ASSERTION-> when Assertion failed then method get failed and internal statement of method is not printed in console. 
//In a hard assertion, Assertion gets fails(means exp is not same as actual )then 
//method should be also fail.So that the statement in the method should be not executed or not printed 
//bcoz assertion line fail and method is stoped.is called 'HARD ASSERTION'. 
//If we want to execute or print the statement then used the 'Soft Assert'.










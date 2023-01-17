package TestCases1;                                                                                              //5.01.23

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class FailedTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod
	public	void setup() throws	Exception
	{
	initialzation();
	login = new LoginPage();
	invent = new InventoryPage();
	login.loginToApp();
	}
	@Test
	public void Test1()
	{
	boolean	result = invent.verifyPeekLogo();                     //boolean logo is present in webpage, so result should be true->then passed but if given false ->then comapring both missmatched so failed
	Assert.assertEquals(result,	true);
	}
	@Test
	public	void Test2()
	{
	boolean	result = invent.verifyPeekLogo();
	Assert.assertEquals(result,	true);                 //false);
	}
	@Test
	public void	Test3()
	{
	boolean	result = invent.verifyPeekLogo();
	Assert.assertEquals(result,	true);
	}
	@Test
	public void Test4()
	{
	boolean	result = invent.verifyPeekLogo();
	Assert.assertEquals(result,	true);                 //false);
	}
	@Test
	public void Test5()
	{
	boolean	result = invent.verifyPeekLogo();
	Assert.assertEquals(result,	false);
	}
	@AfterMethod
	public	void closeBrowser()
	{
	driver.close();
	}
	//5	-- 3F	2P	=>	3F

}
//when IF total 5 TestCases->if 3 TestCase failed or not passed 
//then only those failed Tcase changed/IMPLEMENTED and runned to execute then we used the
//(refresh proj-> then test-output ->testing-failed.xml opend.)->these file shows which TC failed. 
//TC(2,4,5) failed showing xml file -> modify or changes implemented in this class manually and saved but runned TestNG on xml file
//everytime close the xml file and refresh proj after modifying and runned on xml file.

//becoz if we changed on this class then all passed TC also runned and waste our time so used the method.

//Q.WHAT IS FAILED XML FILE ? OR GIVEN ANY SENARIO FOR IF 5 TC GIVEN AND  3 ARE FAILED THEN ONLY 3 HOW CAN WE RUN ONLY ?
//->FAILED XML FILE IS TESTING OUTPUT FILE WHICH IS SHOWING ONLY FAILED TC AND AFTER MODIFIED OR CHANGES IMPLEMENTED 
//THEN ONLY THOSE CASES ARE EXECUTED BY RUNNED ON XML FILE AND WE WILL SAVE OUR TIME FOR EXECUTION.





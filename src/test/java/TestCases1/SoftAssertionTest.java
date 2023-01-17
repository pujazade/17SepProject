package TestCases1;                                                                                             //5.01.23

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class SoftAssertionTest extends TestBase {
	
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
	
	@Test(enabled=true)
	public void verifyPeekLogoTest()
	{
	System.out.println("Execution started");
	SoftAssert soft = new SoftAssert();
	boolean	result = invent.verifyPeekLogo();
//	soft.assertEquals(result, true);                                                                  //(result,true or failed);-> method not failed and console represent passed.
//	soft.assertEquals(result, false);                                                                 //these are completely executed method -> both printing statement1&2 printed.  
    Assert.assertEquals(result, false);                                                               //these are not completely executed method ->printing statement2 not printed bcoz on this line terminited method.
	System.out.println("Execution ended");
//	soft.assertAll();                                                                                 //assertAll method used for given proper real original result and also exception throw it by this method.
	}                                                                                                 //if assertAll not used then these give wrong result but this allowed in assertion
	
	@AfterMethod 
	public void closeBrowser()
	{
		driver.close();
	}
}
// Q.HAVE YOU USE ASSERTION? OR HOW YOUR GOING VALIDATE THE RESULT IN THE FRAMEWORK?
//->BY ASSERTION ->HOW?->THEIR ARE TWO ASSERTION TYPES HARD AND SOFT ->WE ARE USED BOTHS-> HARD ASSERTION FAILD THE METHOD BUT SOFT ASSERTION NOT FAILED THE METHOD.

//HARD->ASSERTION FAILED THEN METHOD SHOULD BE FAILED AND TESTCASE TERMINATED.
//SOFT->COLLECTS THE ERRORS DURING @TEST AND REMAINING THE STATEMENT WHICH IS EXECUTED.
//Soft Assert does not throw an exception when an assert fails and would continue with the next step after the assert statement. 
//if u want exception throw it,then u need to use assertAll() method ( lastly called them or) as a last statement @TEST and test suit again continue with next @test as it is.   
//We need to create an object to use SoftAssert which is not needed in Hard Assert

//Q. WE KNOW THAT NORMALLY SOFT ASSERTION SHOULD NOT THROW  EXCEPTION/ ERROR TO IT , WHEN ASSERT FAILED,SO
//,SO HOW WE COME TO KNOW THE TEST CASE HAS FAILED ? 
//OR HOW WE CAN PROVED THE TESTCASE FAILED WHEN SOFT ASSERTION FAILED ?
//-->WHEN SOFT ASSERTION FAILED,THEN METHOD IS NOT FAILED AND 
//ALSO NEXT STATEMENT OF METHOD SHOULD BE DISPLAYED/EXECUTED.(OPPOSITELY WORKED AS HARD ASSERTION) 
//BUT WE WANT TO PROVE THE METHOD IS FAILED THEN,
//We can use the last statement @TEST assertAll() method for prove the exception throw it and assert failed in soft assert.


















	
	
	
	
	
	
	
	
	
	
	
	



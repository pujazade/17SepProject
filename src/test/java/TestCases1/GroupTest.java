package TestCases1;                                                                                            //04.01.23

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase{
	
	LoginPage login; //= new LoginPage();

	@BeforeMethod(alwaysRun	= true)   
	public void Setup() throws Exception 
	{
		initialzation();
		login = new LoginPage();
	}

	@Test(groups ={"Sanity","Regression"})
	public void Test1() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle	= login.verifyTitle();
	AssertJUnit.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	
	@Test(groups = "Smoke")
	public void Test2() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle	= login.verifyTitle();
	AssertJUnit.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void Test3() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle	= login.verifyTitle();
	AssertJUnit.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
	
	@Test(groups = "Sanity")
	public void Test4() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle	= login.verifyTitle();
	AssertJUnit.assertEquals(expTitle, actTitle);
	Reporter.log("Title	of	web	application	:- "+actTitle);
	}
    
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}
//suit run=>
//Right click on groupTest->TestNG->convert into TestNG->if wanted give to the name,  then location give /name or by browse and then finished.
//browse->project17sep>src->test->Testing-> finished.

//src/test/resources->testing.xml->Before <classes>

/*<groups>
<run>
<include name="Sanity"></include>
</run>
</groups> */ //like that


/*senario-1
->  <groups> <run>   <include name="Sanity"></include>  <run> <groups> 
<classes>	 <class name="TestCases1.GroupTest"/>               // Testcases1 is packagename and grouptest is classname
=>only Sanity suit are executed.

//senario-2
    <groups> <run>   <include name="Regression"></include>  <run> <groups> 
<classes>	 <class name="TestCases1.GroupTest"/>    <class name="TestCases1.PriorityTest"/>  
=>only regression are executed.

//senario-3
 TAG NAME =>   <groups>, <run> , <include>
<groups> <run>   <include name="Regression">   <exclude name = "smoke" </exclude>  </include>  <run> <groups>  <classes>	
=>only regression seperately given are executed in any class, but not with smoke suite combinely given.means smoke is skipped or not runed.
*/
//include used for add
//exclude used for chyvyaterikt. hey sodun.













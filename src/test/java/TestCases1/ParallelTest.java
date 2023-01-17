package TestCases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest{
	
	
//	LoginPage login = new LoginPage();                                            //SENARIO-2  // firstly create object like this For TestForAnyTestMethod()and  used any testcase to run.                 
	
	@Test
	public void Test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(5000);
	    driver.close();
	}
	@Test
	public void Test2() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void Test3() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void Test4() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(5000);
		driver.close();
	}
	//SENARIO-2
//	@Test
//	public void TestForAnyTestMethod() throws Exception
//	{
//		WebDriverManager.chromedriver().setup();
//	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.saucedemo.com/");
//	    login.verifyLoginBtnEnabled();
//	    Thread.sleep(5000);   	    
//	    driver.close();
//	}
}
//RUNNED THIS PROGRAM BY PARALLEL.XML 
//(RIGHT CLICK ON PARALLELTEST AND CONVERT INTO TESTNG ->BROWSE-> SRC->TEST->RESOURCES->FINISH->/NAME.XML->AND BELOW PARALLEL MODE: METHODS-> FINISH)
//AND THEN RUN.
//THREAD COUNT IN XML FILE -> IF TC =4 THEN USING BELOW IS ALLOW BUT  (MORE THAN 4 (THREAD COUNT=10) IS NOT USING MEANS IF GIVEN 10 THEN NOT ALLOW BCOZ OUR TC IS ONLY 4, SO ONLY 4 BROWSERS OPENED.
//Q. IF YOU GIVEN MULTIPLE TEST CASES, THEN HOW YOU CAN EXECUTE IN MIN.GIVEN TIMEOUT ?
//-> WE USE IN AUTOUMATION -> BY PARALLEL.XML RUN.
//-> WE USE IN MANUAL -> BY PRIORITY GIVEN THE TEST CASES AS CONSIDER FIRSTLY FUNCTIONALITY.

//SENARIO-2
//IF WE WANT ANY METHOD ON PAGE TO EXECUTE THEN USED BY SECOND SENARIO.










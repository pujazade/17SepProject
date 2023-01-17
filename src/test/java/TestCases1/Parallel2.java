package TestCases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2{
	
	@Test
	public void Test5() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void Test6() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://meet.google.com/");
		Thread.sleep(5000);
		driver.close();
	}
}



//parallelBoth.xml created by ParallelTest and Parallel2
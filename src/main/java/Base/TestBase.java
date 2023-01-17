package Base;                    //initialize or parent class

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;                            //global and public //then static
	public void initialzation() throws Exception {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ReadData.readPropertyFile("url"));         //ReadData (is a Class)in readPropertyFile(method) passed the url (key) only.
//		driver.get("https://www.saucedemo.com/");             //so don't need this hard core url
		

		
		
		

		
		
	}
}
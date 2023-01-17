package Utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase{
	
	public static  void selectClass(WebElement ele,String option)  //dropdown               //whenever method is not displayed in another page which have been needed then for displayed this mehthod used static. 
	{
		Select s = new Select(ele);                                              //which Webelement typed  ele is present in webpage 
		s.selectByVisibleText(option);                                           //which need or pass the 'option' should be selected these data type is String
	}

	public static void CaptureScreenshot(String name) throws Exception
	{
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project17Sep22\\ScreenShot\\"+name+".jpeg");        //added "+name+"  //photo.jpeg removed.
        org.openqa.selenium.io.FileHandler.copy(source, destination); 
	}
	
		
}

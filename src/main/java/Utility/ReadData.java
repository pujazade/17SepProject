package Utility;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	//ReadPropertyfile or ReadExcelFile are both used same function for verify URL.
	public static String readPropertyFile(String value) throws Exception                                                                  //public void readPropFile()->static->(String value)argument passes which is stored in conf.prop.file 
	                                                                                                                                      //and below method should be get these property value by getProperty method with same argument passes(value)
//property method 	                                                                                                                                      //and then String is replaced by String to give the return value. 
	 {
	   Properties p = new Properties();
	   FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Project17Sep22\\TestData1\\config.properties");//location given for config.properties file in TestData.
	   p.load(file);                                                                                                                      //Load the file as using /stored in variable.
       return p.getProperty(value);                                                                                                       //getProperty METHOD passes (value)available in config.properties file are used as a value consider as a key is apply in TestBase to readData.
	 }
//Excel method 
//	public static String readExcelFile(int row,int col) throws Exception
//	{
//		FileInputStream file = new FileInputStream("D:\\ss.xlsx");
//	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
//	    String value = excel.getRow(row).getCell(col).getStringCellValue();
//	    return value;
//	}
	public static String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Project17Sep22\\TestData1\\Book1.xlsx");
	    Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value = excel.getRow(row).getCell(col).getStringCellValue();
	    return value;
	}
	
}

package Pages;             //Logical code declared.    //design or declaration

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{
	
	//Object Repository                                                          //Object Repository :- which element is findout those are showing by them.
	@FindBy(xpath = "//div[@class='login_logo']")private WebElement LoginLogo;   //(Encapsulation)dataMember Private:-  //these are showing (encaps declar)as data member is private.
	@FindBy(xpath = "//div[@class='bot_column']")private WebElement BotLogo;     //why data privateData used?->bcoz logo is objectDataMember->private is data and whichType- webelement type data
	@FindBy(xpath = "//input[@id='user-name']")private WebElement username;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement LoginBtn;
	
	@FindBy(xpath = "//span[text()='Products']")private WebElement ProductLable;
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[1]")private WebElement peekLable;
    @FindBy(xpath = "//a[@id= 'item_4_title_link']") private WebElement BagLogo;
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement SwagLabsLogo;
	//driver.findElement(By.xpath("//div[@class='login_logo']"));                //not used in framework
	
   //CONSTRUCTOR:- to initialize the element of page
	public LoginPage()                                                                                       //constructor consist bcoz driver has to be needed to used.
	{
		PageFactory.initElements(driver, this);                                                             //initialize with driver by default or automatically run so used constructor and this current class
	}
	
	public String verifyTitle() throws Exception                                                            //void replaced by String
	{
		Thread.sleep(2000);
		return driver.getTitle();                                                                           // added return-> Stored , String datatype ->output
	}
	
	public String verifyUrl_1() throws Exception                                                             //LoginURL  
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();                                                                       //first page url
	}
	//Propertyfile
	public String loginToApp() throws Exception                                                      //LoginAnd getInventoryURL
	{
		username.sendKeys(ReadData.readPropertyFile("username"));                                            //UserName.sendKeys("standard_user");->//Hardcore to store
		password.sendKeys(ReadData.readPropertyFile("password"));                                            //password.sendKeys("secret_sauce");
		LoginBtn.click();
	    return driver.getCurrentUrl();                                                                       //second obtained url->inventoryUrl
	}
	//ExcelFile
	public String verifyLoginToApp_2() throws Exception
	{
		username.sendKeys(ReadData.readExcelFile(0,0));
		password.sendKeys(ReadData.readExcelFile(0,1));
		LoginBtn.click();
        return driver.getCurrentUrl();                                                                       //same //second obtained url->inventoryUrl
	}
    public String verifyLableToInventoryPage() throws Exception  //InventoryLable
    {
    	loginToApp();
    	return ProductLable.getText();
    }
	
 
    
//other Test cases   
	public boolean verifyLoginLogo()                                                                        //(Encapsulation)method public :- //these are showing (encaps declar)as data method should be public.
	{
	    return LoginLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
	    return BotLogo.isDisplayed();
	}
	
	public void verifyInputTextboxFocused()
	{
		username.isEnabled();
		password.isEnabled();
	}
	public void verifyInputTextboxclear() throws Exception {
		username.sendKeys("standard_user");
		username.clear();
		username.sendKeys("locked_out_user");
		username.clear();
		username.sendKeys("problem_user");
		username.clear();
		username.sendKeys("performance_glitch_user");
		username.clear();
		password.sendKeys("secret_sauce");
		password.clear();
		}
	public void verifyLoginBtnEnabled()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		LoginBtn.click();
	}
	
	
	
}

//@FindBy:- is a annutation. 
//driver:- is performed the automation script handled or script runed.So it is needed to use.
/*Q.WHY CONSTRUCTOR IS USED/WHY METHOD IS NOT USED FOR DRIVER?
//->Constructor used bcoz whenever object created then by default constr they get call automatically datamember or object, 
//But if method used replaced as constructor place then purposefully they will tell that, method should be called the object.so constructor used.
 */ 
 
 
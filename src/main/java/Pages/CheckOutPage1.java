package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckOutPage1 extends TestBase{
	//Object Repository	
	@FindBy(xpath="//span[@class='title']") private WebElement CheckoutTitleLable;
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstNameTextbox;
	@FindBy(xpath="//input[@id='last-name']") private WebElement LastNameTextbox;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement postalCodeTextbox;
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancelBtn;
	@FindBy(xpath="//input[@id='continue']") private WebElement ContinueBtn;
	
	//Constructor
	public CheckOutPage1()
	{
		PageFactory.initElements(driver, this);
	}
	//VERIFY CHECKOUT TITLE LABLE IS DISPLAYED IN CURRENT PAGE
	public boolean VerifyCheckoutTitleLable()
	{
		return CheckoutTitleLable.isDisplayed();
	}
	//VERIFY THE ENTER THE VALUE IN TEXTBOX AND ALSO CLEAR THESE ENTERED VALUES
	public void verifyEnterTextbox() throws Exception
	{
		firstNameTextbox.sendKeys("puja");
		LastNameTextbox.sendKeys("Zade");
		postalCodeTextbox.sendKeys("431456");
		firstNameTextbox.clear();
		LastNameTextbox.clear();
		postalCodeTextbox.clear();
	  
	}
	//VERIFY CANCEL BUTTON IS CLICKABLE AND GET THE TITLE ON BACK PAGE
	public String VerifyCancelBtn() throws Exception
	{
		firstNameTextbox.sendKeys("puja");
		LastNameTextbox.sendKeys("Zade");
		postalCodeTextbox.sendKeys("431456");
	    cancelBtn.click();
	    return driver.getTitle();
	}
	//VERIFY TEXTBOX ENTERED VALUES BY READDATA AND CONTINUE BUTTON IS ENABLED TO CLICK
	public void verifyTextboxToAdd() throws Exception       //By Property method
	{
		firstNameTextbox.sendKeys(ReadData.readPropertyFile("firstname"));
		LastNameTextbox.sendKeys(ReadData.readPropertyFile("lastname"));
		postalCodeTextbox.sendKeys(ReadData.readPropertyFile("postalcode"));
		Thread.sleep(5000);
		ContinueBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

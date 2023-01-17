package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ChOutPage2 extends TestBase{
	
	//object Repository
	@FindBy(xpath = "//span[@class='title']")private WebElement checkoutOverviewLable;
	@FindBy(xpath = "(//div[@class='cart_item_label'])[1]")private WebElement bikeLightDescription;
	@FindBy(xpath = "(//div[@class='cart_item_label'])[2]")private WebElement fleesJacketDescription;
	@FindBy(xpath = "(//div[@class='cart_item_label'])[3]")private WebElement boltTshirtDescription;
	@FindBy(xpath = "//div[text()='Payment Information:']")private WebElement Summary1;
	@FindBy(xpath = "//div[text()='SauceCard #31337']")private WebElement Value1;
	@FindBy(xpath = "//div[text()='Shipping Information:']")private WebElement Sum2;
	@FindBy(xpath = "//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement Val2;
	@FindBy(xpath = "//div[@class='summary_subtotal_label']")private WebElement Sum3;
	@FindBy(xpath = "//div[@class='summary_tax_label']")private WebElement sValA3;
	@FindBy(xpath = "//div[@class='summary_total_label']")private WebElement sValB3;
    @FindBy(xpath= "//button[@id='cancel']")private WebElement CnclBtn;
    @FindBy(xpath= "//button[@id='finish']")private WebElement FinishBtn;
	
	public ChOutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCheckOverviewLable()
	{
		return checkoutOverviewLable.isDisplayed();
		
	}
	public boolean verifyDescription()
	{
		bikeLightDescription.isDisplayed();
		fleesJacketDescription.isDisplayed();
		return boltTshirtDescription.isDisplayed();
	}
	
//	public boolean verifyfleesJacket()
//	{
//		return fleesJacketDescription.isDisplayed();
//	}
//	public boolean verifyboltTshirt()
//	{
//		return boltTshirtDescription.isDisplayed();
//	}
	public boolean verifySummary()
	{
		 Summary1.getText();                        //same function
//		 Summary1.isDisplayed();
		 Value1.isDisplayed();
		 Sum2.isDisplayed();
		 Val2.isDisplayed();
		 Sum3.isDisplayed();
		 sValA3.isDisplayed();
		 return sValB3.isDisplayed();
	}

	public String VerifyCnclBtn()
	{
		CnclBtn.click();
		return driver.getTitle();
	}
	public String VerifyFinishBtn()
	{
		FinishBtn.click();
		return driver.getCurrentUrl();
	}
	
	

}

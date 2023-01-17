package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ChOutCompletePage extends TestBase{

	@FindBy(xpath = "//img[@class='bm-icon']")private WebElement bmLable;
	@FindBy(xpath = "//span[@class='title']")private WebElement checkoutLogo;
//	@FindBy(xpath = "//h2[@class='complete-header']")private WebElement thnkuText;
//	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thnkuText;
    @FindBy(className="complete-header") private WebElement thankuText;
    @FindBy(id="back-to-products") private WebElement backToHomeBtn;
//	@FindBy(xpath = "//button[text()='Back Home']")private WebElement backToHomeBtn;
//	@FindBy(xpath = "//button[@id='back-to-products']")private WebElement backToHomeBtn;


	public ChOutCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyBmLable()
	{
		return bmLable.isDisplayed();		
	}
	public boolean verifycheckoutLogo()
	{
		return checkoutLogo.isDisplayed();		
	}
	public String verifyThnkuText()
	{
		return thankuText.getText();
			
	}
	public String verifyBackToHomeBtn() throws Exception
	{
		backToHomeBtn.click();
		Thread.sleep(1000);
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	

}

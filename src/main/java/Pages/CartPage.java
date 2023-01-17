package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
//Object Repository
	@FindBy(xpath = "//span[text()='Your Cart']")private WebElement yourCartTitleLable;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement reactBurgerMenuBtn;
	@FindBy(xpath = "//button[@id='checkout']")private WebElement CheckOutBtn;
	@FindBy(xpath = "//button[@id='continue-shopping']")private WebElement ContinuShopingBtn;
	@FindBy(xpath="(//button[text()='Remove'])[1]") private WebElement RemoveBtn;     //or direcly id used replaced by xpath
	@FindBy(id="remove-sauce-labs-bike-light") private WebElement RemovebikeLightBtn1 ; 
	@FindBy(id="remove-sauce-labs-fleece-jacket") private WebElement RemovefleesJacketBtn2 ;
	@FindBy(id="remove-sauce-labs-bolt-t-shirt") private WebElement RemoveboltTshirtBtn3 ;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")	private	WebElement productCount;
	
//Constructor
	public CartPage()
	{
		PageFactory.initElements(driver, this);        //when extends TestBase then driver is able to get	
	}
	//VERIFY CARTLABLE AS TO DISPLAYED
	public boolean VerifyCartLable()
	{
		return yourCartTitleLable.isDisplayed();
	}
	//VERIFY CURRENT PAGE URL
	public String verifyUrl()
	{
		return driver.getCurrentUrl(); 
	}
	//VERIFY REACT BURGER MENU BUTTON IS AVAILABLE AND IT IS ENABLED(IT IS AVAILABLE ALL PAGES)
	public void verifyReactBurgerMenuBtn()
	{
		reactBurgerMenuBtn.isEnabled();
		
	}
	//VERIFY REMOVED ANY ONE IN ALL ADDED PRODUCTS BY CLICKING THE BUTTON
	public void VerifyRemovebikeLightBtn1()
	{
	  RemovebikeLightBtn1.click();
	  
	}
	//VERIFY PRODUCT COUNTING AFTER REMOVED ANY ONE
	public String VerifyProdCounting()
	{
		VerifyRemovebikeLightBtn1();
		productCount.click();
		return productCount.getText();
	}
	//VERIFY TO CONTINUE SHOPING BUTTON IS CLICKABLE AND GET RETURN BACK TO THE PAGE FOR SHOPPING AND GET BACK URL
	public String verifyContinuShopingBtn()
	{
		ContinuShopingBtn.click();
		return driver.getCurrentUrl();
	}
	//VERIFY THE CHECKOUT BUTTON IS CLICKABLE TO GO AWAY ON NEXT PAGE AND GET NEXT URL
    public String verifyCheckOutBtn()
    {
    	CheckOutBtn.click();
		return driver.getCurrentUrl();
    	
    }

	
	
	

}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Utility.UtilityMethod;

//import Base.TestBase;

public class  InventoryPage extends TestBase{
	//Object Repository 
	@FindBy(xpath = "//div[@class='peek']")	private	WebElement peekLogo;                                             //peek logo
	@FindBy(xpath = "//span[text()='Products']")private WebElement ProductLable;                                      //front logo
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement SwagLabsLogo;	                                     //front middleupper logo
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement swagBotImg;                                  //bottom img
	@FindBy(id = "add-to-cart-sauce-labs-backpack")	private	WebElement bagpack;                                      //Addcartbtn1
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;                                  //Add2
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")	private	WebElement boltTshirt;                               //Add3
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement fleesJacket;                             //Add4
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement	sortProductDropdown;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")	private	WebElement productCount;
	@FindBy(id = "remove-sauce-labs-backpack")	private	WebElement Removebagpack;                                    //Addcartbtn1
	@FindBy(id = "remove-sauce-labs-bike-light")	private	WebElement RemovebikeLight;                              //Addcartbtn1
	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")	private	WebElement RemoveboltTshirt;                             //Addcartbtn1
	@FindBy(id = "remove-sauce-labs-fleece-jacket")	private	WebElement RemovefleesJacket;                            //Addcartbtn1


	//constructor
	public InventoryPage() throws Exception                                                          
	{
		PageFactory.initElements(driver, this);		
	}
	//verify URL
//	public String verifyUrl() throws Exception
//	{
//		Thread.sleep(2000);
//		return driver.getCurrentUrl();
//	}
	//VERIFY PRODUCTLABLE TEXT
	public String verifyProductLable()
	{
      return ProductLable.getText();                                    //	return ProductLable.isDisplayed();(boolean)
	}
	//VERIFY PEEKLOGO AS TO DISPLAYED
	public boolean verifyPeekLogo()
	{
	  	return peekLogo.isDisplayed();
	}
	                                                                    //also one method
//	public WebElement verifySwagBotImg()                                //	public boolean vrifyswagBotImg() 
//	{                                                                   //{
//		return this.swagBotImg;                                         //  return swagBot.isDisplayed();
//	}                                                                   //}
	//VERIFY SWAGBOT IMG AS TO DISPLAYED
	public boolean vrifySwagBotImg() 
	{
		return swagBotImg.isDisplayed();	
	}
	//VERIFY SWAGLABSLOGO AS TO DISPLAYED
	public boolean verifySwagLabsLogo()
	{
		return SwagLabsLogo.isDisplayed();
	}
	
    //VERIFY ALL ELEMENTS ARE ADDED BY SORTPRODUCT DROPDOWN USING BY UTILITY METHOD
	public void VerifyAddProduct() throws Exception                                         //sortProductDropdown-> WebElement passed in SelectMethod.
	{
		UtilityMethod.selectClass(sortProductDropdown, "Name (Z to A)"); //OR used 
//		Select s = new Select(sortProductDropdown);
//		s.selectByVisibleText("Name (Z to A)");
		bagpack.click();
		bikeLight.click();
		fleesJacket.click();
		boltTshirt.click();
		Thread.sleep(3000);	
	}
	
	//VERIFY REMOVED ANYONE PRODUCT FROM ADDED ALL PRODUCT COUNTDOWN. 
	public void VerifyRemoveProduct() throws Exception                                      //removed the added element on current page
	{
		VerifyAddProduct();
		RemoveboltTshirt.click();                                                            
	}
	
	//VERIFY ADDED PRODUCT COUNT
	public String VerifyProductCount() throws Exception
	{
		VerifyAddProduct();
		Thread.sleep(3000);
		productCount.click();
		return productCount.getText();                                                    //return method is a last method or statement'because it is not reachable' ,so click method is used in before the return method.
	
		//productCount.getSize();//not required
	
	}
	
}



//@FindBy(xpath= "//div[@class = 'peek']") private WebElement peekLogo;
//@FindBy(xpath = "//a[@id= 'item_4_title_link']") private WebElement BagLogo;
//@FindBy(xpath= "//div[@id='inventory_container']//div[6]//button")private WebElement AddCartBtn;
//@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[1]")private WebElement peekLable;

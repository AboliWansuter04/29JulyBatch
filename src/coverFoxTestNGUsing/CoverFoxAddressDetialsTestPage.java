package coverFoxTestNGUsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetialsTestPage
{
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincodeNumberFiled;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumberFiled;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement contButtonClick;
	
	public  CoverFoxAddressDetialsTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void pincodeno(String pincode)
	{
		pincodeNumberFiled.sendKeys(pincode);
	}
	public void mobno(String mobileno)
	{
		mobNumberFiled.sendKeys(mobileno);
	}
	public void clickonContButton() 
	{
		contButtonClick.click();
	}
	
	}
	
	
	




package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  CoverFoxAddressDetials
{

	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincodeNumberFiled;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumberFiled;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement contButtonClick;
	
	public CoverFoxAddressDetials(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void pincodeno1()
	{
		pincodeNumberFiled.sendKeys("441111");
	}
	public void mobno()
	{
		mobNumberFiled.sendKeys("7709126281");
	}
	public void clickonContButton() 
	{
		contButtonClick.click();
	}
	
	}


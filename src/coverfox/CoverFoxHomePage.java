package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage 
{
	@FindBy(xpath = "//div[text()='Female']")private WebElement genderClick;
     
	public CoverFoxHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	 public void clickOnFemaleButton()
	 {
		 genderClick.click();
	 }
}

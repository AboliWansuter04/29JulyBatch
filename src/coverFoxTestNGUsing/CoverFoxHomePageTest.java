package coverFoxTestNGUsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePageTest
{
	@FindBy(xpath = "//div[text()='Female']")private WebElement genderbutton;
    
	public  CoverFoxHomePageTest(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	 public void clickOnFemaleButton()
	 {
		 
		genderbutton.click();
	 }

}

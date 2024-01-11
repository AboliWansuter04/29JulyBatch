package CoverFoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePageTest1 
{
	

@FindBy(xpath = "//div[text()='Female']")private WebElement genderbutton;

public  CoverFoxHomePageTest1(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}
 public void clickOnFemaleButton()
 {
	 
	genderbutton.click();
 }
}
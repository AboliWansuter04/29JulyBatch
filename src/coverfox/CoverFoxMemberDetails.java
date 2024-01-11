package coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class  CoverFoxMemberDetails 
{
 @FindBy(id = "Age-You")  private WebElement ageisselect;
 @FindBy(className = "next-btn")private WebElement nextbutton2;
 
  public  CoverFoxMemberDetails(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void age() 
  {
	   Select s = new Select(ageisselect);
	   s.selectByValue("30y");
	   
  }
  public void clickOnNextBut2() 
  {
	  nextbutton2.click();
  }
}

package freamWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheck
{
	//variable
 @FindBy(id = "checkout")private WebElement checkoutbutton;
 @FindBy(id = "first-name")private WebElement firstnamefiled;
 @FindBy(id = "last-name")private WebElement lastnamefiled;
 @FindBy(id = "postal-code")private WebElement zipcodefiled;
 @FindBy(id = "continue") private WebElement contbutton;
 
 //constructor
 public SwagLabCheck(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 
 }
 //methods
 public void checkbutton() 
 {
	 checkoutbutton.click();
 }
 public void firstnames()
 {
	 firstnamefiled.sendKeys("Aboli");
 }
 public void lastname() 
 {
	 lastnamefiled.sendKeys("Wansutre");
 }
 public void postalcode()
 {
	 zipcodefiled.sendKeys("441111");
 }
 public void contbuttonclick()
 {
	 contbutton.click();
 }
 
 
 
}

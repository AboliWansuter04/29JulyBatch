package freamWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagInventoryUsing
{
//Variable
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")private WebElement backpack;
	@FindBy(name="add-to-cart-sauce-labs-bike-light")private WebElement bikelight;
	@FindBy(id="shopping_cart_container")private WebElement cartButton;
	
//Constructor
	public SwagInventoryUsing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Method
	
	public void backpackitem()
	{
		backpack.click();
	}
	public void bikelightitem()
	{
		bikelight.click();
	}
	public void addtoshortcart() 
	{
		cartButton.click();
	}
	
	
	
}

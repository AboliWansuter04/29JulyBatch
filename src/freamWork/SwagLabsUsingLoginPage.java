package freamWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsUsingLoginPage
{
//Variable==WebElement
	@FindBy(name = "user-name") private WebElement userNameFiled;
	@FindBy(id = "password")private WebElement passwordFiled;
	@FindBy(id="login-button" ) private WebElement loginButtonClick;
	
	//Constructor
	public SwagLabsUsingLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void enterUserName()
	{
		userNameFiled.sendKeys("standard_user");
	}
	public void enterPassword()
	{
		passwordFiled.sendKeys("secret_sauce");
	}
	public void loginButtonClick()
	{
		loginButtonClick.click();
	}
	
}

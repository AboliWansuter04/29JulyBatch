package freamWork;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_No1 {

	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		WebElement userName=driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("login-button"));
		
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		WebElement jacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		jacket.click();
		
		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		cartButton.click();
		
		List<WebElement> cartItem = driver.findElements(By.className("inventory_item_price"));
		System.out.println("Number of items "+cartItem.size());
		
		for(WebElement ci:cartItem)
		{
			System.out.println("Items "+ci.getText());
			
		}
		
		Iterator<WebElement> it=cartItem.iterator();
		WebElement itemNo1 = it.next();
		
		if(itemNo1.getText().equals("Sauce Labs Fleece Jacket"))
		{
			System.out.println("Selected item is correct ==> Sauce Labs Fleece Jacket");
		    //driver.findElement(By.name("checkout")).click();
		}
		else
		{
			System.out.println("Selected item is not correct");
			driver.findElement(By.name("checkout")).click();
		}
		
		// put your name,last name,and zipCode
		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement postalCode = driver.findElement(By.name("postalCode"));
	    WebElement contButton = driver.findElement(By.name("continue"));
	    
	    firstName.sendKeys("Aboli");
	    lastName.sendKeys("Tambat");
	    postalCode.sendKeys("444111");
	    contButton.click();
	    
	    WebElement finishButton = driver.findElement(By.name("finish"));
	    finishButton.click();
	    
	    WebElement TYMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
	    
	    if(TYMsg.getText().equals("Thank you for your order!"))
	    {
	    	System.out.println("Thank you massage is displayed..logging out");
	    	driver.findElement(By.id("react-burger-menu-btn")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("logout_sidebar_link")).click();
	    }
	    else
	    {
	    	System.out.println("Thank you massage not displayed  check");
	    }
	  
	    
	}

}

package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayeduse {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(1000);
        
       boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
       System.out.println(" Display status " +result);
       Thread.sleep(2000);
       
       driver.findElement(By.name("show-hide")).sendKeys("Hi Hello");
       

       
	}

}

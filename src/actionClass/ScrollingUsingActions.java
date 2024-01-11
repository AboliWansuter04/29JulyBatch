package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement sun = driver.findElement(By.id("sunday"));
		WebElement mon = driver.findElement(By.id("monday"));
		WebElement tue = driver.findElement(By.id("tuesday"));
		WebElement sat = driver.findElement(By.id("saturday"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(sun).perform();
		
		Thread.sleep(1000);
		sun.click();
		
		
	}

}

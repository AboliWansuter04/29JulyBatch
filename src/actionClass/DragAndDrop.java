package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement sour = driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.id("droppable"));
        
		Actions act=new Actions(driver);
		//act.moveToElement(sour).clickAndHold().moveToElement(tar).release().build().perform();
		//act.clickAndHold(sour).release(tar).build().perform();
	    act.dragAndDrop(sour, tar).perform();
	    
	}

}

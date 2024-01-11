package dropdownstudyis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsselectUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drdw = driver.findElement(By.id("cars"));
		
		Select sr=new Select(drdw);
		System.out.println(sr.isMultiple());
		sr.selectByVisibleText("Saab");
		Thread.sleep(1000);
		
		sr.selectByIndex(3);
	    Thread.sleep(2000);
	    
	    sr.selectByValue("audi");
	    Thread.sleep(500);
	   // sr.deselectByIndex(3);
	    
	    sr.deselectByValue("volvo");
	    Thread.sleep(500);
		
	    sr.deselectAll();
	    

	}

}

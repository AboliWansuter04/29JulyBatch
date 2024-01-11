package Ifreame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFramesN {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    Thread.sleep(1000);
	    
	   String mainpagetext1 = driver.findElement(By.xpath("//li[contains(text(),'Frames Example')]")).getText();
	   System.out.println("Text on main page is "+mainpagetext1);
	
	   driver.switchTo().frame("frame1"); //switching selenium focus from main page to frame 1(outer frame)
	    // writing in text box present in outer frame 
	
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium practice1");
	   
	   // Checking check box
	   Thread.sleep(1000);
	   driver.findElement(By.id("a")).click();
	   
	   // clearing text from parent frame (outer frame /frame1) text box
	   driver.switchTo().parentFrame();
	   driver.findElement(By.xpath("//input[@type='text']")).clear();
	
	   // want to handle drop down from another frame 
	   //need to switch selenium focus outer frame to main page --n then main to another frame 
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame("frame2");
	   
	   WebElement animalsdropdown = driver.findElement(By.id("animals"));
	   Select s= new Select(animalsdropdown);
	   s.selectByIndex(1);
	   driver.switchTo().defaultContent(); // getting text from main page
	   String mainpagetext2 = driver.findElement(By.xpath("//span [text()='Not a Friendly Topic']")).getText();
	   System.out.println("text main page is  "+mainpagetext2);
	   
	   
	   
	}

}

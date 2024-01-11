package dropdownstudyis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//CSS Seletors
		//Tag and id-- css=tag#id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("swarali10.com");
		
		//tag and class--css=tag.class
		//driver.findElement(By.cssSelector("class._42ft ")).click();
		
		// tag and atrribute-- css=tag[attribute=value]
		//driver.findElement(By.cssSelector("button[name=login]")).click();
		
		
		
		
		
		
		
	}

}

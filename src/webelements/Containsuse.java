package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsuse {

	public static void main(String[] args) throws InterruptedException {
	 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// Xpath contain with text
		//driver.findElement(By.xpath("//h2[contains(text().'Facebook helps you connect and share with the people in your life.')]")).click();
		
		//Xpath contains with attribute
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("12345");
		
	}

}

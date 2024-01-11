package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdandName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
       // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@in.co.com");
        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@in.co.com");
        
        //locator-->id
      //driver.findElement(By.id("email")).sendKeys("demo@gmail.com");
        //locator-->
        driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
      Thread.sleep(2000);
      driver.findElement(By.name("email")).clear();
      
}
}

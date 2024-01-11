package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mockintervq {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h2[text()=\"Starting ₹199 | Shoes & handbags\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h2[text()=\"Up to 70% off | Deals on Amazon Brands & more\"]")).click();

	}

}

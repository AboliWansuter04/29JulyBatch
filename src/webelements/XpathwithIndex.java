package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='sc-ifAKCX gLwVlD'][1]")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//div[@class='sc-ifAKCX gLwVlD'][2]")).sendKeys("Pune");

	}

}

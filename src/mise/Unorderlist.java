package mise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderlist {

	

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Laptop");
		 List<WebElement> searchres=driver.findElements(By.xpath("//div[@class='A8SBwf emcav']"));
		
		for(WebElement sr:searchres)
		{
			System.out.println(sr.getText());
		}
		String expres="laptop stand";
		for(WebElement sr1:searchres)
		{
			String actres=sr1.getText();
			if(actres.equals(expres))
			{
				sr1.click();
				break;
			}
		}
			
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
	}

}

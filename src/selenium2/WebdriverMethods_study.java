package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods_study {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		driver.close();
		//driver.quit();
		
		//driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);	

	}

}

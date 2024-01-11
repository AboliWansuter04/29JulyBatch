package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
        String title=driver.getTitle();
        
        System.out.println("Title is " +title);
	}

}

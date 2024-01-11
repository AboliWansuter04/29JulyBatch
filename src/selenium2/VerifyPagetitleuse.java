package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPagetitleuse {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		String expectedResult="facebook- is signin- sign out";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String actualsResult=driver.getTitle();
		
		if(expectedResult.equals(actualsResult))
		{
			System.out.println("title is matching and Tc is passed");
		}
		else
		{
			System.out.println("title is  not matching and Tc is failed");
		}
		
		
		
	}

}

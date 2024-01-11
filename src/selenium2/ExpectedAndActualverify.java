package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedAndActualverify {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		String url="https://meet.google.com/";
		driver.get("https://meet.google.com/");
        Thread.sleep(2000);
        
		String slt=driver.getCurrentUrl();
		System.out.println("Url is "+slt);
		
		if(url.equals(slt))
		{
			System.out.println("Expected and actual url is same");
			
		}
		else
		{
			System.out.println("Expected and actual url is not same");
		}
		
		//Thread.sleep(2000);
		//driver.close();
}

}

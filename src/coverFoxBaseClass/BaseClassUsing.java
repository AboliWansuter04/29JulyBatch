package coverFoxBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;

public class BaseClassUsing 
{
	static protected WebDriver driver;
	// Open browser
	
	public void launchCoverFox() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Launching browser", true);
		driver.get("https://www.coverfox.com");
		Thread.sleep(1000);
		
	}
	//close browser
	public void CoverFox() throws InterruptedException {
		Reporter.log("closing Browser", true);
		Thread.sleep(1000);
		driver.close();
	}
	
		
	}



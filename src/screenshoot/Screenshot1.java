package screenshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	private static final String TakesScreenshot = null;
	private static final String Object = null;

	public static void main(String[] args) throws InterruptedException, IOException 
	{  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        File dest=new File("C:\\Users\\sagar\\OneDrive\\Screenshot program\\myfscreenshot.png");
	    FileHandler.copy(source, dest);
        
	}
	
}

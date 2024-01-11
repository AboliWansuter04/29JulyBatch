package mise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethodUse 
{
     //reading data from excel
	 //taking screenshot
	//scrolling
	//waiting
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sagar\\OneDrive\\Pictures\\screenshot4-aboli\\image.png");
	    FileHandler.copy(src, dest);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}

	public static void implicitWait(WebDriver driver, int time) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		
	}

	public static String readDataFromPropertyFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	
	

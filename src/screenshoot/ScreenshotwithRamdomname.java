package screenshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotwithRamdomname {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
	File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		RandomString s=new RandomString();
		String rs=s.make(2);
		File dest=new File("C:\\Users\\sagar\\OneDrive\\Screenshot program\\myscreenshot2" +rs+".png");
		FileHandler.copy(source, dest);

	}

}

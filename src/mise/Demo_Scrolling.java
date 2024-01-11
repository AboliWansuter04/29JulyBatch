package mise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Scrolling {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CommonMethodUse.implicitWait(driver, 10);
		WebElement callCen = driver.findElement(By.xpath(""));
		CommonMethodUse.scrollIntoView(driver, callCen);
		CommonMethodUse.takeScreenshot(driver, "Trirupati");

	}

}

package mise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		CommonMethodUse.implicitWait(driver, 30);
		CommonMethodUse.takeScreenshot(driver, "MesshoDemo");
		CommonMethodUse.implicitWait(driver, 30);
        WebElement ca = driver.findElement(By.xpath("//h4[text()='Products For You']"));
        CommonMethodUse.scrollIntoView(driver, ca);
	}

}

package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropandDown {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
	//1 step	
	WebElement dropDownf = driver.findElement(By.id("dropdown-class-example"));
		
	//2
	Select s=new Select(dropDownf);
	
	
	//3
	s.selectByValue("option2");
	}

}

package dropdownstudyis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownstudy1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");  	 
		driver.manage().window().maximize();
		Thread.sleep(1000);
       WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("saab");
		Thread.sleep(1000);
		s.selectByIndex(2);
		s.selectByValue("Audi");
		Thread.sleep(1000);
		//s.deselectByIndex(1);
		s.deselectAll();
	}

}

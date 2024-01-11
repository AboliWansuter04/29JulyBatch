package dropdownstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateandYear {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
			Thread.sleep(1000);	
			
			//locator -- link text
			//driver.findElement(By.linkText("Create new account")).click();
			
			//locator -- partial link text
			driver.findElement(By.partialLinkText("new account")).click();
			Thread.sleep(1000);
			
			//selecting date
            WebElement date = driver.findElement(By.id("day"));			
			Select dDay=new Select(date);
			//dDay.selectByVisibleText("20");
			//dDay.selectByIndex(10);
			dDay.selectByValue("4");
			
           // selecting month
			WebElement month = driver.findElement(By.id("month"));
			Select months = new Select(month);
			months.selectByValue("10");
			
		//Selecting year
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select years = new Select(year);
			
			years.selectByValue("2020");
			boolean result = years.isMultiple();
			System.out.println("year multiple selectable is " +result);
	}

}

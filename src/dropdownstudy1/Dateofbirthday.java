package dropdownstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dateofbirthday {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
        
		//date
		WebElement date = driver.findElement(By.id("day"));		
		Select sDay=new Select(date);
		sDay.selectByValue("4");

		//month
		WebElement month = driver.findElement(By.id("month"));
		Select smonth = new Select(month);
		smonth.selectByValue("10");
		
		//year
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    Select syear = new Select(year);
		syear.selectByValue("1992");
		
		boolean result = syear.isMultiple();
		System.out.println("year multiple selectable is " +result);
		
	}

}

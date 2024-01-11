package webTable;

import java.time.Duration;
import java.util.List;

import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         WebElement bookTable = driver.findElement(By.name("BookTable"));
          
         List<WebElement> rows =

         driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
         int numberofRows=rows.size();
         System.out.println("number of rows in table "+numberofRows);
         
         List<WebElement> headers =
          driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
         
         int numberofColums=headers.size();
         System.out.println("number of columes in table "+numberofColums);
         
         
	}

}

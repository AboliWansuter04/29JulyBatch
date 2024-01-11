package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableUse {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		int numOrRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int numOrColums = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		
		for(int r=1;r<=numOrColums;r++)
		{
			String data = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr[1]/th["+r+"]")).getText();
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("=============================================");
	
		for(int i=1;i<=numOrRows;i++)
		{
			for(int j=1;j<=numOrColums;j++)
			{
				String data = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
				
			}
			System.out.println();
			System.out.println("========================================");
		}
	
	
	
	
	
	
	}
	
	
	
	
	
	

}

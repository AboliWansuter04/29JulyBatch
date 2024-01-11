package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(8000);
		
		//boolean res1=driver.findElement(By.xpath("//input[@value'2']")).isSelected();
		//driver.findElement(By.xpath("//input[@value='2']")).click();
	     //boolean res1=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
	   
		//code optimization
		WebElement maleGender=driver.findElement(By.xpath("//input[@value='2']"));
	
	    boolean res=maleGender.isSelected();
	    System.out.println("Gender selection status" +res);
	 
	   maleGender.click();
	   boolean res1=maleGender.isSelected();
	   System.out.println("Gender selection status" +res1);
	}

}

package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBAccountFormUsing_XML 
{
	@Parameters({"fname","lname", "Mno"})
  @Test
  public void fbTest(String Firstname,String Lastname,String Mobno) throws InterruptedException 
  {
		WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  Thread.sleep(1500);
  
  driver.findElement(By.linkText("Create new account")).click();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.findElement(By.name("firstname")).sendKeys(Firstname);
  driver.findElement(By.name("lastname")).sendKeys(Lastname);
  driver.findElement(By.name("reg_email__")).sendKeys(Mobno);
  Thread.sleep(4500);
  driver.close();
	  
	  
	  
  }
}

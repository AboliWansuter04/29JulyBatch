package NewJavaTestNg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGClass1 {
	 @Test 
	 public void mytest() throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		    Thread.sleep(1000);
	 }

}

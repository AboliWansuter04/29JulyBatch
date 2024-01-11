package serialandparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookUse {
  @Test
  public void Facebook() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
}

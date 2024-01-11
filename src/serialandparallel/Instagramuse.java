package serialandparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagramuse {
  @Test
  public void Instangram()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/accounts/login/");
  }
}

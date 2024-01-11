package testNGCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxBrowseUse {
  @Test
  public void CheckFireFoxBrowser() 
  {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");	
	  
}
}

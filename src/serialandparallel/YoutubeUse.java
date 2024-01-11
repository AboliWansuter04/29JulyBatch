package serialandparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubeUse {
  @Test
  public void youtube() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
  }
}

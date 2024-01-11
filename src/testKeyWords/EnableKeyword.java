package testKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableKeyword {
  @Test//(enabled = true)
  public void a() 
  {
	  Reporter.log("Testclass a is running", true);
  }
  @Test//(enabled = false)
  public void b() 
  {
	  Reporter.log("Testclass b is running", true);
  }
  @Test(enabled = false)
  public void c() 
  {
	  Reporter.log("Testclass c is running", true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("Testclass d is running", true);
  }
}

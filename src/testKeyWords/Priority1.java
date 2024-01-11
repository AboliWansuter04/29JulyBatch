package testKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
  @Test(priority = 0)
  public void x() 
  {
	  Reporter.log("Testclass x is running", true);
  }
  @Test(priority = 5)
  public void y() 
  {
	  Reporter.log("Testclass y is running", true);
  }
  @Test(priority = -2)
  public void z() 
  {
	  Reporter.log("Testclass z is running", true);
  }
  @Test(priority = 7)
  public void s() 
  {
	  Reporter.log("Testclass s is running", true);
  }
  
}

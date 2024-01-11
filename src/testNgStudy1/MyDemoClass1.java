package testNgStudy1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenersUse1.class)

public class MyDemoClass1 {
  @Test
  public void f4() 
  {
	  Reporter.log("TC f4 is running", true);
  }
  @Test
  public void f5() 
  {
	  Assert.fail();
	  Reporter.log("TC f5 is running", true);
  }
  @Test(dependsOnMethods = {"f5"})
  public void f6() 
  {
	  Reporter.log("TC f6 is running", true);
  }
  @Test
  public void f7() 
  {
	  Reporter.log("TC f7 is running", true);
  }
}

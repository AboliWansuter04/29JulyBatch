package testNgStudy1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listeners.ListenersUse1.class)

public class MyDemoClass
{
  @Test
  public void f() 
  {
	  Reporter.log("TC f is running", true);
  }
  @Test
  public void f1() 
  {
	  Assert.fail();
	  Reporter.log("TC f1 is running", true);
  }
  @Test//(dependsOnMethods = {"f1"})
  public void f2() 
  {
	  Reporter.log("TC f2 is running", true);
  }
  @Test(dependsOnMethods = {"f2"})
  public void f3() 
  {
	  Reporter.log("TC f3 is running", true);
  }
}

package sychronizationWaitUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodKeyword {
  @Test
  public void payment() 
  {
	  Reporter.log("Payment is done", true);
  }
  @Test(timeOut = 30)
  public void couponCode() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("60% discount ", true);
  }
  @Test(dependsOnMethods = {"couponCode"})
  public void discount() 
  {
	  Reporter.log("Discount", true);
  }
  
}

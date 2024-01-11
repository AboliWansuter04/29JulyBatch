package testxmlUsing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Xmlclass1 {
  @Test(groups = "Regression")
  public void Tc1() 
  {
	  Reporter.log("TEstclass1 is running", true);
  }
  @Test(groups = "Regression")
  public void Tc2()
  {
	  Reporter.log("TEstclass2 is running", true);
  }
  @Test(groups = "Regression")
  public void Tc3() 
  {
	  Reporter.log("TEstclass3 is running", true);
  }
  @Test(groups = "Sanity")
  public void Tc4() 
  {
	  Reporter.log("TEstclass4 is running", true);
  }
 
}

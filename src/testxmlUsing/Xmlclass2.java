package testxmlUsing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Xmlclass2 {
	 @Test(groups = "Sanity")
	  public void Tc5() 
	  {
		  Reporter.log("TEstclass5 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void Tc6()
	  {
		  Reporter.log("TEstclass6 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void Tc7() 
	  {
		  Reporter.log("TEstclass7 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void Tc8() 
	  {
		  Reporter.log("TEstclass8 is running", true);
	  }
}

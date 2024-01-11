package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import coverFoxBaseClass.BaseClassUsing;
import coverFoxUtilityClass.utiltityClass;

public class ListenersCoverFox extends BaseClassUsing implements ITestListener
{
	@Override 
 	public void onTestFailure(ITestResult result)  
 	{ 
 	 	 
 	 	try { 
 	 		utiltityClass.takeScreenShot(driver, result.getName()); 
 	 	} catch (IOException e)
 	 	{ 
 	 	 	// TODO Auto-generated catch block
 	 		e.printStackTrace(); 
 	 	} 
 	 	 
 	} 
 	 
 	@Override 
 	public void onTestSuccess(ITestResult result) { 
 	 	 
 	} 
 
 	@Override 
 	public void onTestSkipped(ITestResult result) { 
 	 	 
 	} 


}

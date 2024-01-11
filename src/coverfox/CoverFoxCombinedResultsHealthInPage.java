package coverfox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxCombinedResultsHealthInPage 
{
 @FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement resultInamtchinghealthpage;
 @FindBy(id = "plans-list")private List<WebElement> planlist;
 
 public CoverFoxCombinedResultsHealthInPage(WebDriver diver)
 {
	 PageFactory.initElements(diver,this);
	 
 }
 public void resltInString() 
 {
	 resultInamtchinghealthpage.click();
 }
 
 public void planlistdetails()
 {
	 String test1 = resultInamtchinghealthpage.getText();
	 String ar[]=test1.split(" ");
	 String numberOfResultsInString = ar[0];//49-->String
	//convert String to integer
	int numberOfResultsInInt = Integer.parseInt(numberOfResultsInString);
	

	int totalNumberOfPlans = planlist.size();
	if(totalNumberOfPlans==numberOfResultsInInt)
	{
	System.out.println("Plans no matching with plans List,TC is passed");
	}
	else {
	System.out.println("Plans number is not matching with plans List, TC is failed");
	}
			
 }
 
}

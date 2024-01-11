package coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CF_TC5ValidateSearchResultsForHealthcarePolicies {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
		 Thread.sleep(1000);
		 homePage.clickOnFemaleButton();
		 
		 CoverFoxHealthPlan healthplan=new CoverFoxHealthPlan(driver);
		 Thread.sleep(1000);
		 healthplan.clickOnNextButton();
		 
		 CoverFoxMemberDetails memDetails=new CoverFoxMemberDetails(driver);
		 Thread.sleep(1000);
		 memDetails.age();
		 memDetails.clickOnNextBut2();
		 
		 CoverFoxAddressDetials addDetails=new CoverFoxAddressDetials(driver);
		 Thread.sleep(1000);
		 addDetails.pincodeno1();
		 addDetails.mobno();
		 addDetails.clickonContButton();
		 
		 CoverFoxCombinedResultsHealthInPage resultInPlanList=new CoverFoxCombinedResultsHealthInPage(driver);
		 //Thread.sleep(1000);
		 resultInPlanList.resltInString();
		 Thread.sleep(7000);
		 resultInPlanList.planlistdetails();
		 Thread.sleep(1000);
		 driver.close();
}

}

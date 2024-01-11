package popupstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpopUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(100);
        
        //getting text on main page
        WebElement mainPageElement = driver.findElement(By.xpath("//b[text()=\"[Dummy Controls]\"]"));
        System.out.println("Main page text is "+mainPageElement.getText());
        
        //clicking on newwindowButton
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(1000);
       // driver.close();
        //driver.quit();
        
        //To switch to child window we should know id of child window
        String mainPageID=driver.getWindowHandle();
        System.out.println("Id of main page "+mainPageID);
        
        //use getWindowHandles method to get all pages id
       Set<String> allWindowId = driver.getWindowHandles();
       Iterator<String> it=allWindowId.iterator();
       
      String mainPageID1=it.next();
      String childID1=it.next();
      
      System.out.println("Main page id is "+mainPageID1);
      System.out.println("Child page id is "+childID1);
      
      //switching focus from main page to child window
      driver.switchTo().window(childID1);
      Thread.sleep(1000);
      driver.manage().window().maximize();
      
      driver.findElement(By.id("the7-search")).sendKeys("Good Morning");
      Thread.sleep(2000);
      //driver.close();
       System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
        
       driver.switchTo().window(mainPageID1);
       Thread.sleep(1000);
       String mainPageText2=driver.findElement(By.xpath("//p[contains(text(),' browser window')]")).getText();
        System.out.println("Main page text is "+mainPageText2);
        
        
        
	}

}

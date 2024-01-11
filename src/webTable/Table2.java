package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) 
	{
		//Identify webtable
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		//only one header reading
		String Text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]")).getText();
        System.out.println(Text1);
        System.out.println("===================================");
        
        //whole rows of header
        
        List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        
        for(WebElement th:tableHeader )
        {
        	System.out.print(th.getText()+" ");
        	
        } 
        System.out.println();
        System.out.println("===================================");
	
        // print only one data from table
        WebElement singleData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]"));
	    System.out.println(singleData.getText());
	
	    System.out.println("===================================");
	    
	    //how to read complete row from table
	    List<WebElement> cmRow5 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td"));
	    for(WebElement cr:cmRow5)
	    {
	    	System.out.print(cr.getText()+" ");
	    }
	    System.out.println();
	    System.out.println("===================================");
	
	    //read complete single column
	    //WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr/td[4]"));
	    for(int i=2;i<=6;i++)
	    {
	    WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
	    System.out.println(data.getText());
	    }
	    
	    
	    
	    
	    
	}

}

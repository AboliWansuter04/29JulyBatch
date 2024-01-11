package assinment;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomlistUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(1000);
        List<WebElement> searchres=driver.findElements(By.xpath("//div[@class='erkvQe']"));
        
        
        for(int i=0;i<=searchres.size()-1;i++)
        {
        	System.out.println(searchres.get(i).getText());
        }
        Thread.sleep(1000);System.out.println("Using for loop....");
        System.out.println("===============================");
        
        System.out.println("Using for each loop....");
        for( WebElement s:searchres)
        {
        	System.out.println(s.getText());
        }
        Thread.sleep(1000);
        System.out.println("==================================");
        
        System.out.println("Using iterator............");
        Iterator<WebElement> it = searchres.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next().getText());
        }
        Thread.sleep(1000);
        System.out.println("==================================");
        
        System.out.println("Using Listiterator............");
        ListIterator<WebElement> lit = searchres.listIterator();
        while(lit.hasNext())
        {
        	System.out.println(lit.next().getText());
        	
        }
        Thread.sleep(1000);
        while(lit.hasPrevious())
        {
        	System.out.println(lit.previous().getText());
        	
        }
	}

}

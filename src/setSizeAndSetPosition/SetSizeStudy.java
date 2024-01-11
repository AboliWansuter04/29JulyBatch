package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		Dimension defualtSize = driver.manage().window().getSize();
        
		System.out.println(defualtSize);
        
		Dimension d=new Dimension(80, 1000);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
        
        
        
        
        
	}

}

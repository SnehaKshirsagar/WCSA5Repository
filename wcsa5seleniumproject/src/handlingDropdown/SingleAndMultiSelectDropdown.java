package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleAndMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/SingleSelectDrodown.html");
	   
        WebElement multiSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(multiSelectDD);
        
        //To select using index
        sel.selectByIndex(1);
        Thread.sleep(1000);
        
        //To select using Visible Text
        sel.selectByVisibleText("PaniPuri");
        Thread.sleep(1000);
       
        //To select using value
        sel.selectByValue("v5");
        Thread.sleep(1000);
        
        //To deselect using index
        sel.deselectByIndex(3);
        Thread.sleep(1000);
       
        //To deselect using Visible Text
        sel.deselectByVisibleText("MisalPav");
        
        //To deselect using value
        sel.deselectByValue("v5");
     // To deselect Multiple options using for loop
//          for(int i=0;i<5;i++)
//          {
//        	  sel.selectByIndex(i);
//        	  Thread.sleep(1000);
//          }
//          
//           for(int i=0;i<5;i++)
//           {
//        	   sel.deselectByIndex(i);
//        	   Thread.sleep(1000);
//           }
          // To deselect all options using deselectAll()
     	  sel.deselectAll();
}
}	
	

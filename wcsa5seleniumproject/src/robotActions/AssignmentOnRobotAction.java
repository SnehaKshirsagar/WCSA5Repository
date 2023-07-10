package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAction {
     public static void main(String[] args) throws InterruptedException, AWTException {
    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 
    	 // Lunch Blue Stone
    	 driver.get("https://www.bluestone.com/");
    	 
    	 // Handle Hidden division pop up
    	 driver.findElement(By.id("denyBtn")).click();
	     
    	 //Move to watch jewellery
    	 Actions act = new Actions(driver);
    	 WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
    	 act.moveToElement(target).perform();
    	 
    	 driver.findElement(By.xpath("//a[text()='Band']")).click();
         Thread.sleep(4000);
         
         //Click and hold Filter by Test
         WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
         
         for(int i=1;i<=2;i++)
         {
        	 act.doubleClick(target2).perform();
        	 
        	 act.clickAndHold(target2).perform(); 
         }
         Thread.sleep(2000);
         
         //Copy the Filter by text
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_P);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_P);
		 //Identify the search box
		 driver.findElement(By.id("search_query_top_elastic_search")).click();
         
		 //Past the filter by test
		 robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_P);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_P);
		 
		 //Hit Enter Button
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 //Verify 1 design Displayed or not
		 if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
		 {
		 
		     Thread.sleep(2000);
		     driver.quit();
         }
		 else 
		 {
			System.out.println("Exception!!");
		}
}
}

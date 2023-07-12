package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnMoveToElement {

	public static void main(String[] args) throws InterruptedException {

	  //Open the browser, Enter Url https://www.blustone.com & move to goldpoints 
	  //select one gram to verify one gram point is display or not & close the browser

	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.bluestone.com/");//Lunch the bluestone webpage
	  
	  driver.findElement(By.id("denyBtn")).click();//Handle the popup
      
	 WebElement targetCoins = driver.findElement(By.xpath("//a[text()='Coins ']"));
	 
	 Actions act = new Actions(driver);
	 act.moveToElement(targetCoins).perform(); // Move to coins
	 
	 driver.findElement(By.xpath("//span[text()='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).click();
	 Object coin = driver.findElement(By.id("5920"));
	 if(((WebElement) coin).isDisplayed())
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




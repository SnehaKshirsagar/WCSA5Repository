package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		//Use to perform mouseHour action
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");//lunch the Bluestore browser
        
		driver.findElement(By.id("denyBtn")).click();//Handle the popup
        
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		
		//To perform mouse actions on webelement
		Actions act = new Actions(driver);
		
		//to perform mouseHour method
	   
		//act.moveToElement(target);
		//OR by using build
		act.moveToElement(target).build().perform();
		
	    driver.findElement(By.xpath("//a[.='Band']")).click();
	}

}

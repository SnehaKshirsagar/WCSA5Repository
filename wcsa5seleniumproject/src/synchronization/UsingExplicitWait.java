package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Implicit wait
        WebDriverWait explicitwait = new WebDriverWait(driver,Duration.ofSeconds(15));//Explicit Wait
        driver.get("https://www.shoppersstack.com/electronics");
        
        driver.findElement(By.xpath("//img[@alt='men']")).click();
       
        explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='HOODIES']"))).click();
        //driver.findElement(By.xpath("//img[@alt='HOODIES']")).click();
       
        driver.findElement(By.xpath("//input[@id='Check Delivery']"));
        
       

	}

}

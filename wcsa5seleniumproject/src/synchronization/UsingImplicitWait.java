package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        //Without Thread.sleep() program will be executed with the help of implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Implicit wait
        
        driver.get("https://instagram.com/");
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sneha1234");
        
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdefghijk");
        
        driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}

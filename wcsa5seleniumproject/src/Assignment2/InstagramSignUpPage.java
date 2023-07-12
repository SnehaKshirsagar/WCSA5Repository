package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignUpPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://z-p4.www.instagram.com/accounts/emailsignup/?hl=en-gb");
        
        driver.findElement(By.cssSelector("input[name$='Phone']")).sendKeys("1234567890");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[autocapitalize^='senten']")).sendKeys("Sneha Ramesh Kshirsagar");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("sneha");
        Thread.sleep(2000);
        driver.findElement(By.className("input[name='password']")).sendKeys("12345");
        

	}

}

package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/in/Login");
        
        driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("sneha");
        driver.findElement(By.cssSelector("input[id='id_password']")).sendKeys("janhavi123");
        driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
        Thread.sleep(4000);
        
		

	}

}

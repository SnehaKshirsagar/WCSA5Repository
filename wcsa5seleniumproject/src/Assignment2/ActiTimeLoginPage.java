package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://desktop-h45hfi9/login.do");
        
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[id='loginButton']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        
	   }

}


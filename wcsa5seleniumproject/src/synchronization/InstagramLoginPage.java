package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://instagram.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sneha1234");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdefghijk");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}

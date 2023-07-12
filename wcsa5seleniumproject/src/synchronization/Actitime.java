package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.xpath("//input[@id = 'id_userLoginId']")).sendKeys("sushmita");
		driver.findElement(By.xpath("//input[@id ='id_password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class ='btn login-button btn-submit btn-small']")).click();
	}

}

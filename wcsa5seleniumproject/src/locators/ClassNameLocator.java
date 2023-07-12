package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://google.com/");
	driver.switchTo().activeElement().sendKeys("monica geller",Keys.ENTER);
	driver.findElement(By.className("lNPNe")).click();// ctrl + f : use to check the className is unique or not
	         // If the className is unique then use this
	
	
	}


}
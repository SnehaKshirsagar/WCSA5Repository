package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.diver", "./drivers/chromedriver.exe");
	
	//Lunch the browser
	WebDriver driver = new ChromeDriver();
	//Maximize the browser
	driver.manage().window().maximize();
	//Apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Lunch the webapplication
	driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/disabled.html");
	
	//Identify WebElement
	driver.findElement(By.id("i1")).sendKeys("admin");
	driver.findElement(By.id("i2")).sendKeys("manager");
	//To handle Disabled WebElement
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementByID('i1').Value='manager");
	
	//Generate alert popup
	jse.executeScript("alert('Hello There!!')");
	
	//To handle Disable
	
}
}

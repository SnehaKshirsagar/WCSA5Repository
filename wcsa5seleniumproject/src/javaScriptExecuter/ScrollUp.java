package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//Lunch the browser
	WebDriver driver = new ChromeDriver();
	//Maximize the browser
	driver.manage().window().maximize();
	//Apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Lunch the webapplication
	driver.get("https://www.selenium.dev/");
	//To perform scrolling operations
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//Scroll Up
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-500)");
	
}	

}


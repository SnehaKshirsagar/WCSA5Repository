package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.diver", "./drivers/chromedriver.exe");
	
	//Lunch the browser
	WebDriver driver = new ChromeDriver();
	//Maximize the browser
	driver.manage().window().maximize();
	//Apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Lunch the webapplication
	driver.get("http://dashboards.handmadeinteractive.com/jasonlove/");
	//To perform scrolling operations
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//Scroll Left
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(-500,0)");
	
}
}

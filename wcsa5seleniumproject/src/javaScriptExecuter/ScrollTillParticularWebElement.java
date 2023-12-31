package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {

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
		
		//Identify the webelement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		
		//To perform scrolling operations for a newsElement
		//Location of newsElement
//		Point loc = newsElement.getLocation();
//		int xaxis = loc.getX();
//		int yaxis = loc.getY();
//		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
//		
        jse.executeScript("arguments[0].scrollIntoView(true)",newsElement);

	}

}

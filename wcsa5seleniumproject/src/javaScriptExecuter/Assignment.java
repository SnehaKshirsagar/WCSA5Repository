package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.diver", "./drivers/chromedriver.exe");
		
		//Lunch the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Lunch the webapplication
		driver.get("https://in.puma.com/in/en/mens/mens-shoes");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Scroll Down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,700)");
		
		//xpath=(h3[contains(@class='w-')]/descendant::span[text()='Puma Black-Puma Silver'])[2]
		


	}

}

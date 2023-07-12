package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver","./drivers/gecko.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000); 


	}

}

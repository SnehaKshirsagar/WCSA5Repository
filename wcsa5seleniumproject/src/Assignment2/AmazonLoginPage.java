package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginPage  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Famazon.in%2Fgp%2Fprime");
		
		
        driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("kshirsagarsneha04@gmail.com");
	    driver.findElement(By.cssSelector("input[id='continue']")).click();
	    Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("Sneha123");
	    driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
	    Thread.sleep(4000);


		}

}


package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2F");
	        driver.findElement(By.linkText("Login")).click();
	        driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("kshirsagarsneha04@gmail.com");
	        driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
	        Thread.sleep(4000);

		}

}


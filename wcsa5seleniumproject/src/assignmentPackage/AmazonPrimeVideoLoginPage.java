package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeVideoLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin/258-4231443-4018440");
		
		driver.findElement(By.id("ap_email")).sendKeys("kshirsagarsneha04@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Sneha12");
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		

	}

}

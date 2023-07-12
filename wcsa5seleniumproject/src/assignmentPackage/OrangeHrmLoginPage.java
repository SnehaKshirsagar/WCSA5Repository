package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("Admin");
		WebElement usn1 = driver.findElement(By.name("password"));
		usn1.sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.className("driver.findElement(By.className(\"_2KpZ6l _2HKlqd _3AWRsL\")).click();")).click();
		
		}

}

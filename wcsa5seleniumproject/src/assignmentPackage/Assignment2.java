package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/SimpleLoginPage.html");
		Thread.sleep(2000);
		//id
		//driver.findElement(By.id("id1")).sendKeys("admin");
		//Thread.sleep(2000);
		//driver.findElement(By.id("id2")).sendKeys("manager");
		
		
		//ClassName
		driver.findElement(By.className("cls1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("id2")).sendKeys("manager");
		
		//driver.findElement(By.className("cls1")).sendKeys("manager");
		
		//name
		//driver.findElement(By.name("n1")).sendKeys("admin");
		//Thread.sleep(2000);
		//driver.findElement(By.name("n2")).sendKeys("manager");
		

		}

}

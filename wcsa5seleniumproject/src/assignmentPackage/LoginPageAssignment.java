package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		//To identify webelement we use locators
		driver.findElement(By.id("id_userLoginId")).sendKeys("kshirsagarsneha04@gmail.com");//Username Textbox
		//Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("asdfghjkl");
		Thread.sleep(4000);
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
		
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small'")).click();
		

	}

}

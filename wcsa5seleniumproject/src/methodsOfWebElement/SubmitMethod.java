package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("afhgjhjdk");
		driver.findElement(By.name("password")).sendKeys("qgh");
	    WebElement LoginButton = driver.findElement(By.xpath("//button[contains(@class,'_acap')]"));
	    LoginButton.submit();
	    
	    driver.navigate().to("http://desktop-h45hfi9/login.do");
	    driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement LoginButton2 = driver.findElement(By.id("loginButton"));
		
		LoginButton2.click();

	}

}

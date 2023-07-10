package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getAttribute("id");
	
	//  System.out.println(driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getAttribute("class"));
	
	    WebElement AttrivabuteValue = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
	    String classvalue = AttrivabuteValue.getAttribute("class");
	    System.out.println(classvalue);
	}

}

package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo {
 public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-h45hfi9/login.do");
		WebElement usn = driver.findElement(By.name("username"));
		File src = usn.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/usnelement.png");
		Files.copy(src, dest);
}
}

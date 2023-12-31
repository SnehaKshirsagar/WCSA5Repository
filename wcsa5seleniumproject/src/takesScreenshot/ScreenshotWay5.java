package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay5 {
    
	// By using EventFiringWebDriver
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://github.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		
		File src = efwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/github.jpg");
		
		Files.copy(src, dest);

	}

}

package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/SingleSelectDrodown.html");

		//Identify dropDown on webpage
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		//Handle the dropDown by creating obj of select class
		Select sel = new Select(dropdownElement);
		
		//Select the option from dropDown..
		  // use selection methods
		Thread.sleep(2000); // check exception
		sel.selectByIndex(2); //from single select dropdown
		
		Thread.sleep(2000);
		//try to deselect given option from dropdown
		//If we try single select dropdown then we will get UnsupportedOperationalException
		sel.deselectByIndex(2);
		
	}

}

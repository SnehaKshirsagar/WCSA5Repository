package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/MultipleSelectDropdown.html");
        
        WebElement target = driver.findElement(By.id("menu"));
        
        //To perform right click
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.contextClick(target).perform();
	}

}

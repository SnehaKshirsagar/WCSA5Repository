package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/MultipleSelectDropdown.html");
		
		//Identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("i1"));

        //Handle the dropdown
		Select sel = new Select(dropDownElement);
		
		//To read options from dropdown
		WebElement allOpts = sel.getWrappedElement();
		
		System.out.println(allOpts.getText());
	}

}

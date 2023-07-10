package handlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		
		//Single  Select Dropdown
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/SingleSelectDrodown.html");

		//Identify dropDown on webpage
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		//Handle the dropDown by creating obj of select class
		Select sel = new Select(dropdownElement);
		
		//read all the options on dropdown 
		List<WebElement> allOption = sel.getOptions();
		//To read List use looping statements
		for(WebElement op:allOption)
		{
		    if(op.getText().equals("PaniPuri"))
		    {
		    	Thread.sleep(2000);
		    	op.click();
		    }
	
		}
		

	}

}

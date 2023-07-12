package handlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Sneha/OneDrive/Desktop/WCSA5/WebElement/dropdown.html");
	   
        WebElement multiSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(multiSelectDD);
       
        //using isMultiple Method
        boolean result = sel.isMultiple();
        System.out.println(result);

        //getOption method using for loop
        List<WebElement> dropdownoptions = sel.getOptions();
        for(int i=0;i<dropdownoptions.size();i++)
        {
        	String options = dropdownoptions.get(i).getText();
        	System.out.println(options);
        	Thread.sleep(1000);
        }
        System.out.println();
        //getOption method using for each loop
        List<WebElement> ops = sel.getOptions();
        for(WebElement we : ops)
        {
        	String textOfOps = we.getText();
        	System.out.println(textOfOps);
        }
        
        for(int i=2;i<=4;i++)
        {
        	sel.selectByIndex(i);
        }
        WebElement firstOption = sel.getFirstSelectedOption();
        System.out.println("First Selected Option Is:"+firstOption.getText());
	}

}

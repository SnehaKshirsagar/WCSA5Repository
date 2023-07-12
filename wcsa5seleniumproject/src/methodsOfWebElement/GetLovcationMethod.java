package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLovcationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		org.openqa.selenium.Point newsElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation(); 
		 
		 int xaxis = (int) newsElement.getX();
		 int yaxis = (int) newsElement.getY();
		 
		 
		 System.out.println("x axis of news webelement :"+ xaxis + " y axis of news webelement :"+yaxis);

        
	}

}

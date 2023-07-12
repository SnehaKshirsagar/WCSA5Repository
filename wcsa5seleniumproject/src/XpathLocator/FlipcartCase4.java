package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartCase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        //xpath by using text()
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(2000);
        
        //xpath by using multiple attribute
        driver.findElement(By.xpath("//input[@autocomplete='off' and @class='_2IX_2- VJZDxU']")).sendKeys("1234567890");
        Thread.sleep(2000);
        
        //xpath by using text()
        driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        

	}

}

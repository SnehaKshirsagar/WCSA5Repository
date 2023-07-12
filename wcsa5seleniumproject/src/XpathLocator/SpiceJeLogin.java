package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJeLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        
        driver.findElement(By.xpath("//div[text()='login']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sneha@123");
        driver.findElement(By.xpath("//div[text()='LOGIN' and @class='css-76zvg2 r-jwli3a r-18tvxmy r-1b43r93 r-majxgm r-q4m81j']")).click();

	}

}

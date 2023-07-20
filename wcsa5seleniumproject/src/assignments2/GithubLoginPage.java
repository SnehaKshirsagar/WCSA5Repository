package assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        driver.findElement(By.cssSelector("input[id='login_field']")).sendKeys("kshirsagarsneha04@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[class$='sign-in-button']")).click();
	}
	

}

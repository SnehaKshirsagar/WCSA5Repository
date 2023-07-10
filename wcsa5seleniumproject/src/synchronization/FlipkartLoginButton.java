package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/"); // flipkart application
       
        driver.findElement(By.xpath("//button[text()='✕']")).click();// handle login pop up
        driver.findElement(By.xpath("//span[text()='Cart']")).click();// click on Cart
        Thread.sleep(2000);//By stop the execution of script we synchronize the speed of automation script
        driver.findElement(By.xpath("//span[text()='Login']")).click();
       
}
}

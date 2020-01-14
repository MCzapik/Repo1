package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.pl/");
		driver.findElement(By.name("q")).sendKeys("Hello webdriver");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}

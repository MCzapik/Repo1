package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailWaitImp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("DoesNotExistLULW@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		String AlertText = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(AlertText);
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}

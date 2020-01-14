package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://wikipedia.pl/");
		driver.findElement(By.name("search")).sendKeys("Google");
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.className("mw-wiki-logo")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[3]/div[3]/form[1]/div[1]/input[1]")).sendKeys("Firefox");
		driver.findElement(By.cssSelector("#searchButton")).click();
		driver.findElement(By.linkText("Strona g³ówna")).click();
		driver.findElement(By.partialLinkText("Losuj")).click();
		driver.findElement(By.tagName("input")).sendKeys("TagName");
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}

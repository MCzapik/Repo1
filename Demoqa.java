package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/aside[2]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.id("userName")).sendKeys("Maciej");
		driver.findElement(By.id("currentAddress")).sendKeys("Politechnika");
		driver.findElement(By.id("permanentAddress")).sendKeys("Koszalin");
		driver.findElement(By.id("submit")).click();
		
		String AlertText = driver.switchTo().alert().getText();	
		System.out.println(AlertText);
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}

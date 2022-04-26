package org.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YaarIvan {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ajay\\eclipse-workspace\\AJ\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement sec = driver.findElement(By.xpath("//input[@id='search']"));
		sec.sendKeys("Yaar Ivan Irumbuthirai");
		WebElement btn = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		btn.click();
		Thread.sleep(3000);
		WebElement fst = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(fst).perform();
		a.click().perform();
		
		
	}

}

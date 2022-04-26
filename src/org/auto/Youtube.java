package org.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ajay\\eclipse-workspace\\AJ\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.youtube.com/");
		dr.manage().window().maximize();
	WebElement se = dr.findElement(By.xpath("//input[@id='search']"));
		se.sendKeys("sirivalli song tamil");
		WebElement see = dr.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
		see.click();
		Thread.sleep(3000);
		WebElement vi = dr.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		vi.click();
		
		
		
	}

}

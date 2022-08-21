package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
     public static void main(String[] args) {
    	WebDriver d; // defining web_driver object 
 		String url = "https://google.com";
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver96\\chromedriver.exe");
 	
 		d = new ChromeDriver();
 		
 		//implicit wait, default setting 0 sec, polling frequency is 500ms
 		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
 		d.get(url);
 		d.findElement(By.name("q")).sendKeys("automation step by step"+Keys.ENTER);
 		
 		//explicit wait, polling frequency is 500ms
 		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
 		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning ...")));
 		myLink.click();
 		
 		
 		//fluent wait , we cant set polling frequency 
 		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(d)
 				.withTimeout(Duration.ofSeconds(10))
 				.pollingEvery(Duration.ofSeconds(1))
 				.ignoring(org.openqa.selenium.NoSuchElementException.class);
 		fluentWait.until(ExpectedConditions.elementToBeSelected(By.xpath(null)));
 		
 		d.close();
 		d.quit();
	}
}

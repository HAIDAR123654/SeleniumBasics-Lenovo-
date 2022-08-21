package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basics_selenium {
	public static void main(String[] args) {
		WebDriver d; // defining web_driver object 
		String url = "https://google.com";
		String url1 = "https://automationstepbystep.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver(); //initialization of web_driver object d
		d.get(url);
		d.navigate().to(url1);
		d.close();
		
		// different types of waits
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

}

package Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d; // defining web_driver object 
		String url = "https://google.com";
		String url1 = "https://automationstepbystep.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver(); //initialization of web_driver object d
		d.get(url);
		
		// SWITHCHING WINDOWS
		String originalWindow = d.getWindowHandle();
		
		// OPEN A NEW PAGE
		//d.navigate().to(url1);
		
		 /* // GET CURRENT URL
		System.out.println(d.getCurrentUrl());
		
		// GET TITLE
		System.out.println(d.getTitle());
		
		// FORWORD, BACK, REFRESH
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		*/
		
		
		//Thread.sleep(2000);
		
		// OPEN NEW WINDOW AND SWICH TO THAT WONDOW....
		d.switchTo().newWindow(WindowType.WINDOW);
		
		// OPEN NEW WINDOW AND OPEN THE NEW TAB IN MAIN WINDOW
		d.switchTo().newWindow(WindowType.TAB);
		
		d.switchTo().window(originalWindow);
		Thread.sleep(3000);
		
		
		//d.close();
		d.quit();
		
		
     
	}

}

package Selenium_basics;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	

	public static void main(String[] args)throws InterruptedException,IOException {
	
		WebDriver d; // defining web_driver object 
		String url = "https://google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver96\\chromedriver.exe");
	
		d = new ChromeDriver();
		d.get(url);
		// Taking screenshot
		
		File srcFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image1.png"));
	
	    WebElement element = d.findElement(By.cssSelector(".lnXdpd"));
	    File srcFile1 = element.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile1, new File("./image2.png"));
	}

}

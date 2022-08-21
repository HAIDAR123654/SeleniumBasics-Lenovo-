package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fremes_dealing {

	public static void main(String[] args) {
		WebDriver d;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver_version_95\\chromedriver.exe");
		d  = new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/frames-and-windows");
		d.findElement(By.xpath("//*[@id=\"iFrame\"]")).click();
		
		// Switching to the frame by frame name or id
		d.switchTo().frame("globalSqa");
		
		//USING index
		//d.switchTo().frame(1);
		
		// Locate and switch
		//WebElement iframe = d.findElement(By.cssSelector(".rightContainer>iframe"));
		//.rightContainer is a css class
		//d.switchTo().frame(iframe);
		
		
		String text = d.findElement(By.xpath("//*[@class='header_phone']")).getText();
		System.out.println(text);
		
		// by switching to any frame other than default frame , always switch to the default frame after doing event.
		// d.switchTo.defaultContent();
		
		

	}

}

package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_javascript {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d; // defining web_driver object 
		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver96\\chromedriver.exe");
	
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(url);
		
		//java script alert
		d.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1 = d.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(2000);
		alert1.accept();//clicked on ok button in alert page
		
		if(d.getPageSource().contains("You successfully clicked an alert"))
		{
			System.out.println("You successfully clicked an alert");
			System.out.println("============================");
		}
		
		//javascript confermation
		d.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = d.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert2.dismiss();//clicked on cancel button in confermation page
		
		if(d.getPageSource().contains("You clicked: Cancel"))
		{
			System.out.println("You clicked: Cancel");
			System.out.println("============================");
		}
		
		
		// js prompt
		d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = d.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("haidar ali");
		Thread.sleep(2000);
		alert3.accept();
		if(d.getPageSource().contains("You entered: haidar ali"))
		{
			System.out.println("You entered: haidar ali");
			System.out.println("============================");
		}
		
		
		
		d.close();
		d.quit();
		
		}

}

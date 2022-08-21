package Selenium_basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Login_and_assert {
	WebDriver d;
	
	String url = "https://opensource-demo.orangehrmlive.com";
			
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
    }
	
	@After
	public void tearDown() throws Exception {
		d.close();
    }
	
	@Test
	public void test() throws InterruptedException {
         d.findElement(By.id("txtUsername")).sendKeys("Admin");
         d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
         d.findElement(By.id("btnLogin")).click();
         
        Thread.sleep(3000);
        String message = d.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
        System.out.println(message);
        assertEquals("Dashboard",message);
        d.findElement(By.xpath("//*[@id=\"Subscriber_link\"]")).click();
        System.out.println("correct");
        
        	
         

    }
	
	
	
	
	

}



package Selenium_basics;

//import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Read_data_excel {
	WebDriver d;
	
	//String url = "https://opensource-demo.orangehrmlive.com";
	String url = "http://testautomationpractice.blogspot.com";
			
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ha890\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		d = new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
    }
	
	@After
	public void tearDown() throws Exception {
		//d.close();
    }
	
	@Test
	public void test() throws InterruptedException {

		 
         
        	
         

    }
	
	
	
	
	

}



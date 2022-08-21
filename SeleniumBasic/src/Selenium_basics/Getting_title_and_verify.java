package Selenium_basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Getting_title_and_verify {
	WebDriver d;
	//String url = "http://10.82.180.36/Common/Login.aspx";
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
		//d.close();
    }
	
	@Test
	public void test() {
		String title = d.getTitle();
		System.out.println("The title of the page is "+title);
		assertEquals("OrangeHRM",title);
		System.out.println("Script completed");
    }
	
	
	
	
	

}


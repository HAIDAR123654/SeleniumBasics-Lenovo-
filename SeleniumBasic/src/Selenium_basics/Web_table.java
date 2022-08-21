package Selenium_basics;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Web_table {
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

		 List<WebElement> totalrows = d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
         System.out.println(totalrows.size());
         int rowsize = totalrows.size();
         
         List<WebElement> totalcols = d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[2]/td"));
         System.out.println(totalcols.size());
         int colsize = totalcols.size();
         
         for(int i=2; i<=rowsize; i++) {
        	 for(int j=1; j<=colsize; j++) {
        		 System.out.print(d.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText() + "  ");
        	 }
        	 System.out.println();
         }
         
        	
         

    }
	
	
	
	
	

}



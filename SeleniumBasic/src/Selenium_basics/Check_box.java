package Selenium_basics;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Check_box {
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
		//d.close();
    }
	
	@Test
	public void test() throws InterruptedException {
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
        d.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        d.findElement(By.id("btnLogin")).click();
        
       Thread.sleep(3000);
       d.findElement(By.xpath("//a[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")).click();

		 /* //*[@id="resultTable"]/tbody/tr[1]/td[2]
		  //*[@id="resultTable"]/tbody/tr[2]/td[2]
		 .
		 .
		 .
		 //*[@id="resultTable"]/tbody/tr[21]/td[2]
		 
		 */
		
		String before_xpath = "//*[@id='resultTable']/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		//METHOD N0.1
		
//		for(int i=1; i<=10; i++)
//		{
//			String name = d.findElement( By.xpath(before_xpath+i+after_xpath)).getText();
//			System.out.println(name);
//			if(name.contains("Sales Representative"))
//					{
//				       d.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+i+"]/td[1]/input")).click();
//					}
//		}
		
		
		//Second method....using dynamic x_path
		d.findElement(By.xpath("//a[contains(text(),'Matilda  Fleenor')]//parent::td//preceding-sibling::td//input[@id=\"ohrmList_chkSelectRecord_21_5\"]")).click();
		d.findElement(By.xpath("//a[contains(text(),'Phil Hughes')]//parent::td//preceding-sibling::td//input[@id=\"ohrmList_chkSelectRecord_21_5\"]")).click();
		
        	
         

    
	}

}

package Selenium_basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class All_annotations {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" I am from before class");
    }
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" I am from After class");
    }
	
	@Before
	public void setUp() throws Exception {
		System.out.println(" I am from before");
    }
	
	@After
	public void tearDown() throws Exception {
		System.out.println(" I am from After");
    }
	
	@Ignore
	public static void test1() {
		System.out.println(" I am from Test1");
    }
	
	@Test
	public void test2() {
		System.out.println(" I am from Test2");
	}
	
	
	
	
	
	

}

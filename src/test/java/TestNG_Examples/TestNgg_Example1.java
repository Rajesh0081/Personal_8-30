package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgg_Example1 {
	
	
	@Test
	public void m1() {
		System.out.println("This is a test metod");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is before suite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is a before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is a after class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a before test");
	}
	
	@AfterClass
	public void aftertest() {
		System.out.println("This is a after test");
	}
	
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("this is a after suite");
	}

}

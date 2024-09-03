package TestNG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Ex2 {
	
	@BeforeClass
	
	public void m1() {
		System.out.println("this is a method1");
	}
	
	@Test(priority=50)
	public void m2() {
		System.out.println("this is a method2");
	}
	
	
	
	@Test(priority=1)
	public void m3() {
		System.out.println("this is a method3");
	}
	
	
	@AfterClass
	
	public void m4() {
		System.out.println("this is a method4");
	}
	

}

package TestNG_Examples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Functionality {
	
	public WebDriver driver;
	
	@BeforeClass
	public void lauch() {
		 driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
	}
	
	@Test
	public void login() throws Exception {
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize(); // To maximize the Browser Window
		
		Thread.sleep(4000);  // It is a Wait method
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(2000);  // 2000/1000 =2 sec
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
	}
	
	@Test
	public void url() {
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	}
	
	@Test
	public void title() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@AfterClass
	public void logout() {
		
		driver.close();
		
	}
	
	

}

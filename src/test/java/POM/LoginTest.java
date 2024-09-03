package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception {
		
		LoginClass obj=new LoginClass(driver);
		Thread.sleep(3000);
		obj.setusername("rajeshv@sutisoft.in");
		obj.setpassword("test@1234");
		obj.clickSubmit();
		
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}

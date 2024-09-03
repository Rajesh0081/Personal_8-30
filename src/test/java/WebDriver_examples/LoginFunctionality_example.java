package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginFunctionality_example{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver(); // It is used to open a New instance Browser
		
		driver.get("https://apps17.sutisoft.com/");  // To Open Specific URL
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize(); // To maximize the Browser Window
		
		Thread.sleep(4000);  // It is a Wait method
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(2000);  // 2000/1000 =2 sec
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		//driver.close();  // To close the Browser window

	}

}

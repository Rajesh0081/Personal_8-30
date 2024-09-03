package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Bar_Activity {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		
		js1.executeScript("window.scrollBy(0,-500)", "");
	}

}

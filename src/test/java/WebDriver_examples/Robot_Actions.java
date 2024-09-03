package WebDriver_examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Actions {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		driver.findElement(By.name("username")).sendKeys(Keys.BACK_SPACE);
		
		//Robot r=new Robot();   // CLASS
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).sendKeys(Keys.ENTER); // Keyboard actions
		
		
		
	}

}

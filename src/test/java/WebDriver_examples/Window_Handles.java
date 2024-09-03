package WebDriver_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(2000);
		
		driver.findElement(By.name("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@id='_helpid']/li[7]/a)[1]")).click();
		
		driver.findElement(By.xpath("(//*[@id='_helpid']/li[7]/ul/li[1]/a)[1]")).click();
		
		Thread.sleep(2000);
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		String parent=	it.next();
		
		String child=it.next();
		
		driver.switchTo().window(parent);
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@id='_helpid']/li[7]/a)[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@id='_helpid']/li[7]/ul/li[4]/a)[1]")).click();

	}

}

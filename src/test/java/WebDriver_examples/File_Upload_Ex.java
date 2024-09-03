package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Ex {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize(); // To maximize the Browser Window
		
		Thread.sleep(4000);  // It is a Wait method
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(2000);  // 2000/1000 =2 sec
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@id='acuserImg'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Downloads\\AVNR.pdf");
		
		driver.quit();
	}

}

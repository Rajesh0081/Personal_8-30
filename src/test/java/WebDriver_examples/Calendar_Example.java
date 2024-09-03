package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar_Example {

	public static void main(String[] args) throws Exception {
		
		String month="August 1995";
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
		
		driver.findElement(By.xpath("(//li[@id='_menu_mytransactions'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();
		
		while(true) {
			String text=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			if(text.matches(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
			}
		}
		
		driver.findElement(By.xpath("(//td[@class='day'])[2]")).click();
		
	}

}

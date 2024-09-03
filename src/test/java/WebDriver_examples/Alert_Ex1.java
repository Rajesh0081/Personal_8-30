package WebDriver_examples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex1 {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // Ok -->Accept // Cancel -->dismiss
		

	}

}

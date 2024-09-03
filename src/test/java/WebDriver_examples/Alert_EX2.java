package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_EX2 {

	public static void main(String[] args) throws Exception {
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  
	  driver.findElement(By.xpath("//div[@class='tabpane pullleft']/ul/li[2]")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  
	  driver.switchTo().alert().accept();

	}

}

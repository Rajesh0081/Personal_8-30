package WebDriver_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[@class='tabpane pullleft']/ul/li[3]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert text=driver.switchTo().alert();
		text.sendKeys("Welcome Aditya");
		text.accept();

	}

}

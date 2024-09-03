package WebDriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_examples {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/"); // To pass URL
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();  // To refresh the page
		Thread.sleep(4000);
		
		driver.navigate().back();   // To click on Back 
		Thread.sleep(3000);
		
		driver.navigate().forward();  // To click Forward
		
		
	}

}

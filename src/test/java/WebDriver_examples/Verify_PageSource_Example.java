package WebDriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_PageSource_Example {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);

	}

}

package WebDriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
			String title=driver.getTitle();
			System.out.println(title);
			
			if (driver.getTitle().equals("Google1234")) {
				System.out.println("Title Matched");
				
			} else {
				System.out.println("Title is Not Matched");
			}

	}

}

package WebDriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_URL {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		String url=	driver.getCurrentUrl();
		System.out.println(url);
		
		if (driver.getCurrentUrl().equals("apps17")) {
			System.out.println("URL matched");
		} else {
			System.out.println("Url is not matched"+driver.getCurrentUrl());
		}

	}

}

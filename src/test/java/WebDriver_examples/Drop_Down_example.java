package WebDriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_example {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		
		Select lstbox = new Select(driver.findElement(By.id("oldSelectMenu")));
		//lstbox.selectByIndex(3);
		
		//lstbox.selectByValue("4");
		
		lstbox.selectByVisibleText("Indigo");
		
		
		

	}

}

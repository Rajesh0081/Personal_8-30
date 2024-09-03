package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	
	public WebDriver driver;
	
	LoginClass(WebDriver driver){
		this.driver=driver;
	}
	
	
	
	//locators
	By txt_Username=By.xpath("//input[@type='text']");
	
	By txt_Password=By.xpath("//input[@type='password']");
	
	By txt_Submit=By.xpath("//button[@class='btn login-btn']");
	
	
	//actions
	
	public void setusername(String username) {
		driver.findElement(txt_Username).sendKeys(username);
	}
	
	public void setpassword(String userpassword) {
		driver.findElement(txt_Password).sendKeys(userpassword);
	}
	
	public void clickSubmit() {
		driver.findElement(txt_Submit).click();
	}

}

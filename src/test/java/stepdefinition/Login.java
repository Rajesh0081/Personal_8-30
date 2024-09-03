package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	
	
	@Given("Open SutiExpense Application")
	public void launch() {
		 driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
	}
	
	
	
	@When("Typing Username and Password")
	public void login() throws Exception {
		Thread.sleep(4000);
		
		driver.manage().window().maximize(); // To maximize the Browser Window
		
		Thread.sleep(4000);  // It is a Wait method
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(2000);  // 2000/1000 =2 sec
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
	}
	
	
	@Then("Login page should display")
	public void close() {
		driver.close();
		
	}

}

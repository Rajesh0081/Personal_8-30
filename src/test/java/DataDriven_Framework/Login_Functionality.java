package DataDriven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Login_Functionality {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void lauch() {
		 driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void login() throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\Desktop\\Book1.xls");
		
		
		//"C:\Users\dell\Desktop\Book1.xls"
		Workbook wb=Workbook.getWorkbook(fis);
		
		Sheet s=wb.getSheet(0);
		
		String un=s.getCell(0, 1).getContents();
		String pw=s.getCell(1, 1).getContents();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);  // 2000/1000 =2 sec
		
		driver.findElement(By.id("userpassword")).sendKeys(pw);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
	}
	
	
	@AfterClass
	public void logout() {
		
		driver.close();
		
	}

}

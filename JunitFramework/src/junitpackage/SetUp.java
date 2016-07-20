package junitpackage;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;

//import static org.junit.Assert.*;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
     WebDriver driver;
	@BeforeClass
	public static void testLogin() {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

 public void logintest(){
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
    //assert.AssertEquals( expecteduname,actualuname);
	
}

}

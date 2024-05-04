package Protrainingtech.Trainingsessionforselenium;

import org.testng.annotations.Test;

import Pages.Home;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

@Test
public class Signkh<Forgot> {
	
	
	WebDriver driver;
	
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.psswrdfieldsfill();
	  shots();
	  ob.ForgotPasswordClick();
	  Forgot fb=new Forgot(driver);
	  fb.ForgotPasswordFields();
	  
	  
	  
	  
	  
	/*WebElement emailfields=driver.findElement(By.name("email"));
	  emailfields.sendKeys("wardzaman@gmail.com");
	  WebElement psswrdfields=driver.findElement(By.name("pass"));
	  psswrdfields.sendKeys("abc123@"); */
	  
	  
  }
  private void shots() {
	// TODO Auto-generated method stub
	
}
@BeforeMethod
  public void beforeMethod() {
	  Ibrowsers("Edge");
  }
public void Ibrowsers(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	
	}else {
		System.out.println("Name of browser didn't exist");
	}
}
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  
	  driver.quit();
	  
	  @Test (priority=2, dependsOnMethods = "f");
	  
	  
	  
	  
	  
  }

}

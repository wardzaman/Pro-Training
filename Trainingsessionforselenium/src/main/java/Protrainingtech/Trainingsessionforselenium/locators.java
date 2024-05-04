package Protrainingtech.Trainingsessionforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");		
		driver.manage().window().maximize();
		
		WebElement EmailField=driver.findElement(By.id("email"));
		EmailField.sendKeys("wardzaman@yahoo.com");
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("ABC123");
		WebElement ForgotLink=driver.findElement(By.linkText("Forgot password?"));
		Thread.sleep(5000);
		ForgotLink.click();
	}

}

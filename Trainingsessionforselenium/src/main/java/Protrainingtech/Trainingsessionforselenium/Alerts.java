package Protrainingtech.Trainingsessionforselenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");		
	driver.manage().window().maximize();
	
	WebElement Submitbutton=driver.findElement(By.name("submit"));
	Submitbutton.click();
	Thread.sleep(6000);
	driver.switchTo().alert().dismiss();
	driver.switchTo().alert().sendKeys("");
}

	
}
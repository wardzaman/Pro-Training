package Protrainingtech.Trainingsessionforselenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsofAmazon {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lexus.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Shoplinks=driver.findElement(By.xpath("//*[text()="SHOP" and @aria-expanded="false"]]"));
		
		
		
				
		
		
		//*[text()="SHOP" and @aria-expanded="false"]

	}

}

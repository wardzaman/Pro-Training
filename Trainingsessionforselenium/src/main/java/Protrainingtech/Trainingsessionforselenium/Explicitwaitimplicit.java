package Protrainingtech.Trainingsessionforselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitimplicit {
static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");		
		driver.manage().window().maximize();
		
		WebElement CreateButton=driver.findElement(By.linkText("Create new account"));
		CreateButton.click();
		//Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait ob = new WebDriverWait(driver, Duration.ofSeconds(20));
		ob.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname")));
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("Zaman");
		
	}

}

package Protrainingtech.Trainingsessionforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	private static final String Actions = null;
	static WebDriver driver;
	public static void main(String[] args, org.openqa.selenium.interactions.Actions ob) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");		
		driver.manage().window().maximize();
	WebElement RightClcik=driver.findElement(By.xpath(//img[@style='cursor: pointer;']));
	Actions ob=new Actions(driver);
	ob.contextClick(RightClcik).build().perform();
	
			
	}

}

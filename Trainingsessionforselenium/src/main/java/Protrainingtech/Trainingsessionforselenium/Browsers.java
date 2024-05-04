package Protrainingtech.Trainingsessionforselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Browsers {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//There are two commands to open the webaddress/URL
		//First is driver.navigate().to		//This will create history
		//Second is driver.get				//This will not create history
		
		//driver.navigate().to("https://www.protrainingtech.com");
		driver.get("https://www.protrainingtech.com");
		
		//To maximize the browser window
		
		driver.manage().window().maximize();
		Thread.sleep(5000);					//Thread sleep is just to show the pause for 5 seconds
			driver.navigate().back();
		Thread.sleep(5000);
			driver.navigate().forward();
		Thread.sleep(5000);
		String Title = driver.getTitle();		//First we wrote driver.get command then name it "String Tilte"
		String CurrentURL = driver.getCurrentUrl();
		String Session = driver.getWindowHandle();
		
		System.out.println(Title);
		System.out.println(CurrentURL);
		System.out.println(Session);
		
			driver.close();
		
		//Manage, navigate and Get are 3 different methods we used above
	}

}

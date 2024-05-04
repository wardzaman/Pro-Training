package Protrainingtech.Trainingsessionforselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wardz\\eclipse-workspace\\Trainingsessionforselenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");		
		driver.manage().window().maximize();
		
		WebElement CreateButton=driver.findElement(By.linkText("Create new account"));
		CreateButton.click();
		Thread.sleep(5000);
		
		//This is the Basic xpath
		
		/* WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Ward");
		
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("Zaman");
		
		WebElement Mobile=driver.findElement(By.name("reg_email__"));
		Mobile.sendKeys("3047779012");
		
		WebElement NewPassword=driver.findElement(By.name("reg_passwd__"));
		NewPassword.sendKeys("XYZ321");
		
		WebElement MonthofBirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(MonthofBirth);
		ob.selectByValue("9");

		WebElement DayofMonth=driver.findElement(By.name("birthday_day"));
		Select ob1=new Select(DayofMonth);
		ob1.selectByValue("30");

		WebElement BirthYear=driver.findElement(By.name("birthday_year"));
		Select ob2=new Select(BirthYear);
		ob2.selectByValue("1979");

		WebElement Gender=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
		Gender.click();
		//Gender.click(); */
		
		//This is the relative xpath
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		FirstName.sendKeys("Ward");
		
		WebElement LastName=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		LastName.sendKeys("Zaman");
		
		WebElement Mobile=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		Mobile.sendKeys("3047779012");
		
	
		
	}

}

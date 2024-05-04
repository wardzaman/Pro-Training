package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	//add all the locators according to use for that page, create method for each locator according to action
	@FindBy (name = "email") WebElement emails;
	@FindBy (name = "pass") WebElement psswrdfields;
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void emailfieldsfill() {
		emails.sendKeys("hr@gmail.com");
	}
	
	public void psswrdfieldsfill() {
		psswrdfields.sendKeys("abc123@");
	}

	public void ForgotPasswordClick() {
		// TODO Auto-generated method stub
		//This is a sample comment for github only
		
		 
				}

}








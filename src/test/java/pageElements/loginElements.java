package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class loginElements {
	

	WebDriver driver;
	
	public loginElements(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	
	@FindBy(name="email")
	WebElement emailElement;
	
	@FindBy(name="password")
	WebElement passwordElement;
	
	@FindBy(xpath=".//*[@id='app']/div/div/div/form/button")
	WebElement SignIn;


	public void clickSignIn() {
		SignIn.click();	
	}
	
	public void setCredentials(String email, String password) {
		emailElement.sendKeys(email);
		passwordElement.sendKeys(password);
		
	}
	
	
}
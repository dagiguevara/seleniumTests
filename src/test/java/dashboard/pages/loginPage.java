package dashboard.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class loginPage { 
	
	
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
	
	public void login() {
		setCredentials("dagiguevara@gmail.com", "Password01");
		clickSignIn();
	}
	
	
}
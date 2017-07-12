package dashboard.tests;

import org.testng.annotations.Test;

import dashboard.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import factory.Browser;

public class loginTest {
	
	Browser browser = new Browser();
	WebDriver driver = browser.startBrowser();
	loginPage login_page = PageFactory.initElements(driver, loginPage.class);
	
  @Test
  public void successLogin() {
	  
	  login_page.login();
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

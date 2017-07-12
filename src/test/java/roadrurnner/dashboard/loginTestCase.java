package roadrurnner.dashboard;

import org.testng.annotations.Test;

import factory.browserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import pageElements.loginElements;



public class loginTestCase {
	WebDriver driver= browserFactory.startBrowser("Chrome", "http://roadrunner-dashboard-dev.s3-website-us-east-1.amazonaws.com/#!/signin");
	loginElements login_page = PageFactory.initElements(driver, loginElements.class);
  
	
	@Test
  public void sucessLogin() throws InterruptedException {
	  
	  
	  login_page.setCredentials("dagiguevara@gmail.com", "Password01");
	  login_page.clickSignIn();
	  
	  
  }
  @AfterClass
  public void afterMethod() {
	
	login_page.driver.quit();
 
  }

}

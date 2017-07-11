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
  public void fuck() throws InterruptedException {
	  
	  
	  login_page.setCredentials("dagiguevara@gmail.com", "Password01");
	  login_page.clickSignIn();
	  
	  
  }
  @AfterClass
  public void afterMethod() {
	//WebDriver driver = null;
	//browserFactory quit_browser = PageFactory.initElements(driver, browserFactory.class);
	//quit_browser.browserQuit();
	
	login_page.driver.quit();
 
  }

}

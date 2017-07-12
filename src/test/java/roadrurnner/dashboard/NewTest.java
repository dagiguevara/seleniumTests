package roadrurnner.dashboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import factory.startBrowser;
public class NewTest {
	
	private WebDriver driver;
	startBrowser starting = PageFactory.initElements(driver, startBrowser.class);
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  starting.getBrowser();
	  
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

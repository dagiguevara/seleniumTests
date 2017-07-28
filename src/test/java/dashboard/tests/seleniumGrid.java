package dashboard.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class seleniumGrid {
RemoteWebDriver driver;
	
	
  @Test
public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException, InterruptedException {
	  //System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	  
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability("version", "");
		capability.setCapability("platform", "LINUX");
		driver  = new RemoteWebDriver(new URL("http://selenium-env.hubhhmz5hp.us-east-1.elasticbeanstalk.com/wd/hub"), capability);
		driver.get("http://google.hn");
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
	

		
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

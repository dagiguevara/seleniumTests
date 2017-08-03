package dashboard.tests;

import org.testng.annotations.Test;

import com.testingbot.testingbotrest.TestingbotREST;

import factory.bot;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import factory.bot;
public class seleniumGrid {

	RemoteWebDriver driver;
	static String username = "dagiguevara%40gmail.com"; // Your username
    static String authkey = "ub965ee28b7f8c5f";  // Your authkey
    String testScore = "unset";
  
@Test
public void f() {
	driver.getSessionId();
	driver.get("http://google.hn");;
	  
  }
  @BeforeMethod
  public void setUp() throws Exception {
      DesiredCapabilities capabillities = DesiredCapabilities.firefox();
      capabillities.setCapability("version", "latest");
      capabillities.setCapability("platform", Platform.WINDOWS);
      capabillities.setCapability("name", "Testing Selenium");
      

      driver = new RemoteWebDriver(
              new URL("http://" + username + ":" + authkey +"@hub.crossbrowsertesting.com:80/wd/hub"),capabillities);

		
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

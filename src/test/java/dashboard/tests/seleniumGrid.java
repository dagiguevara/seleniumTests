package dashboard.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class seleniumGrid {
RemoteWebDriver driver;
	
	
  @Test
public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	  
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability("version", "");
		capability.setCapability("platform", "LINUX");
		driver  = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), capability);
		driver.manage().window().maximize();
		driver.get("http://roadrunner-dashboard-dev.s3-website-us-east-1.amazonaws.com/#!/signin");
		driver.findElement(By.name("email")).sendKeys("dagiguevara@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Password01");
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/form/button")).click();
		
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

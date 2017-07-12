package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	
  
  public WebDriver startBrowser() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://roadrunner-dashboard-dev.s3-website-us-east-1.amazonaws.com/#!/signin");
	  return driver;
  }
}

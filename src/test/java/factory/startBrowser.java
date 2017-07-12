package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class startBrowser {
	
	static WebDriver driver;
	
  @Test
  public void getBrowser() {
	  System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://google.hn");
  }
}

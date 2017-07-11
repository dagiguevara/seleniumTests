package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {



static WebDriver driver;

public static WebDriver startBrowser(String browserName, String baseUrl)
{
	
 if(browserName.equals("Firefox"))

 {
	driver = new FirefoxDriver();
}
 else if(browserName.equals("Chrome"))
 {
	 System.setProperty("webdriver.chrome.driver", "/Users/donaldguevara/Desktop/selenium/Roadrunner/chromedriver");
	 driver = new ChromeDriver();
  }
 
 driver.manage().window().maximize();
 driver.get(baseUrl);
 return driver; 
}

public  void browserQuit() {
	driver.quit();
}






}
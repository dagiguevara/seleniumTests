package parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability("version", "");
		capability.setCapability("platform", "LINUX");
		driver  = new RemoteWebDriver(new URL("http://7e3be3c116a7b142d040190b5941df58:7d35c4ad773a477340b866913ff53b8e@hub.testingbot.com/wd/hub"), capability);
		driver.manage().window().maximize();
		driver.get("http://roadrunner-dashboard-dev.s3-website-us-east-1.amazonaws.com/#!/signin");
		driver.findElement(By.name("email")).sendKeys("dagiguevara@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Password01");
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/form/button")).click();
		driver.quit();
  }
}

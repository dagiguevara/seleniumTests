package dashboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class mapPage {
	
	
	@FindBy(xpath=".//*[@id='app']/div[5]/div/div[1]/a[2]")
	WebElement tripHistory;
	
	@FindBy(xpath=".//*[@id='app']/div[5]/div/div[1]/a[3]")
	WebElement boundary;
	

  
  public void mapClick() {
	  
	  boundary.click();
	  
  }
}

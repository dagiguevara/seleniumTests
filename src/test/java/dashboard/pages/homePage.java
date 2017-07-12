package dashboard.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage {
	
	
	@FindBy(xpath=("//*[@id='menu']/a[2]"))
	WebElement mapButton;
	
	@FindBy(xpath=("//*[@id=\'menu\']/div[2]/a"))
	WebElement menuButton;
	
  public void homeClick() { 
	  
	  mapButton.click();
	  
	  
  }
}

package dashboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class boundariesPage {
  
 
	  @FindBy(xpath=".//*[@id='app']/div[4]/div/div[2]/div[1]/button")
		WebElement newBoundary;
		
		@FindBy(xpath=".//*[@id='app']/div[4]/div/div[2]/form/div[1]/div[2]/div[1]")
		WebElement selectDevice;
		
		@FindBy(xpath=".//*[@id='device-dropdown-item']")
		WebElement deviceSelected;

		@FindBy(name="boundary-name")
		WebElement boundaryName;
		
		@FindBy(name="boundary-address")
		WebElement boundaryAddress;
		
		@FindBy(xpath=".//*[@id='app']/div[4]/div/div[2]/form/div[2]/div[6]/button")
		WebElement saveBoundary;
		
		@FindBy(xpath=".//*[@id='app']/div[4]/div/div[2]/div[2]/div[3]/div[3]")
		WebElement existingBoundary;
		
		public void addNewBoundary(String name, String address) {
			newBoundary.click();	
			selectDevice.click();
			deviceSelected.click();
			boundaryName.sendKeys(name);
			boundaryAddress.sendKeys(address);
			saveBoundary.click();
		}
		
		public void updateBoundary(String name, String address) throws InterruptedException {
			existingBoundary.click();
			boundaryName.sendKeys(name);
			boundaryAddress.sendKeys(address);
			saveBoundary.click();
			Thread.sleep(3000);
		}
		
		
		
		
		
		
		
	  
  
  }


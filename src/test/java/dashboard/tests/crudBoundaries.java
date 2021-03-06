package dashboard.tests;

import org.testng.annotations.Test;

import dashboard.pages.boundariesPage;
import dashboard.pages.homePage;
import dashboard.pages.loginPage;
import dashboard.pages.mapPage;
import factory.Browser;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;


public class crudBoundaries {
	
	Browser browser = new Browser();
	WebDriver driver = browser.startBrowser();
	loginPage login_page = PageFactory.initElements(driver, loginPage.class);
	homePage home = PageFactory.initElements(driver, homePage.class);
	mapPage map = PageFactory.initElements(driver, mapPage.class);
	boundariesPage boundary = PageFactory.initElements(driver, boundariesPage.class);
	
	
  @Test
  public void boundaries() throws InterruptedException {
	  
	 Thread.sleep(5000);
	 home.homeClick();
	 Thread.sleep(5000);
	 map.mapClick();
	 boundary.addNewBoundary("office9", "tegucigapla");
	 boundary.updateBoundary("Office99donald", "jhsjkhskjs");
	 boundary.deleteBoundary(); //click delete
	 driver.navigate().refresh();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 boundary.confirmDeleteBoundary();
	 
	 
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  login_page.login();
	  
	  
		  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}

package testNG_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Demo.SeleniumUtility;

public class OrangeHrmPim extends SeleniumUtility  {
	WebDriver driver;
	
  @Test(priority=2)
  public void testOrangeHrmLogin_positiveFlow() {
	  
	  driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  typeRequiredText(driver.findElement(By.name("username")),"Admin");
	  typeRequiredText(driver.findElement(By.name("password")),"admin123");
	  clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	  String expectedUrl="dashboard";
	  System.out.println("positive log in validation : "+getApplicationUrl().contains(expectedUrl));
	  driver.close();
	  
  }
  @Test(priority=1)
 public void testOrangeHrmLogin_negativeFlow() {
	  
	  driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  typeRequiredText(driver.findElement(By.name("username")),"Admin");
	  typeRequiredText(driver.findElement(By.name("password")),"admin123");
	  clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	  
	  String expectedUrl="login";
	  System.out.println("negative log in validation : "+getApplicationUrl().contains(expectedUrl));
	  driver.close();
  }
}

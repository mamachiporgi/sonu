package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver","E:\\SAHIL\\Sahil_CSDF\\Sahil_CSDF\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  
	  String expectedTitle = "Google";
	  
	  String actualTitle = driver.getTitle();
	  
	  Assert.assertEquals(actualTitle, actualTitle);
	  
	  
  }
}

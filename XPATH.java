package AllPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\SAHIL\\Sahil_CSDF\\Sahil_CSDF\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		//locating elements using Absolute Path

		//locate=WEB

		WebElement locate1=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/h4[2]")); System.out.println(locate1.getText());

		//locate=Must Learn

		WebElement locate2=driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/h4[2]"));
		System.out.println(locate2.getText());

		//locating element using Relative Path

		//locate=Performance Testing

		WebElement locate3 = driver.findElement(By.xpath("//div[@class='col-md-3']/div[1]/h4[3]/b"));
		System.out.println(locate3.getText());

		//username

		WebElement username=driver.findElement(By.xpath("//input[@name='uid']")); username.sendKeys("abc");

		//password

		WebElement password=driver.findElement(By.xpath("//input[@name='password']")); password.sendKeys("xyz12345");

		}


	

}

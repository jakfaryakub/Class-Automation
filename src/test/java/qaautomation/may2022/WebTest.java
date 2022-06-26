package qaautomation.may2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class WebTest extends BaseWebTest{	
	@Test
	public void testLogin() {
		//cara mendapatkan username dengan xpath
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.get().findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "You logged into a secure area!";
		
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
		
		@Test
		public void testLoginFailedWrongPassword() {
			//cara mendapatkan username dengan xpath
			driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretSalah");
			driver.get().findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "invalid";
			
			Assert.assertTrue(actualText.contains(expectedText));
		}
		
		@Test
		public void testLoginFailedWrongUsername() {
			//cara mendapatkan username dengan xpath
			driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith123");
			driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			driver.get().findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "invalid";
			
			Assert.assertTrue(actualText.contains(expectedText));
		}
		
		
		@Test
		public void testLoginFailedWrongUsernameAndPassword() {
			//cara mendapatkan username dengan xpath
			driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith123");
			driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!123");
			driver.get().findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
			String expectedText = "invalid";
			
			Assert.assertTrue(actualText.contains(expectedText));
		}

}

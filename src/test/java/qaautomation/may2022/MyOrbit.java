package qaautomation.may2022;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MyOrbit {
	
	@Test
	public void testAksesWeb() {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myorbit.id/");
		String actualText = driver.findElement(By.xpath("//h1[normalize-space()='WiFi Rumah Terpercaya untuk Keluarga Anda']")).getText();
		String expectedText = "WiFi Rumah Terpercaya untuk Keluarga Anda";
		Assert.assertTrue(actualText.contains(expectedText));
		
		driver.quit();
		//driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		//String actualText = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		//String expectedText = "You logged into a secure area!";
	}

	
	@Test
	public void testPageLogin() {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myorbit.id/login");
		//driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		String actualText = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getText();
		String expectedText = "Login";
		Assert.assertTrue(actualText.contains(expectedText));
		driver.quit();
		
	}
	
	

	@Test
	public void testInputEmailPassword() {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myorbit.id/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='name@gmail.com']")).sendKeys("testautomation@getnada.com");
		driver.findElement(By.xpath("//div[contains(text(),'Lanjutkan')]")).click();
		String actualText = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getText();
		String expectedText = "Login";
		Assert.assertTrue(actualText.contains(expectedText));
		
		driver.findElement(By.xpath("//input[@placeholder='Masukkan password Anda']")).sendKeys("123123123@");
		driver.findElement(By.xpath("//div[contains(text(),'Lanjutkan')]")).click();
		String actualTextPassword = driver.findElement(By.xpath("//div[normalize-space()='Anda tidak memiliki transaksi. Silakan buat transaksi Anda.']")).getText();
		String expectedTextPassword = "Tidak memiliki transaksi";
		System.out.println(actualTextPassword);
		Assert.assertTrue(actualTextPassword.contains(expectedTextPassword));
		driver.quit();
		
	}
	

}

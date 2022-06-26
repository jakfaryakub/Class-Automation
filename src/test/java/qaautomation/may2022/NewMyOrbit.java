package qaautomation.may2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewMyOrbit {
	
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "https://www.myorbit.id/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void aksesWebsite()throws Exception{
		driver.get(baseUrl);
		element = driver.findElement(By.xpath("//h1[normalize-space()='WiFi Rumah Terpercaya untuk Keluarga Anda']"));
		element.getText();
		System.out.println(element.getText());
		
	}
	
	@AfterMethod
	public void closeBrowser()throws Exception{
		driver.quit();
	}

}

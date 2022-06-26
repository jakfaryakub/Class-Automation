package TugasAutomationSauceDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChartPage extends BasePage {

	By checkOut = By.id("checkout");
	By successCheckOut = By.xpath("//span[@class='title']");

	public ChartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}


	public void clickCheckOut() {
		clickAndWait(checkOut);
	} 
	
	public String checkOutValidation() {
		return getText(successCheckOut);
	}
	

}
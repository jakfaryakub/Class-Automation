package TugasAutomationSauceDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutReviewPage extends BasePage {

	By checkOutReview = By.xpath("//span[@class='title']");
	By finishBtn = By.id("finish");
	By checkOutComplete = By.xpath("//span[@class='title']");

	public CheckOutReviewPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}


	public String checkOutReview() {
		return getText(checkOutReview);
	}
	
	public void clickFinish() {
		clickAndWait(finishBtn);
	} 
	
	public String checkOutComplete() {
		return getText(checkOutComplete);
	}
	
	
}
package TugasAutomationYopMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	By inputEmail = By.id("login");
	By submitBtn = By.xpath("//i[@class='material-icons-outlined f36']");

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	
	public void addEmail(String email) {
		setText(inputEmail, email);
		clickAndWait(submitBtn);
	}
}

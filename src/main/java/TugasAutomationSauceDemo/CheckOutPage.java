package TugasAutomationSauceDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BasePage {

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueBtn = By.id("continue");

	public CheckOutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}


	public void dataInformation(String firstname, String lastname, String postalcode) {
		setText(firstName, firstname);
		setText(lastName, lastname);
		setText(postalCode, postalcode);
		clickAndWait(continueBtn);
	}
	

}
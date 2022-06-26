package TugasAutomationYopMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage extends BasePage{
	
	//By inbox = By.xpath("//div[normalize-space()='Konfirmasi Pesanan Anda']");
	By inboxText = By.xpath("/html/body/header/div[3]/div[1]");

	public InboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getInboxText() {
		return getText(inboxText);
	}
	
}

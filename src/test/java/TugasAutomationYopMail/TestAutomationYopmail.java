package TugasAutomationYopMail;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestAutomationYopmail extends BaseWebTest{
	HomePage inputEmail = new HomePage(driver, explicitWait);
	InboxPage getTextInbox = new InboxPage(driver, explicitWait);
	
	
	@Test
	public void inputEmailYopmail() {
	// cara mendapatkan username dengan xpath
	String email = "testyopmail001";

	inputEmail.addEmail(email);
	String actualText = getTextInbox.getInboxText();
	System.out.println(actualText);
	String expectedText = "Konfirmasi Pesanan Anda";
	

	Assert.assertTrue(actualText.contains(expectedText));
	}
}
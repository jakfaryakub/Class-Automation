package qaautomation.may2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.may2022.pages.LoginPage;
import qaautomation.may2022.pages.ProfilePage;

public class WebTestAfterPOM extends BaseWebTest {

	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	@Test
	public void testLogin() {
		// cara mendapatkan username dengan xpath
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.loginWeb(username, password);
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";

		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void testLoginFailedWrongPassword() {
		// cara mendapatkan username dengan xpath
		String username = "tomsmith";
		String password = "SuperSecretzzzzz";

		loginPage.loginWeb(username, password);
		String actualText = profilePage.getProfileText();
		String expectedText = "invalid";

		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void testLoginFailedWrongUsername() {
		// cara mendapatkan username dengan xpath
		String username = "tomsmithzzz";
		String password = "SuperSecretPassword!";

		loginPage.loginWeb(username, password);
		String actualText = profilePage.getProfileText();
		String expectedText = "invalid";

		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void testLoginFailedWrongUsernameandPassword() {
		// cara mendapatkan username dengan xpath
		String username = "tomsmithzzz";
		String password = "SuperSeczretzzzzz";

		loginPage.loginWeb(username, password);
		String actualText = profilePage.getProfileText();
		String expectedText = "invalid";

		Assert.assertTrue(actualText.contains(expectedText));
	}

}

package TugasAutomationSauceDemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestAutomationPOM extends BaseWebTest{
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProductPage productPage = new ProductPage(driver, explicitWait);
	ChartPage chartPage = new ChartPage(driver, explicitWait);
	CheckOutPage checkOutPage = new CheckOutPage (driver, explicitWait);
	CheckOutReviewPage checkOutReview = new CheckOutReviewPage (driver, explicitWait);
	
	
	@Test
	public void checkOutCompleted() {
	// cara mendapatkan username dengan xpath
	String username = "standard_user";
	String password = "secret_sauce";

	loginPage.loginWeb(username, password);
	String actualText = productPage.getProductText();
	String expectedText = "PRODUCTS";

	Assert.assertTrue(actualText.contains(expectedText));

	productPage.clickAddToChart();
	String actualTextChart = productPage.successAddToCHart();
	String expectedTextChart = "REMOVE";
		
	Assert.assertTrue(actualTextChart.contains(expectedTextChart));
	
	productPage.clickChart();
	String actualTextChart2 = productPage.chartPage();
	String expectedTextChart2 = "YOUR CART";
		
	Assert.assertTrue(actualTextChart2.contains(expectedTextChart2));
	
	chartPage.clickCheckOut();
	String actualTextSuccessCheckOut = chartPage.checkOutValidation();
	String expectedTextSuccessCheckOut = "CHECKOUT: YOUR INFORMATION";
		
	Assert.assertTrue(actualTextSuccessCheckOut.contains(expectedTextSuccessCheckOut));
	
	String firstname = "Test";
	String lastname = "Automation";
	String postalcode = "11440";
	
	checkOutPage.dataInformation(firstname, lastname, postalcode);
	String actualTextReview = checkOutReview.checkOutReview();
	String expectedTextReview = "CHECKOUT: OVERVIEW";

	Assert.assertTrue(actualTextReview.contains(expectedTextReview));
	
	checkOutReview.clickFinish();
	String actualTextFinish = checkOutReview.checkOutComplete();
	String expectedTextFinish = "CHECKOUT: COMPLETE!";

	Assert.assertTrue(actualTextFinish.contains(expectedTextFinish));
	}
}
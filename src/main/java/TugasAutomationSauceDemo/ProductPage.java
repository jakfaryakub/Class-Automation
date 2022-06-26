package TugasAutomationSauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import qaautomation.may2022.pages.BasePage;

public class ProductPage extends BasePage {
	
	By productText = By.xpath("//span[@class='title']");
	By addToChart = By.id("add-to-cart-sauce-labs-backpack");
	By successAddToChart = By.id("remove-sauce-labs-backpack");
	By toChartPage = By.xpath("//a[@class='shopping_cart_link']");
	By chartPage = By.xpath("//span[@class='title']");

	public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public String getProductText() {
		return getText(productText);
	}
	

	public void clickAddToChart() {
		clickAndWait(addToChart);
	} 
	
	public String successAddToCHart() {
		return getText(successAddToChart);
	}
	
	public void clickChart() {
		clickAndWait(toChartPage);
	}
	public String chartPage() {
		return getText(chartPage);
	}
	

}

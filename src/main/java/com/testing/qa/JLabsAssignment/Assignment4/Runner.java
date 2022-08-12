package com.testing.qa.JLabsAssignment.Assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.qa.JLabsAssignment.Assignment4.Pages.ChartPage;
import com.testing.qa.JLabsAssignment.Assignment4.Pages.CompletePage;
import com.testing.qa.JLabsAssignment.Assignment4.Pages.LoginPage;
import com.testing.qa.JLabsAssignment.Assignment4.Pages.OverviewPage;
import com.testing.qa.JLabsAssignment.Assignment4.Pages.ProductsPage;
import com.testing.qa.JLabsAssignment.Assignment4.Pages.YourInformationPage;

public class Runner extends BaseWebTest {

	String username = "standard_user";
	String password = "secret_sauce";
	String firstName = "Rofid";
	String lastName = "Hilmi";
	int postalCode = 14410;

	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProductsPage productPage = new ProductsPage(driver, explicitWait);
	ChartPage chartPage = new ChartPage(driver, explicitWait);
	YourInformationPage yourInformationPage = new YourInformationPage(driver, explicitWait);
	OverviewPage overviewPage = new OverviewPage(driver, explicitWait);
	CompletePage completePage = new CompletePage(driver, explicitWait);

	@Test
	public void testLogin() {

		driver.get().get("https://www.saucedemo.com/");
		loginPage.LoginWebTest(username, password);
		productPage.changeFilter();
		productPage.selectProducts();
		productPage.checkChart();
		chartPage.checkout();
		yourInformationPage.inputInformation(firstName, lastName, postalCode);
		yourInformationPage.continueStep();
		overviewPage.finishStep();
		String actualText = completePage.getTitlePage();
		String expectedText = "CHECKOUT: COMPLETE!";
		Assert.assertTrue(actualText.contains(expectedText));

	}

	@Test
	public void loginWithoutUsername() {

		driver.get().get("https://www.saucedemo.com/");
		loginPage.LoginWithoutUsername(password);
	}

	@Test
	public void loginWithoutPassword() {
		driver.get().get("https://www.saucedemo.com/");
		loginPage.LoginWithoutPassword(username);
	}

	@Test
	public void loginWihtoutUserPass() {
		driver.get().get("https://www.saucedemo.com/");
		loginPage.UserPassNull();

	}

	@Test
	public void wrongUsername() {

		String username = "standard_";
		String password = "secret_sauce";

		driver.get().get("https://www.saucedemo.com/");
		loginPage.LoginWebTest(username, password);
	}

	@Test
	public void wrongPassword() {

		String username = "standard_user";
		String password = "secret_";

		driver.get().get("https://www.saucedemo.com/");
		loginPage.LoginWebTest(username, password);
	}

}

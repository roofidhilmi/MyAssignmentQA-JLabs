package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChartPage extends BasePage {

	public ChartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	By btnCheckout = By.xpath("//button[@id='checkout']");

	public void checkout() {
		clickAndWait(btnCheckout);
	}
}

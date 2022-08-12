package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourInformationPage extends BasePage {

	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By postalCode = By.xpath("//input[@id='postal-code']");
	By continueStep = By.xpath("//input[@id='continue']");

	public YourInformationPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public void inputInformation(String first, String last, int number) {
		setText(firstName, first);
		setText(lastName, last);
		setNumber(postalCode, number);

	}

	public void continueStep() {
		clickAndWait(continueStep);
	}

}

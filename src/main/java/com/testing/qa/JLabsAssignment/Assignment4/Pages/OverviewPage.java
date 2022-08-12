package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewPage extends BasePage {

	public OverviewPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	By btnFinish = By.xpath("//button[@id='finish']");

	public void finishStep() {
		clickAndWait(btnFinish);
	}

}

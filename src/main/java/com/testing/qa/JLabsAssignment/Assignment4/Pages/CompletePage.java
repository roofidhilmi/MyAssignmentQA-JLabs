package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompletePage extends BasePage {

	public CompletePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	By titlePage = By.className("title");

	public String getTitlePage() {
		return getText(titlePage);
	}

}

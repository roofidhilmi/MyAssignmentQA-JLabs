package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.xpath("//input[@id='login-button']");

	public void LoginWebTest(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(loginBtn);
	}

	public void LoginWithoutUsername(String pass) {
		setText(password, pass);
		clickAndWait(loginBtn);
	}

	public void LoginWithoutPassword(String user) {
		setText(username, user);
		clickAndWait(loginBtn);
	}

	public void UserPassNull() {
		clickAndWait(loginBtn);
	}

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

}

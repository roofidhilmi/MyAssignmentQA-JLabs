package com.testing.qa.JLabsAssignment.Assignment3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputEmail extends BasePage {

	By username = By.id("login");
	By btnNext = By.xpath("//button[@title='Check Inbox @yopmail.com']");
//	By iconEmail = By.tagName("button");

	public void inputEmail(String email) {
		setText(username, email);
		clickAndWait(btnNext);

	}

	public InputEmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

//	public void swithciFrame() {
//		driver.get().switchTo().frame("ifmail");
//		WebElement ifMail = driver.get().findElement(By.name("You logged in to BetMGM"));
//		String frame1Text = ifMail.getText();
//		System.out.println(frame1Text);
//	}

}

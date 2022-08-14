package com.testing.qa.JLabsAssignment.Assignment3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEmail extends BasePage {

//	By listInbox = By.xpath("(//button[@class='lm'])[2]");

	public PageEmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

//	public void getListInbox() {
//		clickAndWait(headingInbox);
//	}

	public void getEmailText() {
		WebElement iframeHeading = driver.get().findElement(By.xpath("//div[@class='fl']"));
		String iframeText = iframeHeading.getText();
		System.out.println("isi dari email ini adalah: " + iframeText);

	}

}

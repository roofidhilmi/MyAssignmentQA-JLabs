package com.testing.qa.JLabsAssignment.Assignment3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEmail extends BasePage {

	By headingInbox = By.xpath("//span[normalize-space()='QJobs']");

	public PageEmail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public void getInboxHeading() {
		clickAndWait(headingInbox);
	}

//	WebElement iframeHeadingInbox = driver.get().findElement(By.xpath("//span[normalize-space()='QJobs']"));
//	String iframeInbox = iframeHeadingInbox.click();
//	System.out.println("Judul Pesan ini adalah: " + iframeInbox);

	public void getEmailText() {
		WebElement iframeHeading = driver.get().findElement(By.xpath("//div[@id='mail']//div[1]"));
		String iframeText = iframeHeading.getText();
		System.out.println("isi pesan ini adalah: " + iframeText);

	}

}

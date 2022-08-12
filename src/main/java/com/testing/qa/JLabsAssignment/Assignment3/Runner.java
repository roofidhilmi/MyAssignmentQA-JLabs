package com.testing.qa.JLabsAssignment.Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testing.qa.JLabsAssignment.Assignment3.Pages.InputEmail;
import com.testing.qa.JLabsAssignment.Assignment3.Pages.PageEmail;

public class Runner extends BaseWebTest {

	InputEmail inputAlamatEmail = new InputEmail(driver, explicitWait);
	PageEmail iframeHeading = new PageEmail(driver, explicitWait);
//	InputEmail switchiFrame = new InputEmail(driver, explicitWait);
//	PageEmail pageEmail = new PageEmail(driver, explicitWait);

	@Test
	public void testInputEmail() {

		String username = "automationtest";

		driver.get().get("https://yopmail.com/");
		inputAlamatEmail.inputEmail(username);
		iframeHeading.getInboxHeading();

//		WebElement frame1 = driver.get().findElement(By.id("ifinbox"));
//		driver.get().switchTo().frame(frame1);
//		iframeHeading.getInboxHeading();

		WebElement frame2 = driver.get().findElement(By.id("ifmail"));
		driver.get().switchTo().frame(frame2);
		iframeHeading.getEmailText();

//		WebElement iframeHeading = driver.get().findElement(By.xpath("//p[normalize-space()='Hi AUTOMATIONTEST,']"));
//		String iframeText = iframeHeading.getText();
//		System.out.println("text ini adalah " + iframeText);

//		driver.get().switchTo().frame(1);
//		WebElement frameHeading = driver.get().findElement(By.xpath("(//div[@class='ellipsis nw b f18'])[1]"));
//		String iframeText = frameHeading.getText();
//		System.out.println(iframeText);

	}
}

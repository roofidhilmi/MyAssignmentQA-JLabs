package com.testing.qa.JLabsAssignment.Assignment4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {

	public ProductsPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	By addToChartBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	By removeProducts = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	By seeDetailProducts = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
	By productSort = By.xpath("//select[@class='product_sort_container']");
	By shoppingChart = By.xpath("//a[@class='shopping_cart_link']");

	public void selectProducts() {
		clickAndWait(addToChartBtn);

	}

	public void removeProducts() {
		clickAndWait(removeProducts);
	}

	public void seeDetailProducts() {
		clickAndWait(seeDetailProducts);
	}

	public void changeFilter() {
		clickAndWait(productSort);
		Select dropdown = new Select(driver.get().findElement(By.className("product_sort_container")));
		dropdown.selectByValue("za");
	}

	public void checkChart() {
		clickAndWait(shoppingChart);
	}

}

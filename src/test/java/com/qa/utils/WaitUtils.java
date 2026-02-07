package com.qa.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	WebDriver driver;
	WebDriverWait Wait;

	public WaitUtils(WebDriver driver) {
		this.driver = driver;
		this.Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickWhenReady(WebElement element) {
		Wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click(); // important!
	}

	public WebElement elementWhenReady(WebElement element) {
		Wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	
	public WebElement locatorWhenReady(By locator) {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

	public void scrollIntoView(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// convenience method
	public void scrollAndClick(WebElement element) {
		scrollIntoView(element);
		clickWhenReady(element);
	}
}

package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

	WebDriver driver;

	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openDequoaTextBox() {
		driver.get("https://demoqa.com/text-box");

	}

	public void formFill(String s1, String s2, String s3, String s4) {
		WebElement formName = driver.findElement(By.id("userName"));
		WebElement formEmail = driver.findElement(By.id("userEmail"));
		WebElement formCurrentAddress = driver.findElement(By.id("currentAddress"));
		WebElement formPermAddress = driver.findElement(By.id("permanentAddress"));

		formName.sendKeys(s1);
		formEmail.sendKeys(s2);
		formCurrentAddress.sendKeys(s3);
		formPermAddress.sendKeys(s4);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);

		submitButton.click();

	}

	public String assertName() {
		WebElement resultName = driver.findElement(By.id("name"));
		return resultName.getText();
	}
}

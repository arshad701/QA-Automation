package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.WaitUtils;

public class AlertsPage {

	WebDriver driver;
	WaitUtils wait;

	// initializing consturctor for it to be used
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(this.driver);

	}

	// Opens the main Page for Alerts
	public void openAlertsPage() {
		driver.get("https://demoqa.com/alerts");

	}

	// Basic Click of First Alerts
	public void clickBasicAlerts() {

		WebElement basicAlert = driver.findElement(By.id("alertButton"));
		basicAlert.click();

	}

	// Clicking accept on alerts
	public void alertClick() {
		driver.switchTo().alert().accept();
	}

	// Clicking Reject on alerts
	public void rejectClick() {
		driver.switchTo().alert().dismiss();
	}

	// Clicking on the Timed Alerts
	public void handleTimedAlert() {

		WebElement timedAlert = wait.elementWhenReady(driver.findElement(By.id("timerAlertButton")));
		timedAlert.click();
		wait.waiTillAlertReady();
		alertClick();

	}

	// Clicking and accepting on the Confirmation Alerts
	public String acceptConfirmAlert() {

		WebElement confirmAlert = wait.elementWhenReady(driver.findElement(By.id("confirmButton")));
		wait.scrollAndClick(confirmAlert);
		wait.waiTillAlertReady();
		alertClick();
		
		WebElement result = wait.elementWhenReady(driver.findElement(By.id("confirmResult")));
	    return result.getText();

	}

	// Clicking and Rejecting on the Confirmation Alerts
	public String rejectConfirmAlert() {

		WebElement confirmAlert = wait.elementWhenReady(driver.findElement(By.id("confirmButton")));
		wait.scrollAndClick(confirmAlert);
		wait.waiTillAlertReady();
		rejectClick();
		
		WebElement result = wait.elementWhenReady(driver.findElement(By.id("confirmResult")));
	    return result.getText();

	}

	// Clicking and sending values on the Prompt Alerts
	public String promtButtonAlert(String Test) {

		WebElement promtAlert = wait.elementWhenReady(driver.findElement(By.id("promtButton")));
		wait.scrollAndClick(promtAlert);
		wait.waiTillAlertReady();
		driver.switchTo().alert().sendKeys(Test);
		alertClick();
		
		WebElement result = wait.elementWhenReady(driver.findElement(By.id("promptResult")));
	    return result.getText();

	}

}

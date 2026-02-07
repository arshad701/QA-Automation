package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.utils.WaitUtils;

public class ButtonsPage {

	WebDriver driver;
	WaitUtils wait;
	Actions actions;

	public ButtonsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);
		this.actions = new Actions(driver);

	}

	public void openButtonURL() {
		driver.get("https://demoqa.com/buttons");
	}

	public void twoClick() {

		WebElement twoClick = wait.elementWhenReady(driver.findElement(By.id("doubleClickBtn")));

		actions.doubleClick(twoClick).perform();

	}

	public void rightyClick() {

		WebElement rightyClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightyClick).perform();

	}

	public void dynamicClick() {
		WebElement dynamicClick = wait.elementWhenReady(driver.findElement(By.xpath("//button[text()='Click Me']")));
		wait.scrollAndClick(dynamicClick);

	}

	public String doubleClickResults() {
		return wait.locatorWhenReady(By.id("doubleClickMessage")).getText();
		

	}

	public String rightClickResults() {
		return wait.locatorWhenReady(By.id("rightClickMessage")).getText();
		

	}

	public String dynamicClickResults() {
		return wait.locatorWhenReady(By.id("dynamicClickMessage")).getText();
		

	}

}

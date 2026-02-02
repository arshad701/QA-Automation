package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {

	WebDriver driver;

	public  GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchBox(String Text) {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(Text);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickSearch = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		clickSearch.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

	}

	public void testGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Title is: " + driver.getTitle());

	}

}

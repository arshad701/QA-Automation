package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.WaitUtils;

public class LinksPage {

	WebDriver driver;
	WaitUtils wait;
	String parentWindow;

	public LinksPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(this.driver);
	}

	public void openDemoQaLinks() {
		driver.get("https://demoqa.com/links");
	}

	public void clickHomeLink() {
		parentWindow = driver.getWindowHandle();
		WebElement homelink = driver.findElement(By.id("simpleLink"));
		wait.scrollAndClick(homelink);

	}
	
	public void switchToNewTab() {
		
		for (String tempWindow : driver.getWindowHandles()) {
			if(!tempWindow.equals(parentWindow)) {
				driver.switchTo().window(tempWindow);
				break;
			}
		}
		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	public void switchBackToParent() {
		driver.switchTo().window(parentWindow);
	}
	
	
	
	
	

}

package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.WaitUtils;

public class FramesPage {

	WebDriver driver;
	WaitUtils wait;

	public FramesPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(this.driver);
	}

	public void openDemoqaFrames() {
		driver.get("https://demoqa.com/frames");
	}

	public String switchToFrame(String frame) {

		driver.switchTo().frame(frame);
		return driver.findElement(By.id("sampleHeading")).getText();

	}

	public void switchToParent() {
		driver.switchTo().defaultContent();
	}

}

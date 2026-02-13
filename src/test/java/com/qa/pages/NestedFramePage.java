package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.WaitUtils;

public class NestedFramePage {

	WebDriver driver;
	WaitUtils wait;

	public NestedFramePage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WaitUtils(this.driver);

	}

	public void openDemoqaNestedFrames() {
		driver.get("https://demoqa.com/nestedframes");
	}

	public void switchToParentFrame() {

		driver.switchTo().frame("frame1");

	}

	public void switchToChildFrame() {

		driver.switchTo().frame(0);

	}

	public String getFrameBodyText() {

		return driver.findElement(By.tagName("body")).getText();

	}

}

package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.WaitUtils;

public class RadioBox {

	WebDriver driver;
	WaitUtils wait;

	public RadioBox(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);
	}
	
	public void openDequoaRadioBox() {
		driver.get("https://demoqa.com/radio-button");

	}

	public void selectRadioBox(String select) {

		WebElement radioButton = wait
				.elementWhenReady(driver.findElement(By.xpath("//label[text()='" + select + "']")));

		wait.scrollAndClick(radioButton);

	}
	
	public String outputValue() {
		
		WebElement outputValue = wait
				.elementWhenReady(driver.findElement(By.xpath("//span[contains(@class,'text-success')]")));
		return outputValue.getText();
		
	}
	

}

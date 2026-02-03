package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.WaitUtils;

public class CheckBoxPage {

	WebDriver driver;
	WaitUtils waitpage;

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
		this.waitpage = new WaitUtils(driver);
	}

	public void openDequoaCheckBox() {
		driver.get("https://demoqa.com/checkbox");

	}

	public void checkBoxExpandAll() {

		WebElement element = waitpage
				.elementWhenReady(driver.findElement(By.cssSelector("button.rct-option.rct-option-expand-all")));
		waitpage.scrollIntoView(element); // scroll first
		waitpage.clickWhenReady(element); // wait until clickable and click

	}

	public void checkBoxCollapseAll() {

		WebElement element = waitpage
				.elementWhenReady(driver.findElement(By.xpath("//button[contains(@class,'rct-option-collapse-all')]")));

		waitpage.scrollIntoView(element); // scroll first
		waitpage.clickWhenReady(element); // wait until clickable and click

	}

	public void selectCheckBox(String CheckBox) {

		// String input = "tree-node-"+CheckBox;

		WebElement element = waitpage.elementWhenReady(
				driver.findElement(By.xpath("//span[text()='" + CheckBox + "']" + "/preceding-sibling::span")

				));

		waitpage.scrollIntoView(element);
		waitpage.clickWhenReady(element);

	}

	public List<String> assertCheckBox() {
		List<WebElement> resultName = driver.findElements(By.xpath("//span[@class = 'text-success']"));
		List<String> TempList = new ArrayList<String>();

		for (WebElement i : resultName) {

			TempList.add(i.getText());

		}
		return TempList;

	}

}

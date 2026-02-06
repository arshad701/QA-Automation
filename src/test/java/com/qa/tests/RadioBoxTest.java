package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.RadioBox;

public class RadioBoxTest extends BaseTest {

	@Test
	public void checkBoxTest() {

		RadioBox rb = new RadioBox(driver);
		rb.openDequoaRadioBox();
		rb.selectRadioBox("Yes");
		Assert.assertTrue(rb.outputValue().contains("Yes"));
		rb.selectRadioBox("Impressive");
		Assert.assertTrue(rb.outputValue().contains("Impressive"));

	}

}

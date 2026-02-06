package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

	
	public void CheckRun() throws InterruptedException {
		CheckBoxPage cb = new CheckBoxPage(driver);
		cb.openDequoaCheckBox();
		cb.checkBoxExpandAll();

		cb.selectCheckBox("Desktop");

		Assert.assertTrue(cb.assertCheckBox().contains("desktop"));

	}

}

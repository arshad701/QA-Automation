package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ButtonsPage;

public class ButtonsTest extends BaseTest {

	
	public void runButtonsTest() {
		
		ButtonsPage bp = new ButtonsPage(driver);
		bp.openButtonURL();
		bp.twoClick();
		Assert.assertTrue(bp.doubleClickResults().contains("double click"));
		bp.rightyClick();
		Assert.assertTrue(bp.rightClickResults().contains("right click"));
		bp.dynamicClick();
		Assert.assertTrue(bp.dynamicClickResults().contains("dynamic click"));
		
		
	}

}

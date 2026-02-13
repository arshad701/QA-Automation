package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.FramesPage;

public class FramesTest extends BaseTest {

	String assertValue;


	public void testFrames() {
		FramesPage fp = new FramesPage(driver);

		fp.openDemoqaFrames();
		assertValue = fp.switchToFrame("frame1");
		Assert.assertTrue(assertValue.contains("This is a sample page"));
		fp.switchToParent();

		assertValue = fp.switchToFrame("frame2");
		Assert.assertTrue(assertValue.contains("This is a sample page"));
		fp.switchToParent();

	}

}

package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.NestedFramePage;

public class NestedFrameTest extends BaseTest {
	
	@Test
	public void testNestedFrames() {
		
		NestedFramePage nf = new NestedFramePage(driver);
		
		nf.openDemoqaNestedFrames();
		
		nf.switchToParentFrame();
		String assertSave = nf.getFrameBodyText();
		Assert.assertTrue(assertSave.contains("Parent"));
		
		
		nf.switchToChildFrame();
		assertSave = nf.getFrameBodyText();
		Assert.assertTrue(assertSave.contains("Child"));
		
		driver.switchTo().defaultContent();
		
		
		
		
	}
	
	

}

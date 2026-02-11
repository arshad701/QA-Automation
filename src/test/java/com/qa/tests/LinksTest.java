package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.LinksPage;

public class LinksTest extends BaseTest {
	
	
	
	
	public void runLinksTest() throws InterruptedException {
		LinksPage lb = new LinksPage(driver);
		lb.openDemoQaLinks();
		lb.clickHomeLink();
		lb.switchToNewTab();
		Thread.sleep(3000);
		Assert.assertTrue(lb.getCurrentUrl().contains("demoqa.com"));
		lb.switchBackToParent();
		Thread.sleep(3000);
		Assert.assertTrue(lb.getCurrentUrl().contains("demoqa.com/links"));
		
		
		
	}

}

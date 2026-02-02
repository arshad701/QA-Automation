package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.TextBoxPage;

import org.testng.Assert;

public class TextBoxTest extends BaseTest {
	
	@Test
	public void Testrun() throws InterruptedException {
		TextBoxPage tb = new TextBoxPage(driver);
		tb.openDequoaTextBox();
		tb.formFill("Arshad Kapadi","arshadtest@gmail.com","Irving Texas","Thane India");
		Assert.assertTrue(tb.assertName().contains("Arshad Kapadi"));
		Thread.sleep(3000);
		

	}

	
	
	

}

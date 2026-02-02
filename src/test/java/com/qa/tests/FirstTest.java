package com.qa.tests;

import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.GoogleHomePage;

public class FirstTest extends BaseTest {

	

	
	public void Testrun() {
		GoogleHomePage gp = new GoogleHomePage(driver);
		gp.testGoogle();
		gp.searchBox("Selenium Automation");
		

	}
}

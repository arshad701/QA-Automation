package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.AlertsPage;

public class AlertBoxTest extends BaseTest {
	
	@Test
	public void alertTest() {
		
		AlertsPage ap = new AlertsPage(driver);
		
		ap.openAlertsPage();
		
		ap.clickBasicAlerts();
		ap.alertClick();
		
		ap.handleTimedAlert();
	
		String Accept = ap.acceptConfirmAlert();
		Assert.assertTrue(Accept.contains("Ok"));
		
		String Reject = ap.rejectConfirmAlert();
		Assert.assertTrue(Reject.contains("Cancel"));
		
		String Test = ap.promtButtonAlert("Arshad");
		Assert.assertTrue(Test.contains("Arshad"));
		
		
		
		
		
	}

}

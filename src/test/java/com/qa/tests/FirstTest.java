package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void testGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Title is" + driver.getTitle());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

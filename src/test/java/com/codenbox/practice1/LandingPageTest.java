package com.codenbox.practice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;


public class LandingPageTest extends Base{
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get("https://codenboxautomationlab.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	@Test
	public void landingPagePracticeLink() throws IOException {
		
		LandingPage l=new LandingPage(driver);
		//l.getPracticeLink().click();
		l.getPracticeLink().sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		driver=null;
	}
	
}

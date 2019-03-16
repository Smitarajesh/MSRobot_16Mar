package com.MsRobot.testNGSelenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.MsRobot.utils.CommonLibrary;

public class BasicDemoSites_TestSuite {
	public WebDriver driver = null;

	@Test
	public void MRTC01() throws InterruptedException
	{
		DemoSitePage.Loginpage(driver);
		CommonLibrary.down(driver);
		
	}
}


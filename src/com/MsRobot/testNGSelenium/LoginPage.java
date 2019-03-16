package com.MsRobot.testNGSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void Login(WebDriver driver) 
	{
		
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); // maximize windows screen
	driver.get("http://msrobotassistant.com/basic-demo-site/");
	//System.out.print(driver.getTitle());

}
}

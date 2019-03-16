package com.MsRobot.testNGSelenium;

import org.openqa.selenium.By;

public class BasicSitePage {
	public static By firstName = By.name("base-fname");
	public static By lastName = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[4]/span/input");
	public static By MaritalStatus = By.xpath("//input[@value='Single']");
	public static By MaritalStatus2 = By.xpath("//input[@value='Married']");
	public static By MaritalStatus3 = By.xpath("//input[@value='Divorced']");
	public static By Hobby = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[1]/input");
	public static By Hobby1 = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[2]/input");		
	public static By Hobby2 = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[3]/input");
	public static By Hobby3 = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[4]/input");
	public static By Country  = By.name("country-name");
	public static By Email = By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/p[5]/label/span/input");
	public static By Phone  = By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[6]/label/span/input");
	public static By Commands = By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(2)");
	public static By Commands2 = By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(3)");
	public static By Commands3 = By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(3)");
	public static By text = By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[9]/label/span/textarea");
	public static By submit = By.xpath("//input[@type='submit']");

}

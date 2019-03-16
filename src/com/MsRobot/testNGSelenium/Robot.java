package com.MsRobot.testNGSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.MsRobot.utils.CommonLibrary;

//import com.MsRobot.utils.CommonLibrary;

public class Robot {
	public WebDriver driver = null;

	@Test
	public void MRTC01() throws InterruptedException
	{
//1. locator to Page OM
		
		LoginPage.Login(driver);
		CommonLibrary.down(driver);		
		driver.findElement(DemoSitePage.userName).sendKeys("test");
		driver.findElement(DemoSitePage.password).sendKeys("Robot2018");
		driver.findElement(DemoSitePage.login).click(); 		
		
		driver.findElement(BasicSitePage.firstName).sendKeys("Tom");
		driver.findElement(BasicSitePage.lastName).sendKeys("Smith");
		driver.findElement(BasicSitePage.MaritalStatus).click();
		driver.findElement(BasicSitePage.Hobby).click();
		driver.findElement(BasicSitePage.Hobby1).click();		
		driver.findElement(BasicSitePage.Hobby2).click();
		driver.findElement(BasicSitePage.Hobby3).click();
		driver.findElement(BasicSitePage.Country).sendKeys("Canada");
		driver.findElement(BasicSitePage.Email).sendKeys("tom.smith@gail.com");
		driver.findElement(BasicSitePage.Phone).sendKeys("4156663232");
		driver.findElement(BasicSitePage.Commands).click();
		driver.findElement(BasicSitePage.text).sendKeys("Hello World, How are you?");
		driver.findElement(BasicSitePage.submit).click();
		 //--------------- scroll-down to the end of page ---------------
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
	   String expectedText = "One or more fields have an error. Please check and try again.";	
       String actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText();
       System.out.println("text1: "+actualText1);
      
        if(expectedText.equals(actualText1)){
        	System.out.println("passed");
        }else{
        	System.out.println("failed");
        }
       //driver.quit();
	}
   /* @Test
	public void MRTC02() throws InterruptedException
	{
    	LoginPage.Login(driver);		
		driver.findElement(DemoSitePage.userName).sendKeys("test");
		driver.findElement(DemoSitePage.password).sendKeys("Robot2018");
		driver.findElement(DemoSitePage.login).click(); 
		
		CommonLibrary.down(driver);
		driver.findElement(BasicSitePage.firstName).sendKeys("1234567");
		driver.findElement(BasicSitePage.lastName).sendKeys("45612300");
		driver.findElement(BasicSitePage.MaritalStatus2).click();
		driver.findElement(BasicSitePage.Hobby1).click();		
		driver.findElement(BasicSitePage.Country).sendKeys("S");
		driver.findElement(BasicSitePage.Email).sendKeys("tom.smith@@gmailcom");
		driver.findElement(BasicSitePage.Phone).sendKeys("12345aacccccc");
		driver.findElement(BasicSitePage.Commands).click();
		driver.findElement(BasicSitePage.text).sendKeys("Hello World, How are you?#$%^^^^^");
		driver.findElement(BasicSitePage.submit).click();
		        
        
		 //--------------- scroll-down to the end of page ---------------
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
	   String expectedText = "One or more fields have an error. Please check and try again.";	
       String actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText();
       System.out.println("text1: "+actualText1);
      
        if(expectedText.equals(actualText1)){
        	System.out.println("passed");
        }else{
        	System.out.println("failed");
        }
	} 

  @Test 
  public void MRTC03() throws InterruptedException { 
	  
	    LoginPage.Login(driver);
		
		driver.findElement(DemoSitePage.userName).sendKeys("test");
		driver.findElement(DemoSitePage.password).sendKeys("Robot2018");
		driver.findElement(DemoSitePage.login).click(); 
		
		CommonLibrary.down(driver);
		driver.findElement(BasicSitePage.firstName).sendKeys("#$%");
		driver.findElement(BasicSitePage.lastName).sendKeys("%^*");
		driver.findElement(BasicSitePage.MaritalStatus3).click();
		driver.findElement(BasicSitePage.Hobby2).click();		
		driver.findElement(BasicSitePage.Country).sendKeys("N");
		driver.findElement(BasicSitePage.Email).sendKeys("tom.smith*gmail.com#");
		driver.findElement(BasicSitePage.Phone).sendKeys("23444433$%$##");
		driver.findElement(BasicSitePage.Commands2).click();
		driver.findElement(BasicSitePage.text).sendKeys("#*()$%^&");
		driver.findElement(BasicSitePage.submit).click();
	  
    //--------------- scroll-down to the end of page ---------------
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
  Thread.sleep(2000);
  
  String expectedText =
  "One or more fields have an error. Please check and try again."; String
  actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText(); 
  System.out.println("text1: "+actualText1);
  
  if(expectedText.equals(actualText1)) {
	  System.out.println("passed"); }
  else{
  System.out.println("failed"); }
  }
  
  @Test 
      public void MRTC04() throws InterruptedException { 
	  
	  LoginPage.Login(driver);
		
		driver.findElement(DemoSitePage.userName).sendKeys("test");
		driver.findElement(DemoSitePage.password).sendKeys("Robot2018");
		driver.findElement(DemoSitePage.login).click(); 
  
		CommonLibrary.down(driver);
		driver.findElement(BasicSitePage.firstName).sendKeys("TomTomTomTomTomTomTomTomTomTomTomaseswes"); 
		driver.findElement(BasicSitePage.lastName).sendKeys("SmithSmithSmithSmithSmithSmithSmithSmith");
		driver.findElement(BasicSitePage.MaritalStatus3).click();
		driver.findElement(BasicSitePage.Hobby2).click(); 
		driver.findElement(BasicSitePage.Country).sendKeys("J");
		driver.findElement(BasicSitePage.Email).sendKeys("Tom5.smith@gmail.comtom5.smith@gmail.com"); 
		driver.findElement(BasicSitePage.Phone).sendKeys("415666323212"); 
		driver.findElement(BasicSitePage.Commands3).click();
		driver.findElement(BasicSitePage.text).sendKeys("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello"); 
		driver.findElement(BasicSitePage.submit).click();
   
  //--------------- scroll-down to the end of page ---------------
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
  Thread.sleep(2000);
  
  String expectedText =
  "One or more fields have an error. Please check and try again."; String
  actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText(); 
  System.out.println("text1: "+actualText1);
  
  if(expectedText.equals(actualText1)){ 
	  System.out.println("passed"); }
  else{
  System.out.println("failed"); }  
  }
  
  @Test
  public void MRTC05() throws InterruptedException { 
      
	  LoginPage.Login(driver);
	  
	  CommonLibrary.down(driver);
	  driver.findElement(BasicSitePage.firstName).sendKeys("TomTomTomTomTomTomTomTomTomTomTomaseswesadadasfasfasfsfsdfs");
	  driver.findElement(BasicSitePage.lastName).sendKeys("SmithSmithSmithSmithSmithSmithSmithSmithsafsfsdfsf");
	  driver.findElement(BasicSitePage.MaritalStatus3).click();
	  driver.findElement(BasicSitePage.Hobby2).click(); 
	  driver.findElement(BasicSitePage.Country).sendKeys("J");
	  driver.findElement(BasicSitePage.Email).sendKeys("Tom5.smith@gmail.commtom5.smith@gmail.comm"); 
	  driver.findElement(BasicSitePage.Phone).sendKeys("0000000000"); 
	  driver.findElement(BasicSitePage.Commands3).click();
	  driver.findElement(BasicSitePage.text).sendKeys("HOW ARE YOU? HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello"); 
	  driver.findElement(BasicSitePage.submit).click();
  
  //--------------- scroll-down to the end of page ---------------
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
  Thread.sleep(2000);
  
  String expectedText ="One or more fields have an error. Please check and try again."; 
  String actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText(); 
  System.out.println("text1: "+actualText1);  
  if(expectedText.equals(actualText1)){ 
	  System.out.println("passed"); }
  else{
  System.out.println("failed"); }
  }*/
  }
  
  
 


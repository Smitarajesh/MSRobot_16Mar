package com.MsRobot.beginnerSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRTC01 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows screen
		driver.get("http://msrobotassistant.com/basic-demo-site/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("user-name")).sendKeys("test");
        driver.findElement(By.name("pass-word")).sendKeys("Robot2018");
        driver.findElement(By.name("pwbtn")).click();
       
        driver.findElement(By.name("base-fname")).sendKeys("Tom");
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[4]/span/input")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@value='Single']")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[4]/input")).click();
        driver.findElement(By.name("country-name")).sendKeys("Canada");
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/p[5]/label/span/input")).sendKeys("tom.smith@gmail.com");
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[6]/label/span/input")).sendKeys("4156663232");  
        driver.findElement(By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(2)")).click();
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[9]/label/span/textarea")).sendKeys("Hello World, How are you?");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       
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
        
        
        
        
        
        
       //String expectedText = "One or more fields have an error. Please check and try again.";
        //--------------- scroll-down to the end of page ---------------
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000); //*
		//------------------------------
        //String actualText1 = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText();
        String actualText = driver.findElement(By.xpath("//*[@id=\"wpcf7-f424-p389-o1\"]/form/div[12]")).getText();
        System.out.println("text1: "+actualText1);
        System.out.println("text2: "+actualText);

        if(expectedText.equals(actualText)){
        	System.out.println("passed");
        }else{
        	System.out.println("failed");
        }
        //driver.close();*// 
	}

}

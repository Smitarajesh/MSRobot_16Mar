package com.MsRobot.beginnerSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRTC02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize windows screen
		driver.get("http://msrobotassistant.com/basic-demo-site/");
        System.out.print(driver.getTitle());
        driver.findElement(By.name("user-name")).sendKeys("test");
        driver.findElement(By.name("pass-word")).sendKeys("Robot2018");
        //Login Click by locator
        //driver.findElement(By.name("pwbtn")).click();
        //Login Click by xpath
        driver.findElement(By.xpath("//*[@id=\'post-101\']/div/div[2]/div/div/div[2]/div/input[3]")).click();
        driver.findElement(By.name("base-fname")).sendKeys("1234567");
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[4]/span/input")).sendKeys("45612300");
        driver.findElement(By.xpath("//input[@value='Married']")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[1]/input")).click();        
        driver.findElement(By.name("country-name")).sendKeys("S");        
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/p[5]/label/span/input")).sendKeys("tom.smith@@gmailcom");        
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[6]/label/span/input")).sendKeys("12345aacccccc");         
        driver.findElement(By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(2)")).click();
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[9]/label/span/textarea")).sendKeys("Hello World, How are you?#$%^^^^^");
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
        //driver.close(); 
	}

}

package com.MsRobot.beginnerSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRTC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikrant\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); //maximize windows screen
        driver.get("http://msrobotassistant.com/basic-demo-site/");
        System.out.print(driver.getTitle());
        driver.findElement(By.name("user-name")).sendKeys("test");
        driver.findElement(By.name("pass-word")).sendKeys("Robot2018");
        //Login Click by locator
        //driver.findElement(By.name("pwbtn")).click();
        //Login Click by xpath
        driver.findElement(By.xpath("//*[@id=\'post-101\']/div/div[2]/div/div/div[2]/div/input[3]")).click();
        driver.findElement(By.name("base-fname")).sendKeys("TomTomTomTomTomTomTomTomTomTomTomaseswesadadasfasfasfsfsdfs");
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[4]/span/input")).sendKeys("SmithSmithSmithSmithSmithSmithSmithSmithsafsfsdfsf");
        driver.findElement(By.xpath("//input[@value='Divorced']")).click();
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/div[10]/span/span/span[2]/input")).click();
        driver.findElement(By.name("country-name")).sendKeys("J");
        driver.findElement(By.xpath("//*[@id=\'wpcf7-f424-p389-o1\']/form/p[5]/label/span/input")).sendKeys("Tom5.smith@gmail.commtom5.smith@gmail.comm");
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[6]/label/span/input")).sendKeys("0000000000");  
        driver.findElement(By.cssSelector("#wpcf7-f424-p389-o1 > form > p:nth-child(19) > span > select > option:nth-child(3)")).click();
        driver.findElement(By.xpath("//*[@id='wpcf7-f424-p389-o1']/form/p[9]/label/span/textarea")).sendKeys("HOW ARE YOU? HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        //driver.close(); 



	}

}

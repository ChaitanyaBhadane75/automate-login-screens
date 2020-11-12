package qspidernotebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    //Email writen
	    driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("**********");
	    Thread.sleep(2000);

	    //Password
	    WebElement pwdtb = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    pwdtb.sendKeys("*********");
	    
	    Thread.sleep(1000);
	    //Password Box CLear
	    pwdtb.clear();
	    Thread.sleep(2000);

	    //SEnd value to the password Box
	    pwdtb.sendKeys("*******");
	    //Click on forgotten link
	   // driver.findElement(By.ByXPath.linkText("Forgotten password?")).click();
	    
	    Thread.sleep(2000);
	    
	    //Back page
	    //driver.navigate().back();
	    //write password
	    
	    //driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("**********");
	     
	    Thread.sleep(1000);

	    driver.findElement(By.id("u_0_b")).click();
	    Thread.sleep(2000);
	
	}

}

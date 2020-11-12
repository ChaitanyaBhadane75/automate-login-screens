package qspidernotebook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitprogram {

	public static void main(String[] args)  throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://login.yahoo.com/");
	    driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	    
	    Thread.sleep(2000);
	    
	    
	}

}

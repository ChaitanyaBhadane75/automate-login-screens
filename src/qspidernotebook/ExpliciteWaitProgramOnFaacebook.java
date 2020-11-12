package qspidernotebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitProgramOnFaacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	     
	    driver.get("https://www.facebook.com/r.php");
	   
	    Thread.sleep(3000);
	    
	    WebElement firstname = driver.findElement(By.xpath("//input[@id='u_0_n']"));

	    WebElement surname = driver.findElement(By.xpath("//input[@id='u_0_p']"));

	    WebElement datapolicy = driver.findElement(By.xpath("//*[@id='privacy-link']"));

	    sendKeys(driver, firstname, 10, "Chaitanya");
	    sendKeys(driver, surname , 10, "Chaitanya");
	    clickon(driver, datapolicy, 10);
	}

	public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickon(WebDriver driver1, WebElement element, int timeout) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();

}
}
package qspidernotebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:\\Users\\Admin\\Desktop\\Demo1.html");
		
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("i")).click();
		driver.findElement(By.name("n")).click();
		driver.findElement(By.className("c")).click();
		driver.findElement(By.linkText("Google")).click();
		
		
		
		
	}

}

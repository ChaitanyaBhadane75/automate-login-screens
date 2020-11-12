package slecinymgmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	
	String ps = driver.getPageSource();
	System.out.println(ps);
	
	System.out.println("driver.getTitle");
	
	Thread.sleep(2000);
	
	Dimension d = new Dimension(200,200);
	driver.manage().window().setSize(d);
	
	Thread.sleep(2000);
	
	Point p =new Point(200,200);
	
	driver.manage().window().setPosition(p);
	
	driver.close();
	
	
	
	
	}

}

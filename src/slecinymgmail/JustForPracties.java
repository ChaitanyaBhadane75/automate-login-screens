package slecinymgmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustForPracties {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#endpoint > paper-item")).click();//sendKeys("WarFullMovie");
			//driver.findElement(By.ByTagName.cssSelector("#search-icon-legacy")).click();

	}

}

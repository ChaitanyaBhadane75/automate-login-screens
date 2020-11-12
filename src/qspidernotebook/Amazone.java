package qspidernotebook;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazone {
	    

		public static void main(String[] args) {
			
			Logger log =Logger.getLogger("Amazone");
			PropertyConfigurator.configure("Log4j.properties");
			
		 
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\selenium-java-3.141.59\\chromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			log.info("open URL");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			log.info("maximize web page");
			
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Honor 20i");
			
			log.info("CLick search bar and search Honor 20i");
			
			driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
			
			log.info("searching");
			
			//driver.findElement(By.className("s-image")).click();
		
			log.info("click on horor 20i link");
			}
			
			
		}
	


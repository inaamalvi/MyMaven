package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Webdriver {
	
	public WebDriver driver;
	String baseUrl  = "https://ittoptalent.com";
	
	@BeforeTest
	public void openBrowser() {
		 String exePath = "D:\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 options.addArguments("--incognito");
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.get(baseUrl);
	}
	

}

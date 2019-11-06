import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public static void test1() throws InterruptedException {
	    String exePath = "D:\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		driver.get("https://ittoptalent.com");
		Thread.sleep(1000);
		int t = add2no();
		System.out.println("this is the result "+t);
		driver.quit();
		
		
		
		
	}
	
	@Test(priority = 1)
	public void myfunction1 () {
		System.out.println("I am iin myfunction 1");
	}
	
	
	@Test(enabled = false)
	public void nfunction2() {
		System.out.println("you are in in myfunction 2");
	}
	
	private static int add2no() {
		
		WebDriver driver=this.driver;
		
		// TODO Auto-generated method stub
		Reporter.log("I am in add function");
		int a = 2;
		int b = 4;
		int c = a+b;
		return c;
		
		
	}

}

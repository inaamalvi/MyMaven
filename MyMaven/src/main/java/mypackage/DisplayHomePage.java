package mypackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DisplayHomePage extends Webdriver{

	@SuppressWarnings("unused")
	@Test (priority=0)
	public void displayLink() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		boolean isPresent = driver.findElements(By.xpath("//a[text()='Contact Us']")).size() > 0;
		{
			System.out.println(" xpath found...................");
			driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
			
		}
		System.out.println(" class not found");
		
		
	
	}
}

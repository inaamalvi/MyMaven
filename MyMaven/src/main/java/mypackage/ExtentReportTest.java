package mypackage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest {
	
	@Test
	public void runtest() throws IOException {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/extentreport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("Test1");
		logger.log(Status.INFO, "I am testing this");
		extent.flush();
		
		System.out.println("I am here in test ");
		
		ExtentTest logger2 = extent.createTest("Test2");
		//logger2.log(Status.FAIL, MediaEntityBuilder.creatScreenCaptureFromPath("D:\\ITTOPTALENT\\UserImages").build());
		logger2.addScreenCaptureFromPath("D:\\ITTOPTALENT\\UserImages\\b5.jpg");
		
		
	}

}

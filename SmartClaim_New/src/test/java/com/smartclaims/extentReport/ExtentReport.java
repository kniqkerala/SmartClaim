package com.smartclaims.extentReport;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;


	@BeforeTest
	public void beforeTest()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") +"/test-output/extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("User Name", "Kennedys QA");	    
	    spark.config().setDocumentTitle("Extent report");
	    spark.config().setReportName("Final Report");
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
	    if(result.getStatus() == ITestResult.FAILURE)
	    {
	        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	        test.fail(result.getThrowable());
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	    }
	    else
	    {
	        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        test.skip(result.getThrowable());
	    }
	}

	@AfterSuite
	public void tearDownExtent(){
	    extent.flush();
	   }
}

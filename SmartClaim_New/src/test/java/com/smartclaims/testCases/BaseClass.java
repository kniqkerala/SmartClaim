package com.smartclaims.testCases;


import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.smartclaim.utilities.ReadConfig;
import com.smartclaim.utilities.ScreenShots;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends ScreenShots{

	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
	public static WebDriver driver;

	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest logger;

	//All the common things used by all the test cases will be inside the base class

	//All the pre-requisites will be in setup method

	@BeforeClass
	public void setup()

	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@BeforeTest
	public void beforeTest()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") +"/Report/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Kennedys QA");	    
		spark.config().setDocumentTitle("Extent report");
		spark.config().setReportName("Final Report");
	}

	@AfterMethod
	public void getResult(ITestResult result) throws Exception
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			String temp = ScreenShots.getScreenshot(driver,result.getName());

			logger.log(Status.FAIL, MarkupHelper.createLabel(
					result.getMethod().getMethodName() + " Test case FAILED due to below issues:", ExtentColor.RED));
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

		}

		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
			logger.skip(result.getThrowable());
		}
	}		




	@AfterSuite
	public void tearDownExtent(){
		extent.flush();
	}

	@AfterClass
	public void tearDown()

	{
		//driver.quit();
		//driver.close();

	}
}

package com.smartclaims.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.smartclaims.extentReport.ExtentReport;
import com.smartclaims.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{


	@Test
	public void loginTest()	

	{
		logger=extent.createTest("TC_001: Verifying whether Kcg login page loaded");
		logger.log(Status.INFO, "Trying to open Kcg login page for Smartclaim portal");
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
		//Verifying if Kcglogin page loaded successfully
		if (driver.getTitle().equalsIgnoreCase("Kcg"))
		{
			logger.log(Status.PASS, "Kcg login page opened succesfully");
		}
		else
		{
			logger.log(Status.FAIL, "Some issue with loading Kcg");
		}
		
		logger=extent.createTest("TC_002: Valid User Login"); 
		//Create an object for login page in the "pageObjects" package to access the elements
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();		
		//Verifying whether logged in successfully 
		if(driver.getTitle().equals("SmartClaim"))

		{
			Assert.assertTrue(true);
			logger.log(Status.PASS, "Logged in succesfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.log(Status.FAIL, "Some issue with loging in");
		}


	}

}

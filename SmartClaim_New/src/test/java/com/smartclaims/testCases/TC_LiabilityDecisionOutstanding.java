package com.smartclaims.testCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.LiabilityDecisionOutstandingPage;
import com.smartclaims.pageObjects.LoginPage;
import junit.framework.Assert;

public class TC_LiabilityDecisionOutstanding extends BaseClass {

	@Test(priority=1,dataProvider="ClaimDetails")
	public void liabilityDecisionOutstanding(String claimdate,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Liability Admitted Claim");
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("SCAXAPP.Super@kennedysiq.com");
		lp.setPassword("Test123456!");
		lp.clickSubmit();
		Thread.sleep(5000);
		logger.log(Status.INFO, "Logged into smart claim");
		//Add a new claim
		AddClaimPage ac= new AddClaimPage(driver);
		ac.clickAddClaim();
		logger.log(Status.INFO, "Clicked on the add claim button");
		//Checking whether the add claim page opened
		String headerText = ac.getAddClaimHeader();
		if(headerText.contains("Add claim details"))
		{
			//Adding claim details

			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String currentDate = formatter.format(date);

			//ac.setClaimDate(claimdate);
			ac.setClaimDate(currentDate);
			//ac.setAppId(appid);
			ac.setDefendantName(defname);
			ac.setClaimantName(Cname);
			ac.setClaimantSolicitor(csname);
			ac.setReferenceNumber(refno);
			Thread.sleep(3000);
			ac.setCustomField(currentDate);
			logger.log(Status.INFO, "Added claim details");
			//Save the claim
			ac.saveClaim();
			logger.log(Status.INFO, "Saving the claim");
			Thread.sleep(3000);
			//Checking whether the claim added successfully and navigated to claim facts pages
			String claimfactsHeader=ac.getClaimFactsHeader();
			Boolean successmsg= ac.getAddClaimSuccessMsg();
			if(claimfactsHeader.contains("CLAIM FACTS") && successmsg)
			{
				logger.log(Status.INFO, "Claim created successfully");
				//Adding claim info
				LiabilityDecisionOutstandingPage lD = new  LiabilityDecisionOutstandingPage(driver);
				//QN1
				lD.swiperBtn().click();
				Thread.sleep(3000);	
				//QN2
				lD.awareOfSTYes().click();
				Thread.sleep(3000);	
				//QN3
				lD.SThappenTimeYes().click();
				Thread.sleep(3000);	
				//QN4
				lD.swiperBtn().click();
				Thread.sleep(3000);	
				//QN5
				lD.WasWorkingYes().click();
				Thread.sleep(3000);	
				//QN6
				lD.taskAllotedYes().click();
				Thread.sleep(3000);	
								
				//QN7
				lD.anyVulnerconditionsUK().click();
				Thread.sleep(3000);	
				//QN8
							
				lD.workUntilEndShiftYes().click();
				Thread.sleep(3000);
				//QN9
				
				lD.businessOwnLocYes().click();
				Thread.sleep(3000);
				//QN10
				lD.incOwnPremiseYes().click();
				Thread.sleep(3000);
				//QN11
				lD.thirdPartyRunningNo().click();
				Thread.sleep(3000);
				//QN12
				lD.PAYE_Yes().click();
				Thread.sleep(3000);
				//QN13
				lD.swiperBtn().click();
				Thread.sleep(3000);	
				//QN154
				//File upload
				lD.swiperBtn().click();
				Thread.sleep(3000);	
				//QN15
				//File upload				
				lD.swiperBtn().click();
				Thread.sleep(3000);
				//Saving Claim
				lD.claimSaveButton().click();
				Thread.sleep(7000);
				
				if(lD.summaryScreenDisp().isDisplayed())
				{
					logger.log(Status.INFO, "Navigated to the summary view page");
				}

				else {

					logger.log(Status.FAIL, "Some issue in loading summary page");
				}

				//Verifying Liability admitted final output
				if(lD.finalOutputLDO().isDisplayed()) {				
					Assert.assertTrue(true);
					logger.log(Status.PASS, "Got the output as 'Liablity Admitted'");
				}

				else {					
					Assert.assertTrue(false);
					logger.log(Status.FAIL, "Output is incorrect");
				}	
			}
			
			else
			{
				Assert.assertTrue(false);
				logger.log(Status.FAIL, "Some issue with adding a new claim");
			}

		}
	}


	@DataProvider(name="ClaimDetails")

	String [][] getData() throws Exception
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/Testdata.xlsx";
		//Getting row and coloumn count from the excel file
		int rownum = XLUtils.getRowCount(path, "LiaDecOutstanding");	
		int cocount= XLUtils.getCellCount(path, "LiaDecOutstanding", rownum);
		//Creating an array to store values
		String claimData[][] = new String[rownum][cocount];
		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				claimData[i-1][j] = XLUtils.getCellData(path, "LiaDecOutstanding", i, j);
			}

		}

		return claimData;
	}



	@AfterTest

	public void tearDown() {

		driver.quit();
	}


}
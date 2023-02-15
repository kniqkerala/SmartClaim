package com.smartclaims.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.DropClaimPage;
import com.smartclaims.pageObjects.LoginPage;

public class TC_DropClaim extends BaseClass
{
	@Test(priority=1,dataProvider="DropUnknown")
	public void dropClaim_unknown(String claimdate,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Drop claim with unknown as input");
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Staging.User1@SMARTC.com");
		lp.setPassword("Test123456!");
		lp.clickSubmit();
		Thread.sleep(3000);
		//Add a new claim
		AddClaimPage ac= new AddClaimPage(driver);
		ac.clickAddClaim();
		logger.log(Status.INFO, "Clicked on the add claim button");
		//Checking whether the add claim page opened
		String headerText = ac.getAddClaimHeader();
		if(headerText.contains("Add claim details"))
		{
			//Adding claim details
			ac.setClaimDate(claimdate);
			ac.setDefendantName(defname);
			ac.setClaimantName(Cname);
			ac.setClaimantSolicitor(csname);
			ac.setReferenceNumber(refno);
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
				DropClaimPage DC = new DropClaimPage(driver);
				logger.log(Status.INFO, "Adding claim facts");
				//Q1
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q2
				DC.selectAwareofSlipTrip();	
				Thread.sleep(2000);
				//Q3
				DC.selectWasClaimantWorking();
				Thread.sleep(2000);
				//Q4
				DC.selectBusinessOwnLocation();
				Thread.sleep(2000);
				//Q5					
				DC.selectBusinessOwnPremise();
				Thread.sleep(2000);
				//Q6
				DC.selectBusinessOccupyPremise();
				Thread.sleep(2000);
				//Q7
				DC.selectClaimantEmployedByOrg();
				Thread.sleep(2000);
				//Q8
				DC.selectClaimantContractedByOrg();
				Thread.sleep(2000);
				//Q9
				DC.selectAnythingOnFloor();
				Thread.sleep(2000);
				//Q10
				DC.selectSufficientLighting();
				Thread.sleep(2000);
				//Q11
				DC.selectHandrailAvailable();
				Thread.sleep(2000);
				//Q12
				DC.selectSafetyNotices();
				Thread.sleep(2000);
				//Q13
				DC.selectSafetyPolicy();
				Thread.sleep(2000);
				//Q14
				DC.selectRegCheckLocation();
				Thread.sleep(2000);
				//Q15
				DC.selectBusinessResLocClean();
				Thread.sleep(2000);
				//Q16
				DC.selectProtectiveEqu();
				Thread.sleep(2000);
				//Q17
				DC.selectProvideTraining();
				Thread.sleep(2000);
				//Q18
				DC.selectChangeProcedure();
				Thread.sleep(2000);
				//Q19
				DC.selectSimilarIncidents();
				Thread.sleep(2000);
				//Q20
				DC.selectPersonSeeIncident();
				Thread.sleep(2000);
				//Q21
				DC.selectContributeToInjury();
				Thread.sleep(2000);
				//Q22
				DC.selectClaimantFollowProcedure();
				Thread.sleep(2000);
				//Q23
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q24
				DC.selectMedicalAttention();
				Thread.sleep(2000);
				//Q25
				DC.selectHowSeriousInjury();
				Thread.sleep(2000);
				//Q26	
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q27
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				logger.log(Status.INFO, "Saving Claim facts");
				DC.saveClaim();
				Thread.sleep(4000);
				DC.verifySummaryView();
				logger.log(Status.INFO, "Navigated to the summary view page");
				Thread.sleep(4000);
				Boolean indicatorMsg= DC.getLiabilityIndicator();
				if(indicatorMsg)
				{
					Assert.assertTrue(true);
					logger.log(Status.PASS, "Got the output as 'Drop Claim'");
				}
				else
				{
					Assert.assertTrue(false);
					logger.log(Status.FAIL, "Some issue with drop claim");
				}
			}
			else
			{
				Assert.assertTrue(false);
				logger.log(Status.FAIL, "Some issue with adding a new claim");
			}
		}
		else
		{
			Assert.assertTrue(false);
			logger.log(Status.FAIL, "Some issue with navigating to add claim page");
		}
	}
	@Test(priority=2,dataProvider="DropSkip")
	public void dropClaim_skip(String claimdate, String appid,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Drop claim with skipping some questions");
		//Mouse hover profile 
		driver.findElement(By.xpath ("//*[@id=\"rightNavSection\"]/k-header-right-section/button")).click();
		Thread.sleep(5000);	
		//Select logout
		driver.findElement(By.xpath("//*[@id=\"pop-user-options\"]/div/div")).click();
		Thread.sleep(3000);
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Staging.User1@SMARTC.com");
		lp.setPassword("Test123456!");
		lp.clickSubmit();
		Thread.sleep(3000);
		//Add a new claim
		AddClaimPage ac= new AddClaimPage(driver);
		ac.clickAddClaim();
		logger.log(Status.INFO, "Clicked on the add claim button");
		//Checking whether the add claim page opened
		String headerText = ac.getAddClaimHeader();
		if(headerText.contains("Add claim details"))
		{
			//Adding claim details
			ac.setClaimDate(claimdate);
			ac.setDefendantName(defname);
			ac.setClaimantName(Cname);
			ac.setClaimantSolicitor(csname);
			ac.setReferenceNumber(refno);
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
				DropClaimPage DC = new DropClaimPage(driver);
				logger.log(Status.INFO, "Adding claim facts");
				//Q1
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q2
				DC.selectAwareofSlipTrip();	
				Thread.sleep(2000);
				//Q3
				DC.selectWasClaimantWorking();
				Thread.sleep(2000);
				//Q4
				DC.selectBusinessOwnLocation();
				Thread.sleep(2000);
				//Q5					
				DC.selectBusinessOwnPremise();
				Thread.sleep(2000);
				//Q6
				DC.selectBusinessOccupyPremise();
				Thread.sleep(2000);
				//Q7
				DC.selectClaimantEmployedByOrg();
				Thread.sleep(2000);
				//Q8
				DC.selectClaimantContractedByOrg();
				Thread.sleep(2000);
				//Q9
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q10
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q11
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q12
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q13
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q14
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q15
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q16
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q17
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q18
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q19
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q20
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q21
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q22
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q23
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q24
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q25
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q26	
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				//Q27
				DC.navigateClaimFacts();
				Thread.sleep(2000);
				logger.log(Status.INFO, "Saving Claim facts");
				DC.saveClaim();
				Thread.sleep(4000);
				DC.verifySummaryView();
				logger.log(Status.INFO, "Navigated to the summary view page");
				Thread.sleep(4000);
				Boolean indicatorMsg= DC.getLiabilityIndicator();
				if(indicatorMsg)
				{
					Assert.assertTrue(true);
					logger.log(Status.PASS, "Got the output as 'Drop Claim'");
				}
				else
				{
					Assert.assertTrue(false);
					logger.log(Status.FAIL, "Some issue with drop claim");
				}
			}
			else
			{
				Assert.assertTrue(false);
				logger.log(Status.FAIL, "Some issue with adding a new claim");
			}
		}
		else
		{
			Assert.assertTrue(false);
			logger.log(Status.FAIL, "Some issue with navigating to add claim page");
		}
	}
	@DataProvider(name="DropUnknown")
	String [][] getData1() throws IOException
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/Testdata.xlsx";

		//Getting row and coloumn count from the excel file
		//int rownum = XLUtils.getRowCount(path, "DropClaim");
		int rownum=1,i=0;
		int cocount= XLUtils.getCellCount(path, "DropClaim", rownum);

		//Creating an array to store values
		String claimData[][] = new String[1][cocount];

		
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
			claimData[i][j] = XLUtils.getCellData(path, "DropClaim", rownum, j);
			}

		

		return claimData;
	}
	@DataProvider(name="DropSkip")
	String [][] getData2() throws IOException
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/Testdata.xlsx";

		//Getting row and coloumn count from the excel file
		//int rownum = XLUtils.getRowCount(path, "DropClaim");
		int rownum=2,i=0;
		int cocount= XLUtils.getCellCount(path, "DropClaim", rownum);

		//Creating an array to store values
		String claimData[][] = new String[1][cocount];

		
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
			claimData[i][j] = XLUtils.getCellData(path, "DropClaim", rownum, j);
			}

		

		return claimData;
	}
}

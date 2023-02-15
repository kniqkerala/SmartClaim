package com.smartclaims.testCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.LoginPage;
import com.smartclaims.pageObjects.NoLiabilityPage;

public class TC_NoLiability extends BaseClass
{
	@Test(priority=1,dataProvider="ClaimDetails")
	public void addClaimFacts(String claimdate,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("No Liability Claim");
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("SCAXAPP.Super@kennedysiq.com");
		lp.setPassword("Test12345!");
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
				NoLiabilityPage NL = new NoLiabilityPage(driver);
				//Filling the claim facts to get no liability output
				logger.log(Status.INFO, "Adding claim facts");
				//Q1
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q2
				NL.selectAwareofSlipTrip();
				Thread.sleep(2000);
				//Q3
				NL.selectSlipTripAt();		
				Thread.sleep(2000);
				//Q4
				NL.selectIncidentReport();
				Thread.sleep(2000);
				//Q5
				NL.setIncidentDesc("testing");
				Thread.sleep(4000);
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q6
				NL.selectWasClaimantWorking();
				Thread.sleep(2000);
				//Q7
				NL.selectWasTaskAllocated();
				Thread.sleep(2000);
				//Q8
				NL.selectMentionedVulnerabilities();
				Thread.sleep(2000);
				//Q9
				NL.selectWorkingEndShift();
				Thread.sleep(2000);
				//Q10
				NL.selectBusinessOwnLocation();
				Thread.sleep(2000);
				//Q11
				NL.selectBusinessOwnPremise();
				Thread.sleep(2000);
				//Q12
				NL.selectThirdpartyRunningLocation();
				Thread.sleep(2000);
				//Q13
				NL.selectClaimantEmployedByOrg();
				Thread.sleep(2000);
				//Q14
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q15
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q16
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q17
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q18
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q19
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q20
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q21
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				
				//Q22
				NL.selectAnythingOnFloor();
				Thread.sleep(2000);
				//Q23
				NL.selectSufficientLighting();
				Thread.sleep(2000);
				//Q24
				NL.selectHandrailAvailable();
				Thread.sleep(2000);
				//Q25
				NL.selectSafetyNotices();
				Thread.sleep(2000);
				//Q26
				NL.setWarningNotice("test");
				Thread.sleep(4000);
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q27
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q28
				NL.selectSafetyPolicy();
				Thread.sleep(2000);
				//Q29
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q30
				NL.selectRiskAssessComplete();
				Thread.sleep(2000);
				//Q31
				NL.selectRegCheckLocation();
				Thread.sleep(2000);
				//Q32
				NL.selectEvidenceRegCheck();
				Thread.sleep(2000);
				//Q33
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q34
				NL.selectLocCheckFrequency();
				Thread.sleep(2000);
				//Q35
				NL.selectBusinessResLocClean();
				Thread.sleep(2000);
				//Q36
				NL.selectLocRegCleaned();
				Thread.sleep(2000);
				//Q37
				NL.selectRecOfCleaning();
				Thread.sleep(2000);
				//Q38
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q39
				NL.selectsomebodyCleaningProcess();
				Thread.sleep(2000);
				//Q40
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q41
				NL.selectFrequencyLocClean();
				Thread.sleep(2000);
				//Q42
				NL.selectWetMopping();
				Thread.sleep(2000);
				//Q43
				NL.selectFloorLeftDry();
				Thread.sleep(4000);
				//Q44
				NL.selectWetFloorSign();
				Thread.sleep(4000);
				//Q45
				NL.selectProtectiveEqu();
				Thread.sleep(2000);
				//Q46
				NL.selectProvideTraining();
				Thread.sleep(2000);
				//Q47
				NL.selectChangeProcedure();
				Thread.sleep(2000);
				//Q48
				NL.selectSimilarIncidents();
				Thread.sleep(2000);
				//Q49
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q50
				NL.selectImmediateAction();
				Thread.sleep(2000);
				//Q51
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q52
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q53
				NL.selectPersonSeeIncident();
				Thread.sleep(2000);
				//Q54
				NL.selectContributeToInjury();
				Thread.sleep(2000);
				//Q55
				NL.selectHowDidContribute();
				Thread.sleep(2000);
				//Q56
				NL.selectClaimantFollowProcedure();
				Thread.sleep(2000);
				//Q57
				NL.selectIncidentReported();
				Thread.sleep(2000);
				//Q58
				NL.selectVisibleSignInjury();
				Thread.sleep(2000);
				//Q59
				NL.navigateClaimFacts();
				Thread.sleep(2000);
				//Q60
				NL.selectMedicalAttention();
				Thread.sleep(2000);
				//Q61
				NL.selectHowSeriousInjury();
				Thread.sleep(2000);
				/*
				//Q55
				NL.uploadPolicyWordDoc();
				Thread.sleep(4000);	
				//Q56
				NL.navigateClaimFacts();
				Thread.sleep(2000);	
				//Q57
				NL.navigateClaimFacts();
				Thread.sleep(4000); */
				logger.log(Status.INFO, "Saving Claim facts");
				NL.saveClaim();
				Thread.sleep(4000);
				NL.verifySummaryView();
			    logger.log(Status.INFO, "Navigated to the summary view page");
			    Thread.sleep(4000);
			    Boolean indicatorMsg= NL.getLiabilityIndicator();
				if(indicatorMsg)
				{
					Assert.assertTrue(true);
					logger.log(Status.PASS, "Got the output as 'No Liability'");
				}
				else
				{
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
		else
		{
			Assert.assertTrue(false);
			logger.log(Status.FAIL, "Some issue with navigating to add claim page");
		}
	}
	@DataProvider(name="ClaimDetails")
	String [][] getData() throws Exception
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/Testdata.xlsx";
		//Getting row and coloumn count from the excel file
		int rownum = XLUtils.getRowCount(path, "NoLiability");	
		int cocount= XLUtils.getCellCount(path, "NoLiability", rownum);
		//Creating an array to store values
		String claimData[][] = new String[rownum][cocount];
		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				claimData[i-1][j] = XLUtils.getCellData(path, "NoLiability", i, j);
			}

		}

		return claimData;
	}
}
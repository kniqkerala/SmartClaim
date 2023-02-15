package com.smartclaims.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.LiabilityWithConNegPage;
import com.smartclaims.pageObjects.LoginPage;
import com.smartclaims.pageObjects.NoLiabilityPage;

public class TC_LiabilityConNeg extends BaseClass
{
	@Test(priority=1,dataProvider="ClaimDetails")
	public void addClaimFacts(String claimdate,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Liability - with con neg");
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Staging.User1@SMARTC.com");
		lp.setPassword("Test123456!");
		lp.clickSubmit();
		Thread.sleep(3000);
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
				LiabilityWithConNegPage LCN = new LiabilityWithConNegPage(driver);
				//Filling the claim facts to get liability with con neg output
				logger.log(Status.INFO, "Adding claim facts");
				//Q1
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q2
				LCN.selectAwareofSlipTrip();
				Thread.sleep(2000);
				//Q3
				LCN.selectSlipTripAt();		
				Thread.sleep(2000);
				//Q4
				LCN.selectIncidentReport();
				Thread.sleep(2000);
				//Q5
				LCN.setIncidentDesc("testing");
				Thread.sleep(4000);
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q6
				LCN.selectWasClaimantWorking();
				Thread.sleep(2000);
				//Q7
				LCN.selectWasTaskAllocated();
				Thread.sleep(2000);
				//Q8
				LCN.selectMentionedVulnerabilities();
				Thread.sleep(2000);
				//Q9
				LCN.setVulnerabilityDesc("Test");
				Thread.sleep(2000);
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q10
				LCN.selectWorkingEndShift();
				Thread.sleep(2000);
				//Q11
				LCN.selectBusinessOwnLocation();
				Thread.sleep(2000);
				//Q12
				LCN.selectBusinessOwnPremise();
				Thread.sleep(2000);
				//Q13
				LCN.selectThirdpartyRunningLocation();
				Thread.sleep(2000);
				//Q14
				LCN.selectClaimantEmployedByOrg();
				Thread.sleep(2000);
				//Q15
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q16
				LCN.selectAnythingOnFloor();
				Thread.sleep(2000);
				//Q17
				LCN.selectTypeOfHazard();
				Thread.sleep(4000);
				//Q18
				LCN.selectPoorDrainage();
				Thread.sleep(2000);
				//Q19
				LCN.selectMattingSystem();
				Thread.sleep(2000);
				//Q20
				LCN.selectWhomadeHazard();
				Thread.sleep(2000);
				//Q21
				LCN.selectHazardCausedSlip();
				Thread.sleep(2000);
				//Q22
				LCN.selectKnowAboutHazard();
				Thread.sleep(2000);
				//Q23
				LCN.selectSufficientLighting();
				Thread.sleep(2000);
				//Q24
				LCN.selectHandrailAvailable();
				Thread.sleep(2000);
				//Q25
				LCN.selectSafetyNotices();
				Thread.sleep(2000);
				//Q26
				LCN.selectRiskAssessComplete();
				Thread.sleep(2000);
				//Q27
				LCN.selectRegCheckLocation();
				Thread.sleep(2000);
				//Q28
				LCN.selectBusinessResLocClean();
				Thread.sleep(2000);
				//Q29
				LCN.selectLocRegCleaned();
				Thread.sleep(2000);
				//Q30
				LCN.selectProtectiveEqu();
				Thread.sleep(2000);
				//Q31
				LCN.selectProvideTraining();
				Thread.sleep(2000);
				//Q32
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q33
				LCN.selectRecoedOfTraining();
				Thread.sleep(2000);
				//Q34
				LCN.selectWitnessTraining();
				Thread.sleep(2000);
				//Q35
				LCN.selectChangeProcedure();
				Thread.sleep(2000);
				//Q36
				LCN.selectSimilarIncidents();
				Thread.sleep(2000);
				//Q37
				LCN.selectPersonSeeIncident();
				Thread.sleep(2000);
				//Q38
				LCN.selectContributeToInjury();
				Thread.sleep(2000);
				//Q39
				LCN.selectHowDidContribute();
				Thread.sleep(2000);
				//Q40
				LCN.selectClaimantFollowProcedure();
				Thread.sleep(2000);
				//Q41
				LCN.selectIncidentReported();
				Thread.sleep(2000);
				//Q42
				LCN.selectVisibleSignInjury();
				Thread.sleep(2000);
				//Q43
				LCN.setInjuryReported("Injury");
				Thread.sleep(4000);
				LCN.navigateClaimFacts();
				Thread.sleep(2000);
				//Q44
				LCN.selectMedicalAttention();
				Thread.sleep(2000);
				//Q45
				LCN.selectHowSeriousInjury();
				Thread.sleep(2000);
				//Q46
				LCN.uploadPolicyWordDoc();
				Thread.sleep(4000);	
				LCN.navigateClaimFacts();
				Thread.sleep(2000);	
				//Q47
				LCN.uploadPolicyScheduleDoc();
				Thread.sleep(4000);
				LCN.navigateClaimFacts();
				Thread.sleep(2000);	
				logger.log(Status.INFO, "Saving Claim facts");
				LCN.saveClaim();
				Thread.sleep(4000);
				LCN.verifySummaryView();
			    logger.log(Status.INFO, "Navigated to the summary view page");
			    Thread.sleep(4000);
			    Boolean indicatorMsg= LCN.getLiabilityIndicator();
				if(indicatorMsg)
				{
					Assert.assertTrue(true);
					logger.log(Status.PASS, "Got the output as 'Insured has liability - with con neg'");
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
			int rownum = XLUtils.getRowCount(path, "LiabilityConNeg");	
			int cocount= XLUtils.getCellCount(path, "LiabilityConNeg", rownum);
			//Creating an array to store values
			String claimData[][] = new String[rownum][cocount];
			for(int i=1;i<=rownum;i++) //Number of rows
			{
				for(int j=0;j<cocount;j++) //Number of columns
				{
					// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
					//All the files in the excel file will be copied to array after the for loop completes
					claimData[i-1][j] = XLUtils.getCellData(path, "LiabilityConNeg", i, j);
				}

			}

			return claimData;
		}
	}


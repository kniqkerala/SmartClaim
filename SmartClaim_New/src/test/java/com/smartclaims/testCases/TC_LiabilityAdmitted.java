package com.smartclaims.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.LiabilityAdmittedPage;
import com.smartclaims.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LiabilityAdmitted extends BaseClass {

	@Test(priority=1,dataProvider="ClaimDetails")
	public void liabilityAdmitted(String claimdate,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Liability Admitted Claim");
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
				//Adding claim info
				LiabilityAdmittedPage lA = new  LiabilityAdmittedPage(driver);
				//QN1
				lA.swiperBtn().click();
				Thread.sleep(5000);				
				//QN2
				lA.awareOfStRdBtn().click();
				Thread.sleep(3000);	
				//QN3
				lA.didSThpnTimeRdBtn().click();
				Thread.sleep(3000);
				//QN4Skip
				lA.swiperBtn().click();
				Thread.sleep(3000);		
				//QN5
				lA.wasClmntWrkngRdBtn().click();
				Thread.sleep(3000);	
				//QN6
				lA.taskAllottedRdBtn().click();
				Thread.sleep(3000);
				//QN7
				lA.vulnerabilities().click();
				Thread.sleep(3000);
				//QN8
				lA.workUntilEndShift().click();
				Thread.sleep(3000);
				//QN9
				lA.ownCntrlInc().click();
				Thread.sleep(3000);
				//QN10
				lA.occrOnPremise().click();
				Thread.sleep(3000);
				//Q11
				lA.thirdParty().click();
				Thread.sleep(3000);
				//QN12
				lA.clmntPAYE().click();
				Thread.sleep(3000);
				//QN13
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN14
				//lA.policyUpld().sendKeys(("user.dir")+ "/SmartClaim_New/Files/Dummy_Policy.pdf");

				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN15
				//lA.policyUpld().sendKeys(("user.dir")+ "/SmartClaim_New/Files/Dummy_Policy.pdf");
				Thread.sleep(3000);
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN16
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN17
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN18
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN19
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN20(Opted Unknown option since having element not interactable appears for swiper button
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN21
				lA.anythingOnFloor().click();
				Thread.sleep(3000);
				//QN22
				lA.hazardFluid().click();
				Thread.sleep(3000);
				//QN23
				lA.poorDrainage().click();
				Thread.sleep(3000);
				//QN24
				lA.sufMattingNo().click();
				Thread.sleep(3000);
				//QN25
				lA.hazardEmployee().click();
				Thread.sleep(3000);
				//QN26
				lA.hazardCauseSlipYes().click();
				Thread.sleep(3000);
				//QN27
				lA.hazardBeforeYes().click();
				Thread.sleep(3000);
				//QN28
				lA.sufcntLightingNo().click();
				Thread.sleep(3000);
				//QN29
				lA.handrailNo().click();
				Thread.sleep(3000);
				//QN30
				lA.safetyNoticeNo().click();
				Thread.sleep(3000);
				//QN31
				lA.healthPolicyNo().click();
				Thread.sleep(3000);
				//QN32
				lA.regularChecksNo().click();
				Thread.sleep(3000);
				//QN33
				lA.responsibleYes().click();
				Thread.sleep(3000);
				//QN34
				lA.locationCleanedNo().click();
				Thread.sleep(3000);
				//QN35
				lA.protectiveEquipYes().click();
				Thread.sleep(3000);
				//QN36
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN37
				lA.mitigateRiskYes().click();
				Thread.sleep(3000);
				//QN38
				lA.trainingGivenYes().click();
				Thread.sleep(3000);
				//QN39
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN40
				lA.recordNo().click();
				Thread.sleep(3000);
				//QN41
				lA.witnessNo().click();
				Thread.sleep(3000);
				//QN42
				lA.changeInProcYes().click();
				Thread.sleep(3000);
				//QN43
				lA.similarIncYes().click();
				Thread.sleep(3000);
				//QN44
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN45
				lA.immediateActionNo().click();
				Thread.sleep(3000);
				//QN46
				lA.anybodySeeYes().click();
				Thread.sleep(3000);
				//QN47
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN48
				lA.witnessStmntNo().click();
				Thread.sleep(3000);
				//QN49
				lA.contributeOwnInjuryNo().click();
				Thread.sleep(3000);
				//QN50
				lA.followProceduresYes().click();
				Thread.sleep(3000);
				//QN51
				lA.incidentReportyouYes().click();
				Thread.sleep(3000);
				//QN52
				lA.visibleInjuryNo().click();
				Thread.sleep(3000);
				//QN53
				lA.swiperBtn().click();
				Thread.sleep(3000);
				//QN54
				lA.medicalAttentionNo().click();
				Thread.sleep(3000);
				//QN55
				lA.injurySeriousnessGP().click();
				Thread.sleep(3000);
				//Save Claim
				logger.log(Status.INFO, "Saving Claim facts");
				lA.claimSaveButton().click();
				Thread.sleep(7000);
				if(lA.summaryScreenDisp().isDisplayed())
				{
					logger.log(Status.INFO, "Navigated to the summary view page");
				}

				else {

					logger.log(Status.FAIL, "Some issue in loading summary page");
				}

				//Verifying Liability admitted final output
				if(lA.finalOutputLA().isDisplayed()) {				
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
		int rownum = XLUtils.getRowCount(path, "LiabilityAdmitted");	
		int cocount= XLUtils.getCellCount(path, "NoLiability", rownum);
		//Creating an array to store values
		String claimData[][] = new String[rownum][cocount];
		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				claimData[i-1][j] = XLUtils.getCellData(path, "LiabilityAdmitted", i, j);
			}

		}

		return claimData;
	}



	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
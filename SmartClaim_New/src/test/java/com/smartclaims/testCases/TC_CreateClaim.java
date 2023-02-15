package com.smartclaims.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.AddClaimPage;
import com.smartclaims.pageObjects.LoginPage;

public class TC_CreateClaim extends BaseClass
{

	@Test(priority=1,dataProvider="ClaimDetails")
	public void addNewClaim(String user,String pwd,String claimdate, String appid,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("TC_002: Add a new claim");
		//Login to smart claim
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
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
			logger.log(Status.INFO, "Clicked on save button");
			Thread.sleep(3000);
			//Checking whether the claim added successfully and navigated to claim facts pages
			String claimfactsHeader=ac.getClaimFactsHeader();
			Boolean successmsg= ac.getAddClaimSuccessMsg();
			if(claimfactsHeader.contains("CLAIM FACTS") && successmsg)
			{
				Assert.assertTrue(true);
				logger.log(Status.PASS, "Added a new claim successfully");
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
	String [][] getData() throws IOException
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/Testdata.xlsx";

		//Getting row and coloumn count from the excel file
		int rownum = XLUtils.getRowCount(path, "ClaimFactInputs");
		int cocount= XLUtils.getCellCount(path, "ClaimFactInputs", 1);

		//Creating an array to store values
		String claimData[][] = new String[rownum][cocount];

		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				claimData[i-1][j] = XLUtils.getCellData(path, "ClaimFactInputs", i, j);
			}

		}

		return claimData;
	}


}

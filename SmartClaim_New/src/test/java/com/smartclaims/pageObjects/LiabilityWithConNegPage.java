package com.smartclaims.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiabilityWithConNegPage 
{
	//WebDriver ldriver;
		WebDriver driver;
		
		public LiabilityWithConNegPage(WebDriver driver)
		{
			//ldriver=rdriver;
			this.driver=driver;
			PageFactory.initElements(new AjaxElementLocatorFactory(driver,15), this);
		}

		@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[3]/div[2]/div/div[3]/button")
		WebElement forwardbtn;
		
		/*@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/div/div[1]")
		WebElement awareof_sliptrip_yes; */
		
		@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]")
		WebElement questionVisibility;
		
		@FindBy(how= How.XPATH,using="//*[@id='4536']")
		WebElement awareof_sliptrip_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4538']")
		WebElement sliptrip_at_yes;
		@FindBy(how= How.XPATH,using="//*[@id='6326']")
		WebElement incident_report_no;
		@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/input")
		WebElement incident_desc;
		@FindBy(how= How.XPATH,using="//*[@id='4596']")
		WebElement was_claimant_working_yes;
		@FindBy(how= How.XPATH,using="//*[@id='5844']")
		WebElement was_task_allocated_yes;
		@FindBy(how= How.XPATH,using="//*[@id='5846']")
		WebElement mentioned_vulnerabilities_yes;
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/input")
		WebElement describe_vulnerabilities;
		@FindBy(how= How.XPATH,using="//*[@id='5848']")
		WebElement working_until_endofshift_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4466']")
		WebElement business_own_location_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4468']")
		WebElement business_own_premise_yes;
		@FindBy(how= How.XPATH,using="//*[@id='5822']")
		WebElement thirdparty_running_location_no;
		@FindBy(how= How.XPATH,using="//*[@id='4549']")
		WebElement claimant_employedby_org_yes;
		
		@FindBy(how= How.XPATH,using="")
		WebElement claimant_become_employee_date;
		
		@FindBy(how= How.XPATH,using="//*[@id='4477']")
		WebElement anythingonfloor_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4555']")
		WebElement type_of_hazard_fluid;
		@FindBy(how= How.XPATH,using="//*[@id='4484']")
		WebElement poor_drainage_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4560']")
		WebElement matting_syatem_no;
		@FindBy(how= How.XPATH,using="//*[@id='6144']")
		WebElement who_made_hazard_employee;
		@FindBy(how= How.XPATH,using="//*[@id='4557']")
		WebElement hazard_caused_slip_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4483']")
		WebElement know_about_hazard_before_no;
		@FindBy(how= How.XPATH,using="//*[@id='4495']")
		WebElement sufficient_lighting_no;
		@FindBy(how= How.XPATH,using="//*[@id='4563']")
		WebElement handrail_available_no;
		@FindBy(how= How.XPATH,using="//*[@id='4473']")
		WebElement safety_notices_no;	
		@FindBy(how= How.XPATH,using="//*[@id='4497']")
		WebElement riskassess_complete_no;
		@FindBy(how= How.XPATH,using="//*[@id='4573']")
		WebElement reg_check_location_no;
		@FindBy(how= How.XPATH,using="//*[@id='4547']")
		WebElement business_responsible_loc_clean_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4509']")
		WebElement location_reg_clean_no;		
		@FindBy(how= How.XPATH,using="//*[@id='5852']")
		WebElement protective_equ_no;
		@FindBy(how= How.XPATH,using="//*[@id='5854']")
		WebElement provide_training_yes;
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/input[1]")
		WebElement provide_training_date;
		
		@FindBy(how= How.XPATH,using="//*[@id='5926']")
		WebElement record_of_training_unknown;
		@FindBy(how= How.XPATH,using="//*[@id='5900']")
		WebElement witness_training_unknown;
		@FindBy(how= How.XPATH,using="//*[@id='4519']")
		WebElement change_procedure_no;
		@FindBy(how= How.XPATH,using="//*[@id='4521']")
		WebElement similar_incidents_before_no;
		
		@FindBy(how= How.XPATH,using="//*[@id='4523']")
		WebElement person_see_incident_no;
		@FindBy(how= How.XPATH,using="//*[@id='4531']")
		WebElement contribute_to_injury_yes;
		@FindBy(how= How.XPATH,using="//*[@id='4534']")
		WebElement how_did_contribute_running;
		@FindBy(how= How.XPATH,using="//*[@id='4591']")
		WebElement claimant_follow_procedure_yes;
		@FindBy(how= How.XPATH,using="//*[@id='5830']")
		WebElement incident_reported_no;
		@FindBy(how= How.XPATH,using="//*[@id='4593']")
		WebElement visible_sign_injury_yes;
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/input")
		WebElement injury_reported;
		@FindBy(how= How.XPATH,using="//*[@id='5831']")
		WebElement medical_attention_yes;
		@FindBy(how= How.XPATH,using="//*[@id='5835']")
		WebElement how_serious_injury_oneday;
		
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div/span")
		WebElement wording_doc_upload1;
		
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]/div")
		WebElement wording_doc_upload2;
		
		@FindBy(how= How.XPATH,using="//*[@id=\"fup\"]")
		WebElement wording_doc_upload;
		@FindBy(how= How.XPATH,using="//*[@id=\"fup\"]")
		WebElement schedule_doc_upload;
			
		@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[2]/div/div[2]/button")
		WebElement save_claim;
		
		@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[1]/div/h3[contains(text(),'Summary View')]")
		WebElement summaryview;
		
		@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div/svg/foreignObject[contains(text(),'Insured has no liability']")
		Boolean liabilityindicator_summary;
		
		//Action methods 
		public void navigateClaimFacts()
		{
			forwardbtn.click();
			waitForVisibility(questionVisibility);
			
		}
		private void waitForVisibility(WebElement element) throws Error
		{
			new WebDriverWait(driver, 60)
			.until(ExpectedConditions.visibilityOf(element));
		}
		public void actionClick(WebElement element1, WebElement element2)
		{	
			waitForVisibility(element2);
			Actions actions = new Actions(driver);
			actions.moveToElement(element1);
			actions.click().build().perform();		
		}
		public void selectAwareofSlipTrip()
		{	
			actionClick(awareof_sliptrip_yes,questionVisibility);
		}
		public void selectSlipTripAt()
		{
			actionClick(sliptrip_at_yes,questionVisibility);
		}
		public void selectIncidentReport()
		{
			actionClick(incident_report_no,questionVisibility);
		}
		public void setIncidentDesc(String desc)
		{
			waitForVisibility(questionVisibility);
			incident_desc.sendKeys(desc);
		}
		public void selectWasClaimantWorking()
		{
			actionClick(was_claimant_working_yes,questionVisibility);
		}
		public void selectWasTaskAllocated()
		{
			actionClick(was_task_allocated_yes,questionVisibility);
		}
		public void selectMentionedVulnerabilities()
		{
			actionClick(mentioned_vulnerabilities_yes,questionVisibility);
		}
		public void setVulnerabilityDesc(String desc)
		{
			waitForVisibility(questionVisibility);
			describe_vulnerabilities.sendKeys(desc);
		}
		public void selectWorkingEndShift()
		{
			actionClick(working_until_endofshift_yes,questionVisibility);
		}
		public void selectBusinessOwnLocation()
		{
			actionClick(business_own_location_yes,questionVisibility);
		}
		public void selectBusinessOwnPremise()
		{
			actionClick(business_own_premise_yes,questionVisibility);
		}
		public void selectThirdpartyRunningLocation()
		{
			actionClick(thirdparty_running_location_no,questionVisibility);
		}
		public void selectClaimantEmployedByOrg()
		{
			actionClick(claimant_employedby_org_yes,questionVisibility);
		}
		public void selectAnythingOnFloor()
		{
			actionClick(anythingonfloor_yes,questionVisibility);
		}
		public void selectTypeOfHazard()
		{
			actionClick(type_of_hazard_fluid,questionVisibility);
		}
		public void selectPoorDrainage()
		{
			actionClick(poor_drainage_yes,questionVisibility);
		}
		public void selectMattingSystem()
		{
			actionClick(matting_syatem_no,questionVisibility);
		}
		public void selectWhomadeHazard()
		{
			actionClick(who_made_hazard_employee,questionVisibility);
		}
		public void selectHazardCausedSlip()
		{
			actionClick(hazard_caused_slip_yes,questionVisibility);
		}
		public void selectKnowAboutHazard()
		{
			actionClick(know_about_hazard_before_no,questionVisibility);
		}
		public void selectSufficientLighting()
		{
			actionClick(sufficient_lighting_no,questionVisibility);
		}
		public void selectHandrailAvailable()
		{
			actionClick(handrail_available_no,questionVisibility);
		}
		public void selectSafetyNotices()
		{
			actionClick(safety_notices_no,questionVisibility);
		}
		public void selectRiskAssessComplete()
		{
			actionClick(riskassess_complete_no,questionVisibility);
		}
		public void selectRegCheckLocation()
		{
			actionClick(reg_check_location_no,questionVisibility);
		}
		public void selectBusinessResLocClean()
		{
			actionClick(business_responsible_loc_clean_yes,questionVisibility);
		}
		public void selectLocRegCleaned()
		{
			actionClick(location_reg_clean_no,questionVisibility);
		}
		public void selectProtectiveEqu()
		{
			actionClick(protective_equ_no,questionVisibility);
		}
		public void selectProvideTraining()
		{
			actionClick(provide_training_yes,questionVisibility);
		}
		public void selectRecoedOfTraining()
		{
			actionClick(record_of_training_unknown,questionVisibility);
		}
		public void selectWitnessTraining()
		{
			actionClick(witness_training_unknown,questionVisibility);
		}
		public void selectChangeProcedure()
		{
			actionClick(change_procedure_no,questionVisibility);
		}
		public void selectSimilarIncidents()
		{
			actionClick(similar_incidents_before_no,questionVisibility);
		}
		public void selectPersonSeeIncident()
		{
			actionClick(person_see_incident_no,questionVisibility);
		}
		public void selectContributeToInjury()
		{
			actionClick(contribute_to_injury_yes,questionVisibility);
		}
		public void selectHowDidContribute()
		{
			actionClick(how_did_contribute_running,questionVisibility);
		}
		public void selectClaimantFollowProcedure()
		{
			actionClick(claimant_follow_procedure_yes,questionVisibility);
		}
		public void selectIncidentReported()
		{
			actionClick(incident_reported_no,questionVisibility);
		}
		public void selectVisibleSignInjury()
		{
			actionClick(visible_sign_injury_yes,questionVisibility);
		}
		public void setInjuryReported(String injury)
		{
			waitForVisibility(questionVisibility);
			injury_reported.sendKeys(injury);
		}
		public void selectMedicalAttention()
		{
			actionClick(medical_attention_yes,questionVisibility);
		}
		public void selectHowSeriousInjury()
		{
			actionClick(how_serious_injury_oneday,questionVisibility);
		}
		public void uploadPolicyWordDoc()
		{
			//Set the file path
			String filePath = System.getProperty("user.dir") + "/Files/Dummy_Policy.pdf";
			wording_doc_upload.sendKeys(filePath);
		}
		public void uploadPolicyScheduleDoc()
		{
			//Set the file path
			String filePath = System.getProperty("user.dir") + "/Files/Dummy_Policy.pdf";
			schedule_doc_upload.sendKeys(filePath);
		}
		public void saveClaim()
		{
			save_claim.click();
		}
		public void verifySummaryView()
		{
			waitForVisibility(summaryview);
		}
		public Boolean getLiabilityIndicator()
		{
			if(liabilityindicator_summary = true)
				return true;
			else
				return false;
		}
}

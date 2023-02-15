package com.smartclaims.pageObjects;

import javax.sql.rowset.serial.SerialArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoLiabilityPage 
{
	//WebDriver ldriver;
	WebDriver driver;
	
	public NoLiabilityPage(WebDriver driver)
	{
		//ldriver=rdriver;
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,15), this);
	}

	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[4]/div[2]/div/div[3]/button")
	WebElement forwardbtn;
	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[4]/div[1]/swiper/div[3]/div[2]/div[2]")
	WebElement questionVisibility;	
	@FindBy(how= How.XPATH,using="//*[@id='4536']")
	WebElement awareof_sliptrip_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4538']")
	WebElement sliptrip_at_yes;
	@FindBy(how= How.XPATH,using="//*[@id='6326']")
	WebElement incident_report_no;
	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[4]/div[1]/swiper/div[3]/div[2]/div[2]/div/div/input")
	WebElement incident_desc;
	@FindBy(how= How.XPATH,using="//*[@id='4596']")
	WebElement was_claimant_working_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5844']")
	WebElement was_task_allocated_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5928']")
	WebElement mentioned_vulnerabilities_unknown;
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
	
	@FindBy(how= How.XPATH,using="//*[@id='4478']")
	WebElement anythingonfloor_no;
	@FindBy(how= How.XPATH,using="//*[@id='4494']")
	WebElement sufficient_lighting_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4562']")
	WebElement handrail_available_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4472']")
	WebElement safety_notices_yes;
	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[4]/div[1]/swiper/div[3]/div[2]/div[2]/div/div/input")
	WebElement warning_notice_content;
	@FindBy(how= How.XPATH,using="//*[@id='4496']")
	WebElement safetypolicy_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4566']")
	WebElement riskassess_complete_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4572']")
	WebElement reg_check_location_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4574']")
	WebElement evidence_reg_check_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4582']")
	WebElement location_check_frequency_daily;
	@FindBy(how= How.XPATH,using="//*[@id='4547']")
	WebElement business_responsible_loc_clean_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4508']")
	WebElement location_reg_clean_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4514']")
	WebElement record_of_cleaning_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4516']")
	WebElement person_knowledgeof_cleaning_yes;

	@FindBy(how= How.XPATH,using="//*[@id='4512']")
	WebElement frequency_loc_clean_daily;
	@FindBy(how= How.XPATH,using="//*[@id='4587']")
	WebElement wet_mopping_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4589']")
	WebElement floor_left_dry_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5824']")
	WebElement wet_floor_sign_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5867']")
	WebElement protective_equ_na;
	@FindBy(how= How.XPATH,using="//*[@id='5868']")
	WebElement provide_training_na;
	@FindBy(how= How.XPATH,using="//*[@id='4518']")
	WebElement change_procedure_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4520']")
	WebElement similar_incidents_before_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4524']")
	WebElement immediate_action_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5903']")
	WebElement person_see_incident_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='4531']")
	WebElement contribute_to_injury_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4533']")
	WebElement how_did_contribute;
	@FindBy(how= How.XPATH,using="//*[@id='4706']")
	WebElement claimant_follow_procedure_na;
	@FindBy(how= How.XPATH,using="//*[@id='5829']")
	WebElement incident_reported_yes;
	@FindBy(how= How.XPATH,using="//*[@id='4594']")
	WebElement visible_sign_injury_no;
	@FindBy(how= How.XPATH,using="//*[@id='5831']")
	WebElement medical_attention_yes;
	@FindBy(how= How.XPATH,using="//*[@id='5836']")
	WebElement how_serious_injury_gp;
	
	@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[4]/div[1]/swiper/div[3]/div[2]/div[2]/div/span")
	WebElement wording_doc_upload1;
	
	@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[4]/div[1]/swiper/div[3]/div[2]/div[2]/div")
	WebElement wording_doc_upload2;
	
	@FindBy(how= How.XPATH,using="//*[@id=\"fup\"]")
	WebElement wording_doc_upload;
		
	@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[4]/div[2]/div/div[2]/button")
	WebElement save_claim;
	/*
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[1]/div/h3[contains(text(),'Summary View')]")
	WebElement summaryview; */
	
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-claim-facts-liability/app-liability-complete-view/div[1]/div/div[1]/h3[contains(text(),'Summary View')]")
	WebElement summaryview;
	/*
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div/svg/foreignObject[contains(text(),'Insured has no liability']")
	Boolean liabilityindicator_summary;
	*/
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-claim-facts-liability/app-liability-complete-view/app-liability-summary/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div/svg/foreignObject[contains(text(),'Insured has no liability']")
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
		actionClick(mentioned_vulnerabilities_unknown,questionVisibility);
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
		actionClick(anythingonfloor_no,questionVisibility);
	}
	public void selectSufficientLighting()
	{
		actionClick(sufficient_lighting_yes,questionVisibility);
	}
	public void selectHandrailAvailable()
	{
		actionClick(handrail_available_yes,questionVisibility);
	}
	public void selectSafetyNotices()
	{
		actionClick(safety_notices_yes,questionVisibility);
	}
	public void setWarningNotice(String warning)
	{
		waitForVisibility(questionVisibility);
		warning_notice_content.sendKeys(warning);
	}
	public void selectSafetyPolicy()
	{
		actionClick(safetypolicy_yes,questionVisibility);
	}
	public void selectRiskAssessComplete()
	{
		actionClick(riskassess_complete_yes,questionVisibility);
	}
	public void selectRegCheckLocation()
	{
		actionClick(reg_check_location_yes,questionVisibility);
	}
	public void selectEvidenceRegCheck()
	{
		actionClick(evidence_reg_check_yes,questionVisibility);
	}
	public void selectLocCheckFrequency()
	{
		actionClick(location_check_frequency_daily,questionVisibility);
	}
	public void selectBusinessResLocClean()
	{
		actionClick(business_responsible_loc_clean_yes,questionVisibility);
	}
	public void selectLocRegCleaned()
	{
		actionClick(location_reg_clean_yes,questionVisibility);
	}
	public void selectRecOfCleaning()
	{
		actionClick(record_of_cleaning_yes,questionVisibility);
	}
	public void selectsomebodyCleaningProcess()
	{
		actionClick(person_knowledgeof_cleaning_yes,questionVisibility);
	}
	
	public void selectFrequencyLocClean()
	{
		actionClick(frequency_loc_clean_daily,questionVisibility);
	}
	public void selectWetMopping()
	{
		actionClick(wet_mopping_yes,questionVisibility);
	}
	public void selectFloorLeftDry()
	{
		actionClick(floor_left_dry_yes,questionVisibility);
	}
	public void selectWetFloorSign()
	{
		actionClick(wet_floor_sign_yes,questionVisibility);
	}
	public void selectProtectiveEqu()
	{
		actionClick(protective_equ_na,questionVisibility);
	}
	public void selectProvideTraining()
	{
		actionClick(provide_training_na,questionVisibility);
	}
	public void selectChangeProcedure()
	{
		actionClick(change_procedure_yes,questionVisibility);
	}
	public void selectSimilarIncidents()
	{
		actionClick(similar_incidents_before_yes,questionVisibility);
	}
	public void selectImmediateAction()
	{
		actionClick(immediate_action_yes,questionVisibility);
	}
	public void selectPersonSeeIncident()
	{
		actionClick(person_see_incident_unknown,questionVisibility);
	}
	public void selectContributeToInjury()
	{
		actionClick(contribute_to_injury_yes,questionVisibility);
	}
	public void selectHowDidContribute()
	{
		actionClick(how_did_contribute,questionVisibility);
	}
	public void selectClaimantFollowProcedure()
	{
		actionClick(claimant_follow_procedure_na,questionVisibility);
	}
	public void selectIncidentReported()
	{
		actionClick(incident_reported_yes,questionVisibility);
	}
	public void selectVisibleSignInjury()
	{
		actionClick(visible_sign_injury_no,questionVisibility);
	}
	public void selectMedicalAttention()
	{
		actionClick(medical_attention_yes,questionVisibility);
	}
	public void selectHowSeriousInjury()
	{
		actionClick(how_serious_injury_gp,questionVisibility);
	}
	public void uploadPolicyWordDoc()
	{
		//Set the file path
		String filePath = System.getProperty("user.dir") + "/Files/Dummy_Policy.pdf";
		wording_doc_upload.sendKeys(filePath);
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

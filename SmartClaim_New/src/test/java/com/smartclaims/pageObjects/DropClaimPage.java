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

public class DropClaimPage 
{
	WebDriver driver;
	
	public DropClaimPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,15), this);
	}

	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[3]/div[2]/div/div[3]/button")
	WebElement forwardbtn;	
	@FindBy(how= How.XPATH,using="//*[@id='iqwizardDiv']/iq-wizard/div/div[3]/div[1]/swiper/div[3]/div[2]/div[2]")
	WebElement questionVisibility;
	@FindBy(how= How.XPATH,using="//*[@id='4537']")
	WebElement awareof_sliptrip_no;
	@FindBy(how= How.XPATH,using="//*[@id='4597']")
	WebElement was_claimant_working_no;
	@FindBy(how= How.XPATH,using="//*[@id='4467']")
	WebElement business_own_location_no;
	@FindBy(how= How.XPATH,using="//*[@id='4469']")
	WebElement business_own_premise_no;
	@FindBy(how= How.XPATH,using="//*[@id='4471']")
	WebElement business_occupy_premise_no;
	@FindBy(how= How.XPATH,using="//*[@id='4550']")
	WebElement claimant_employedby_org_no;
	@FindBy(how= How.XPATH,using="//*[@id='4552']")
	WebElement claimant_contractedby_org_no;
	@FindBy(how= How.XPATH,using="//*[@id='5873']")
	WebElement anythingonfloor_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5879']")
	WebElement sufficient_lighting_unknown;	
	@FindBy(how= How.XPATH,using="//*[@id='5881']")
	WebElement handrail_available_unknown;	
	@FindBy(how= How.XPATH,using="//*[@id='5883']")
	WebElement safety_notices_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5885']")
	WebElement safetypolicy_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5907']")
	WebElement reg_check_location_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5892']")
	WebElement business_responsible_loc_clean_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5853']")
	WebElement protective_equ_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5925']")
	WebElement provide_training_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5901']")
	WebElement change_procedure_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5902']")
	WebElement similar_incidents_before_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5903']")
	WebElement person_see_incident_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5904']")
	WebElement contribute_to_injury_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5905']")
	WebElement claimant_follow_procedure_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5833']")
	WebElement medical_attention_unknown;
	@FindBy(how= How.XPATH,using="//*[@id='5906']")
	WebElement how_serious_injury_unknown;	
	@FindBy(how= How.XPATH,using="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[2]/div/div[2]/button")
	WebElement save_claim;
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[1]/div/h3[contains(text(),'Summary View')]")
	WebElement summaryview;
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div/svg/foreignObject[contains(text(),'Drop Claim']")
	Boolean liabilityindicator_summary;
	@FindBy(how= How.XPATH,using="//*[@id=\"logoHeader\"]/img")
	WebElement logo_click;
	
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
		actionClick(awareof_sliptrip_no,questionVisibility);
	}
	public void selectWasClaimantWorking()
	{
		actionClick(was_claimant_working_no,questionVisibility);
	}
	public void selectBusinessOwnLocation()
	{
		actionClick(business_own_location_no,questionVisibility);
	}
	public void selectBusinessOwnPremise()
	{
		actionClick(business_own_premise_no,questionVisibility);
	}
	public void selectBusinessOccupyPremise()
	{
		actionClick(business_occupy_premise_no,questionVisibility);
	}
	public void selectClaimantEmployedByOrg()
	{
		actionClick(claimant_employedby_org_no,questionVisibility);
	}
	public void selectClaimantContractedByOrg()
	{
		actionClick(claimant_contractedby_org_no,questionVisibility);
	}	
	public void selectAnythingOnFloor()
	{
		actionClick(anythingonfloor_unknown,questionVisibility);
	}	
	public void selectSufficientLighting()
	{
		actionClick(sufficient_lighting_unknown,questionVisibility);
	}
	public void selectHandrailAvailable()
	{
		actionClick(handrail_available_unknown,questionVisibility);
	}
	public void selectSafetyNotices()
	{
		actionClick(safety_notices_unknown,questionVisibility);
	}
	public void selectSafetyPolicy()
	{
		actionClick(safetypolicy_unknown,questionVisibility);
	}
	public void selectRegCheckLocation()
	{
		actionClick(reg_check_location_unknown,questionVisibility);
	}
	public void selectBusinessResLocClean()
	{
		actionClick(business_responsible_loc_clean_unknown,questionVisibility);
	}
	public void selectProtectiveEqu()
	{
		actionClick(protective_equ_unknown,questionVisibility);
	}
	public void selectProvideTraining()
	{
		actionClick(provide_training_unknown,questionVisibility);
	}
	public void selectChangeProcedure()
	{
		actionClick(change_procedure_unknown,questionVisibility);
	}
	public void selectSimilarIncidents()
	{
		actionClick(similar_incidents_before_unknown,questionVisibility);
	}
	public void selectPersonSeeIncident()
	{
		actionClick(person_see_incident_unknown,questionVisibility);
	}
	public void selectContributeToInjury()
	{
		actionClick(contribute_to_injury_unknown,questionVisibility);
	}
	public void selectClaimantFollowProcedure()
	{
		actionClick(claimant_follow_procedure_unknown,questionVisibility);
	}
	public void selectMedicalAttention()
	{
		actionClick(medical_attention_unknown,questionVisibility);
	}
	public void selectHowSeriousInjury()
	{
		actionClick(how_serious_injury_unknown,questionVisibility);
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
	public void navigateDashboard()
	{
		logo_click.click();
	}
}

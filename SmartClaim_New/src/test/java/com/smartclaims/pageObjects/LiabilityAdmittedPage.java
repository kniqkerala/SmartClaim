package com.smartclaims.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiabilityAdmittedPage {
	
	WebDriver driver;

	public LiabilityAdmittedPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@class='fa fa-arrow-right']")
	WebElement swiperBtn;
	
	@FindBy(xpath="//*[@for=\"4536\"]")
	WebElement awareOfStRdBtn;
	
	@FindBy(xpath="//*[@for=\"4538\"]")
	WebElement didSThpnTimeRdBtn;
	
	@FindBy(xpath="//*[@for=\"4596\"]")
	WebElement wasClmntWrkngRdBtn;
	
	@FindBy(xpath="//*[@for=\"5844\"]")
	WebElement taskAllottedRdBtn;
	
	@FindBy(xpath="//*[@for=\"5847\"]")
	WebElement vulnerabilities;
	
	@FindBy(xpath="//*[@for=\"5849\"]")
	WebElement workUntilEndShift;
	
	@FindBy(xpath="//*[@for=\"4466\"]")
	WebElement ownCntrlInc;
	
	@FindBy(xpath="//*[@for=\"4468\"]")
	WebElement occrOnPremise;
	
	@FindBy(xpath="//*[@for=\"5822\"]")
	WebElement thirdParty;
	
	@FindBy(xpath="//*[@for=\"4549\"]")
	WebElement clmntPAYE;
	
	@FindBy(xpath="//*[@class=\"btn_common iQBtn_file\"]")
	WebElement policyUpld;
	
	@FindBy(xpath="//*[@for=\"4477\"]")
	WebElement anythingOnFloor;
	
	@FindBy(xpath="//*[@for=\"4555\"]")
	WebElement hazardFluid;
	
	@FindBy(xpath="//*[@for=\"4484\"]")
	WebElement poorDrainage;
	
	@FindBy(xpath="//*[@for=\"4560\"]")
	WebElement sufMattingNo;
	
	@FindBy(xpath="//*[@for=\"6144\"]")
	WebElement hazardEmployee;
	
	@FindBy(xpath="//*[@for=\"4557\"]")
	WebElement hazardCauseSlipYes;
	
	@FindBy(xpath="//*[@for=\"4482\"]")
	WebElement hazardBeforeYes;
	
	@FindBy(xpath="//*[@for=\"4495\"]")
	WebElement sufcntLightingNo;
	
	@FindBy(xpath="//*[@for=\"4563\"]")
	WebElement handrailNo;
	
	@FindBy(xpath="//*[@for=\"4473\"]")
	WebElement safetyNoticeNo;
	
	@FindBy(xpath="//*[@for=\"4497\"]")
	WebElement healthPolicyNo;
	
	@FindBy(xpath="//*[@for=\"4573\"]")
	WebElement regularChecksNo;
	
	@FindBy(xpath="//*[@for=\"4547\"]")
	WebElement responsibleYes;
	
	@FindBy(xpath="//*[@for=\"4509\"]")
	WebElement locationCleanedNo;
	
	@FindBy(xpath="//*[@for=\"5851\"]")
	WebElement protectiveEquipYes;
	
	@FindBy(xpath="//*[@for=\"5922\"]")
	WebElement mitigateRiskYes;
	
	@FindBy(xpath="//*[@for=\"5854\"]")
	WebElement trainingGivenYes;
	
	@FindBy(xpath="//*[@for=\"5857\"]")
	WebElement recordNo;
	
	@FindBy(xpath="//*[@for=\"5859\"]")
	WebElement witnessNo;
	
	@FindBy(xpath="//*[@for=\"4518\"]")
	WebElement changeInProcYes;
	
	@FindBy(xpath="//*[@for=\"4520\"]")
	WebElement similarIncYes;
	
	@FindBy(xpath="//*[@for=\"4525\"]")
	WebElement immediateActionNo;
	
	@FindBy(xpath="//*[@for=\"4522\"]")
	WebElement anybodySeeYes;
	
	@FindBy(xpath="//*[@for=\"4527\"]")
	WebElement witnessStmntNo;
	
	@FindBy(xpath="//*[@for=\"4532\"]")
	WebElement contributeOwnInjuryNo;
	
	@FindBy(xpath="//*[@for=\"4591\"]")
	WebElement followProceduresYes;
	
	@FindBy(xpath="//*[@for=\"5829\"]")
	WebElement incidentReportyouYes;
	
	@FindBy(xpath="//*[@for=\"4594\"]")
	WebElement visibleInjuryNo;
	
	@FindBy(xpath="//*[@for=\"5832\"]")
	WebElement medicalAttentionNo;
	
	@FindBy(xpath="//*[@for=\"5836\"]")
	WebElement injurySeriousnessGP;
	
	@FindBy(xpath="//*[@class=\"iQswiper_saveBtn saveBtn_mob\"]")
	WebElement claimSaveButton;
	
	
	@FindBy(xpath="//*[@class=\"mb-0\" and text()='Liability Analysis']")
	WebElement summaryScreenDisp;
	
	@FindBy(xpath="//*[@alignment-baseline = \"middle\" and text()=' Liability admitted ']")
	WebElement finalOutputLA;
	
	
	public WebElement swiperBtn(){

		return swiperBtn;

	}
	
	public WebElement awareOfStRdBtn(){

		return awareOfStRdBtn;

	}
	
	public WebElement didSThpnTimeRdBtn(){

		return didSThpnTimeRdBtn;

	}
	
	public WebElement wasClmntWrkngRdBtn(){

		return wasClmntWrkngRdBtn;

	}
	
	public WebElement taskAllottedRdBtn(){

		return taskAllottedRdBtn;

	}
	
	public WebElement vulnerabilities(){

		return vulnerabilities;

	}
	
	public WebElement workUntilEndShift(){

		return workUntilEndShift;

	}
	
	public WebElement ownCntrlInc(){

		return ownCntrlInc;

	}
	
	public WebElement occrOnPremise(){

		return occrOnPremise;

	}
	
	public WebElement thirdParty(){

		return thirdParty;

	}
	
	public WebElement clmntPAYE(){

		return clmntPAYE;

	}
	
	public WebElement policyUpld(){

		return policyUpld;

	}
	
	public WebElement anythingOnFloor(){

		return anythingOnFloor;

	}
	
	public WebElement hazardFluid(){

		return hazardFluid;

	}
	
	public WebElement poorDrainage(){

		return poorDrainage;

	}
	
	public WebElement sufMattingNo(){

		return sufMattingNo;

	}
	
	public WebElement hazardEmployee(){

		return hazardEmployee;

	}
	
	public WebElement hazardCauseSlipYes(){

		return hazardCauseSlipYes;

	}
	
	public WebElement hazardBeforeYes(){

		return hazardBeforeYes;

	}
	
	public WebElement sufcntLightingNo(){

		return sufcntLightingNo;
	
	}
	
	public WebElement handrailNo(){

		return handrailNo;
	
	}
	
	public WebElement safetyNoticeNo(){

		return safetyNoticeNo;
	
	}
	
	public WebElement healthPolicyNo(){

		return healthPolicyNo;
	
	}
	
	public WebElement regularChecksNo(){

		return regularChecksNo;
	
	}
	
	public WebElement responsibleYes(){

		return responsibleYes;
	
	}
	
	public WebElement locationCleanedNo(){

		return locationCleanedNo;
	
	}
	
	public WebElement protectiveEquipYes(){

		return protectiveEquipYes;
	
	}
	
	public WebElement mitigateRiskYes(){

		return mitigateRiskYes;
	
	}
	
	public WebElement trainingGivenYes(){

		return trainingGivenYes;
	
	}
	
	public WebElement recordNo(){

		return recordNo;
	
	}
	
	public WebElement witnessNo(){

		return witnessNo;
	
	}
	
	public WebElement changeInProcYes(){

		return changeInProcYes;
	
	}
	
	public WebElement immediateActionNo(){

		return immediateActionNo;
	
	}
	
	public WebElement similarIncYes(){

		return similarIncYes;
	
	}
	
	public WebElement anybodySeeYes(){

		return anybodySeeYes;
	
	}
	
	public WebElement witnessStmntNo(){

		return witnessStmntNo;
	
	}
	
	public WebElement contributeOwnInjuryNo(){

		return contributeOwnInjuryNo;
	
	}
	
	public WebElement followProceduresYes(){

		return followProceduresYes;
	
	}
	
	public WebElement incidentReportyouYes(){

		return incidentReportyouYes;
	
	}
	
	public WebElement visibleInjuryNo(){

		return visibleInjuryNo;
	
	}
	
	public WebElement medicalAttentionNo(){

		return medicalAttentionNo;
	
	}
	
	public WebElement injurySeriousnessGP(){

		return injurySeriousnessGP;
	
	}
	
	public WebElement claimSaveButton(){

		return claimSaveButton;
	
	}
	
	public WebElement finalOutputLA(){

		return finalOutputLA;
	
	}
	
	public WebElement summaryScreenDisp(){

		return summaryScreenDisp;
	
	}
	
	
}

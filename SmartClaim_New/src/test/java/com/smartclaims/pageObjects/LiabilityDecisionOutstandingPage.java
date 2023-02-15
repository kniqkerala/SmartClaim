package com.smartclaims.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiabilityDecisionOutstandingPage {

	WebDriver driver;

	public LiabilityDecisionOutstandingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@class='fa fa-arrow-right']")
	WebElement swiperBtn;
	
	@FindBy(xpath="//*[@for=\"4536\"]")
	WebElement awareOfSTYes;
	
	@FindBy(xpath="//*[@for=\"4538\"]")
	WebElement SThappenTimeYes;
	
	@FindBy(xpath="//*[@for=\"4596\"]")
	WebElement WasWorkingYes;
	
	@FindBy(xpath="//*[@for=\"5844\"]")
	WebElement taskAllotedYes;
	
	@FindBy(xpath="//*[@for=\"5928\"]")
	WebElement anyVulnerconditionsUK;
	
	@FindBy(xpath="//*[@for=\"5848\"]")
	WebElement workUntilEndShiftYes;
	
	@FindBy(xpath="//*[@for=\"4466\"]")
	WebElement businessOwnLocYes;
	
	@FindBy(xpath="//*[@for=\"4468\"]")
	WebElement incOwnPremiseYes;
	
	@FindBy(xpath="//*[@for=\"5822\"]")
	WebElement thirdPartyRunningNo;
	
	@FindBy(xpath="//*[@for=\"4549\"]")
	WebElement PAYE_Yes;
	
	@FindBy(xpath="//*[@class=\"iQswiper_saveBtn saveBtn_mob\"]")
	WebElement claimSaveButton;
	
	@FindBy(xpath="//*[@class=\"mb-0\" and text()='Liability Analysis']")
	WebElement summaryScreenDisp;
	
	@FindBy(xpath="//*[@alignment-baseline = \"middle\" and text()=' Liability decision outstanding ']")
	WebElement finalOutputLDO;
	
	public WebElement swiperBtn(){

		return swiperBtn;

	}
	
	public WebElement awareOfSTYes(){

		return awareOfSTYes;

	}
	
	public WebElement SThappenTimeYes(){

		return SThappenTimeYes;

	}
	
	public WebElement WasWorkingYes(){

		return WasWorkingYes;

	}
	
	public WebElement taskAllotedYes(){

		return taskAllotedYes;

	}
	
	public WebElement anyVulnerconditionsUK(){

		return anyVulnerconditionsUK;

	}
	
	public WebElement workUntilEndShiftYes(){

		return workUntilEndShiftYes;

	}
	
	public WebElement businessOwnLocYes(){

		return businessOwnLocYes;

	}
	
	public WebElement incOwnPremiseYes(){

		return incOwnPremiseYes;

	}
	
	public WebElement thirdPartyRunningNo(){

		return thirdPartyRunningNo;

	}
	
	public WebElement PAYE_Yes(){

		return PAYE_Yes;

	}
	
	public WebElement claimSaveButton(){

		return claimSaveButton;

	}
	
	public WebElement summaryScreenDisp(){

		return summaryScreenDisp;

	}
	
	public WebElement finalOutputLDO(){

		return finalOutputLDO;

	}
	
}

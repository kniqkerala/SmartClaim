package com.smartclaims.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddClaimPage 
{
	WebDriver ldriver;
	public AddClaimPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver,15), this);
	}

	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-dashboard/div[2]/div/div[1]/form/div/div[2]/div/button")
	WebElement newclaimbtn;

	@FindBy(how= How.XPATH,using="/html/body/ngb-modal-window/div/div/div/div[1]/h5")
	WebElement addclaimheader;

	@FindBy(id="mat-input-0")
	WebElement dateofclaim;
/*
	@FindBy(how= How.XPATH,using="//form[@name='claimFactsForm']/div[2]/div/input")
	WebElement applicationid; */

	@FindBy(how= How.XPATH,using="//form[@name='newClaimForm']/div[3]/div/input")
	WebElement defendantname;

	@FindBy(how= How.XPATH,using="//form[@name='newClaimForm']/div[6]/div/input")
	WebElement claimantname;

	@FindBy(how= How.XPATH,using="//form[@name='newClaimForm']/div[7]/div/input")
	WebElement claimantsolicitor;

	@FindBy(how= How.XPATH,using="//form[@name='newClaimForm']/div[8]/div/input")
	WebElement referenceno;
	
	@FindBy(id="mat-input-1")
	WebElement customfield;

	@FindBy(how= How.XPATH,using="//div[@class='button_holder']/button[1]")
	WebElement savebtn;

	@FindBy(how= How.XPATH,using="//div[@class='main-container']/k-simple-alert[contains(text(),'\"New claim initialized successfully.\"')]")
	Boolean successmsg; 
/*
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-manage-claim/div[1]/div/h3")
	WebElement claimfactsheader; */
	
	@FindBy(how= How.XPATH,using="/html/body/app-root/div[2]/div/div/div/app-claim-facts-liability/app-liability-complete-view/div[1]/div/div[1]/h3")
	WebElement claimfactsheader; 
	
	@FindBy(how= How.XPATH,using="//div[@class='page_space']/div[2]")
	WebElement allclaims;

	//Action methods 
	public void clickAddClaim()
	{
		newclaimbtn.click();
	}
	public String getAddClaimHeader()
	{
		String headerText= addclaimheader.getText();
		return headerText;
	}
	public void setClaimDate(String claimdate)
	{
		dateofclaim.sendKeys(claimdate);
	}
	
	public void setDefendantName(String defname)
	{
		defendantname.sendKeys(defname);
	}
	public void setClaimantName(String cname)
	{
		claimantname.sendKeys(cname);
	}
	public void setClaimantSolicitor(String csname)
	{
		claimantsolicitor.sendKeys(csname);
	}
	public void setReferenceNumber(String refno)
	{
		referenceno.sendKeys(refno);
	}
	public void setCustomField(String custom)
	{
		customfield.sendKeys(custom);
	}
	public void saveClaim()
	{
		savebtn.click();
	}
	public String getClaimFactsHeader()
	{
		String headerText= claimfactsheader.getText();
		return headerText;
	}
	public Boolean getAddClaimSuccessMsg()
	{
		if(successmsg = true)
			return true;
		else
			return false;
	}
}

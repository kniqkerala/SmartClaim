package com.smartclaims.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {

	WebDriver ldriver;

	//Creating a constructor for login page

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(id="Username")
	WebElement kcgusername;

	@FindBy(id="Password")
	WebElement kcgpassword;

	@FindBy(name="button")
	WebElement kcgloginbtn;
		
	@FindBy(xpath= "//*[@id=\"rightNavSection\"]/k-header-right-section/button/k-icon/img")
	WebElement Profilebtn;

	//Action methods for the three elements created

	public void setUserName(String uname)  //setting username parameter to use in testcases

	{
		kcgusername.sendKeys(uname);
	}

	public void setPassword(String password)  //setting password parameter to use in testcases

	{
		kcgpassword.sendKeys(password);
	}

	public void clickSubmit()

	{
		
		kcgloginbtn.click();
	}

}


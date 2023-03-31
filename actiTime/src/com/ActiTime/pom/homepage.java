package com.ActiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
//declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportlink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userlink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
//intialization
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getTasklink() {
		return tasklink;
	}

	public WebElement getReportlink() {
		return reportlink;
	}

	public WebElement getUserlink() {
		return userlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
}
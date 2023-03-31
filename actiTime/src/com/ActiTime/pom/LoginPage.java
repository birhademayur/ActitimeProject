package com.ActiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
//Initialization	
	public LoginPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//Utilization
	public WebElement getUntbox() {
		return untbox;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	
	
	
}

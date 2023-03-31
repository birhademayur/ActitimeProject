package com.ActiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskpage {
//declaration
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewbtn;

@FindBy(xpath = "//div[@class='item createNewCustomer']")
private WebElement createcust;

@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement createnamecust;

@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement createdesccust;

@FindBy(xpath = "//div[.='Create Customer']")
private WebElement addcust;

//initialization

public taskpage (WebDriver driver){
	PageFactory.initElements(driver, this);
}	
	
	

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public WebElement getCreatecust() {
	return createcust;
}

public WebElement getCreatenamecust() {
	return createnamecust;
}

public WebElement getCreatedesccust() {
	return createdesccust;
}

public WebElement getAddcust() {
	return addcust;
}

}
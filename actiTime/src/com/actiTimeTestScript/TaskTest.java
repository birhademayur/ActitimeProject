package com.actiTimeTestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActiTime.Generic.Library.BaseClass;
import com.ActiTime.Generic.Library.FileLibrary;
import com.ActiTime.pom.homepage;
import com.ActiTime.pom.taskpage;

public class TaskTest extends BaseClass{
@Test
public void createcoustomer () throws EncryptedDocumentException, IOException
{
	homepage hp=new homepage(driver);
	hp.getTasklink().click();
	
	taskpage tp=new taskpage(driver);
	tp.getAddnewbtn().click();;
	tp.getCreatecust().click();
	
	FileLibrary f=new FileLibrary();
	String name = f.readdatafromexcelfile("Sheet1",3 , 1);
	tp.getCreatenamecust().sendKeys(name);
	
	String des = f.readdatafromexcelfile("Sheet1", 3, 2);
	tp.getCreatedesccust().sendKeys(des);
	
	tp.getAddcust().click();
}
}

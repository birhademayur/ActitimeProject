package com.ActiTime.Generic.Library;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ActiTime.pom.LoginPage;
import com.ActiTime.pom.homepage;

public class BaseClass {
public static WebDriver driver;
FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseconnection()
	{
		Reporter.log("database connected",true);
				
	}
	@AfterSuite
	public void databasedisconnection()
	{
		Reporter.log("database disconnected",true);
		
	}

	@BeforeClass
	public void launchBrowse() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String URL =f.readDataproperty("url");
		driver.get(URL);
		Reporter.log("Browser launched",true);
	
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
		Reporter.log("Browser is closed",true);
	}
@BeforeMethod
public void login() throws IOException
{
	String UN =f.readDataproperty("username");
	String PW =f.readDataproperty("password");
	//driver.findElement(By.id("username")).sendKeys(UN);
	//driver.findElement(By.name("pwd")).sendKeys(PW);
	//driver.findElement(By.xpath("//div[.='Login ']")).click();
	LoginPage lp=new LoginPage(driver);
	lp.getUntbox().sendKeys(UN);
	lp.getPwtbx().sendKeys(PW);
	lp.getLgbtn().click();
	
	Reporter.log("Logged suscefully",true);
}
	@AfterMethod
	public void logout()
	{
		homepage hp=new homepage(driver);
		hp.getLogoutlink().click();
		//driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout scussesfully",true);
	}
	
}

package com.automatedtester.qa;

import org.testng.annotations.Test;

import com.projectpoclases.Chapter01Page;
import com.projectpoclases.HomePage;

import Base.Base;
import Base.GlobalVariables;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC001_Capter_ValidateDropdown01 {
	
	WebDriver driver;
	
    Base base;
    HomePage home;
    Chapter01Page chapter;
    String valueseleniumType;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		base= new Base (driver);
		driver=base.chromedriverConnection();
		home = new HomePage(driver);
		chapter = new Chapter01Page(driver);
		this.valueseleniumType = base.getJSONValue(this.getClass().getSimpleName(), "seleniumType");
	}

	@Test
	public void TC001() throws IOException {
		
		//STEP 001
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		//STEP 002
		home.clickChapter1();
		//STEP 003
		chapter.clickRadio();
		//STEP 004
		
		chapter.selectTypeSelenium(valueseleniumType);
		
		//STEP 005
		
		chapter.navigateHomePage();
		
				
	}

	@AfterTest
	public void afterTest() {
		//STEP 006
		base.closerBrowser();
	
	}

}

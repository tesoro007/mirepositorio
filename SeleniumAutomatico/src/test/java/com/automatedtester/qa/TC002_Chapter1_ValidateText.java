package com.automatedtester.qa;

import org.testng.annotations.Test;

import com.projectpoclases.Chapter01Page;
import com.projectpoclases.HomePage;

import Base.Base;
import Base.GlobalVariables;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC002_Chapter1_ValidateText {
	
	WebDriver driver;
	
	Base base;
	HomePage page;
    Chapter01Page chapter02;
    boolean PruebaText = true;
	  
	@BeforeTest
	  public void beforeTest() {
		base = new Base (driver);
		driver = base.chromedriverConnection();
		page = new HomePage(driver);
		chapter02 = new Chapter01Page(driver);
			
	  }
	
	@Test
  public void T002() throws IOException {
		//STEP 001
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		//STEP 002
		page.clickChapter1();
		//STEP 003
		chapter02.selectTypeSelenium("Selenium IDE");
	    //STEP 004
		
		
		//STEP 005
		page.clickHomePage();
		
		
  }
	
	

  @AfterTest
  public void afterTest() {
	//STEP 006
	 base.closerBrowser();
	  
  }

}

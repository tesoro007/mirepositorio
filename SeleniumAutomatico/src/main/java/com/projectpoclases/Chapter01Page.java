package com.projectpoclases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class Chapter01Page extends Base{

	public Chapter01Page(WebDriver driver) {
		super(driver);
		
	}
	
	By rad_unique = By.xpath("//input[@id='radiobutton']");
	By ssd_selenium=By.xpath("//select[@id='selecttype']");
	By link_homepage= By.xpath("//a[contains(text(), \"Home\")]");
	
	
	
	/**
	 * Click Radio Button
	 * @throws IOException 
	 */
	
	public void clickRadio() throws IOException {
		takeScreenshot("TC001", "Click Radio");
		reporterLog("Click Chapter 1");
		waitForElementPresent(rad_unique);
		click(rad_unique);
	}
	
	/**
	 * Select dropdown value in chapter1
	 */
	
	public void selectTypeSelenium(String seleniumValue) {
		reporterLog("Select " +seleniumValue +"from dropdown" );
		waitForElementPresent(ssd_selenium);
		selectByValueDropdown(ssd_selenium,seleniumValue );
			implicitlyWait(2);
				
		
	}
	
	public void navigateHomePage() throws IOException {
		takeScreenshot("TC001", "Navigate page");
		reporterLog ("Navigate Home Page");
		
	}

	private void selectByValue(By ssd_selenium2) {
		// TODO Auto-generated method stub
		
	}

}

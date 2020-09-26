package com.projectpoclases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class HomePage extends Base{
	/**
	 * Constructor Base clase
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
		
		
	}
	//Objects
	
	By link_chapter1= By.xpath("//a[contains(text(), 'Chapter1')]");
	By page_homepage= By.xpath("//a[contains(@href, \"/\")]");
	
	public void clickChapter1() throws IOException {
		takeScreenshot("TC001", "Click Chapter 1");
		reporterLog("Click Chapetr1");
		waitForElementPresent(link_chapter1);
		click(link_chapter1);
	}
	
	public void clickHomePage() {
		reporterLog("Click Home Page");
         waitForElementPresent(page_homepage);
         click(page_homepage);
         
	}

}


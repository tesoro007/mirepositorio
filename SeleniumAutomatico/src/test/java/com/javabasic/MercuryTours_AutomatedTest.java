package com.javabasic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocador = By.xpath("//img[@src='images/mast_register.gif']");
	
	By usernameLocator= By.id("email");
	By passwordLocator= By.name("password");
	By confirmpasswordLocator= By.cssSelector("input[name='confirmPassword']");
	By resgisterBtnLocator= By.name("submit");
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\GIT\\SeleniumAutomatico\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
		
	}

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
				
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocador).isDisplayed()) {
			
			driver.findElement(usernameLocator).sendKeys("qualityadmin");
			driver.findElement(passwordLocator).sendKeys("pass1");
			driver.findElement(confirmpasswordLocator).sendKeys("pass1");
			
			driver.findElement(resgisterBtnLocator).click();
			
		}
		
		else {
			
			System.out.print("Register page was not found ");
		}
		
	}

}

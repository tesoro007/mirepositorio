package com.javabasic;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocador = By.xpath("//img[@src='images/mast_register.gif']");
	
	By usernameLocator= By.id("email");
	By passwordLocator= By.name("password");
	By confirmpasswordLocator= By.cssSelector("input[name='confirmPassword']");
	By resgisterBtnLocator= By.name("submit");
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signInBtnLocator = By.name("submit");
	
	By homePageLocator = By.xpath("//img[@src='images/mast_flightfinder.gif']");
	

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
		

       List <WebElement> fonts = driver.findElements(By.tagName("fonts"));
	  
	  assertEquals("Note: Your user name is qualityadmin.", fonts.get(5).getText());
}

	@Test
	
	public void signIn () throws InterruptedException{
		if (driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("qualityadmin");
			driver.findElement(passLocator).sendKeys("Pass1");
			driver.findElement(signInBtnLocator).click();
			
			Thread.sleep(2000);
		assertTrue(driver.findElement(homePageLocator).isDisplayed());
		
	}
	
		else		
			System.out.println("Username textbox was no present");
		
		}
	}


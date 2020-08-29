package com.javabasic;





import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Googletests {

	private WebDriver driver;
	
	@Before
	 public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\GIT\\SeleniumAutomatico\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/www.google.com");
        
 	}

    @Test
   	public void testGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("Bolsa de trabajo OCC");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		assertEquals("Bolsa de trabajo OCC - Google Search", driver.getTitle());
		
				
	}
	

	@After
	public void tearDown() {
		driver.quit();
			
	}
	
	
}

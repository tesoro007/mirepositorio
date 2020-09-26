package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


public class Base {
    
    /**
     * Constructor WebDriver
     * @author ricardo.avalos
     * @param driver
     */
	/**
	* Get Data from JSON file (Directly)
	* @author Ricardo Avalos
	* @param jsonFile, jsonKey
	* @return jsonValue
	* @throws FileNotFoundException
	*/
	public String getJSONValue(String jsonFileObj, String jsonKey) throws FileNotFoundException {
	try {
	// JSON Data
	InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
	JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
	// Get Data
	String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
	return jsonValue;
	} catch (FileNotFoundException e){
	Assert.fail("JSON file is not found");
	return null;
	}
	}
	private WebDriver driver;
    
    public Base(WebDriver driver) {
        this.driver = driver;        
    }
    
    /**
     * Chrome driver connection
     * @author ricardo.avalos
     * @param
     */
    
    public WebDriver chromedriverConnection() {
        System.setProperty(GlobalVariables.CHROME_DRIVER_NAME,GlobalVariables.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        return driver;
    }
    
    /**
     * Launch Browser
     * @author ricardo.avalos
     * @param url
     * @throws IOException 
     */
    
    public void launchBrowser(String url) throws IOException {
    	takeScreenshot("TC001", "Launch Browser");
        reporterLog("Launch Browser "+ url);
        driver.get(url);
        driver.manage().window().maximize();
        implicitlyWait(5);        
    }
    
    /**
     * Reporter log
     * @author ricardo.avalos
     */
    
    public void reporterLog(String log) {
        Reporter.log(log);
    }
    
    /**
     * Implicitly Wait
     * @author ricardo.avalos
     */
    
    public void implicitlyWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

 /**
  * Click Objet
  * Reporter log
  * @author ricardo.avalos
  
  */
    
    public void click (By locator) {
    	driver.findElement(locator).click();
        }
    /**
     * Wait for element present
     * @author ricardo.avalos
     */
    
    public void waitForElementPresent(By locator) {
    	try {
    	WebDriverWait wait= new WebDriverWait(driver,15);
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    	    	
    }catch (TimeoutException e){
    	reporterLog("Time out error");
    	
    }
    }
    
    public void selectByValueDropdown(By locator, String Value) {
    	waitForElementPresent(locator);
    	WebElement element=driver.findElement(locator);
    	Select dropdown= new Select(element);
    	dropdown.selectByValue(Value);
    	
    }
    
    public void closerBrowser() {
    	try {
    		reporterLog("Closer Browser");
    		driver.close();
    	}catch (NoSuchSessionException e) {
    		reporterLog("Closing Browser failed");
    	}
    	
    }
    
    /**
     * Take screenshot
     * @author Ricardo Avalos
     * @param locator
     * @return locator
     * @throws IOException
     */
     public void takeScreenshot(String testcase, String fileName) throws IOException{
     try {
     Screenshot screenshot = new AShot().takeScreenshot(driver);
     ImageIO.write(screenshot.getImage(),"PNG",new File("./test-output/screenshots/"+testcase+"/"+fileName+".png"));
     } catch (IOException e){
     System.out.println(e.getMessage());
      } 
     
     }
    

}
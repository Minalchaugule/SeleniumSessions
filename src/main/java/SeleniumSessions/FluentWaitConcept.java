package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		   
		   By email=By.id("input-email");
		   waitForElementVisibleWithFluentWait(email,10,2).sendKeys("Testing");
		   
//		   Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				    				.withTimeout(Duration.ofSeconds(10))
//				    					.pollingEvery(Duration.ofSeconds(2))
//				    						.ignoring(NoSuchElementException.class)
//				    							.withMessage("Element is not found after waiting till timeout.. " +email);
//		   wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("minal");
//		   
		  
	}
	
	/**
	 * Fluent wait for element visible
	 * @param locator
	 * @param timeOut
	 * @param PollingTimeOut
	 * @return
	 */
	
	public static WebElement waitForElementVisibleWithFluentWait(By locator,int timeOut,int PollingTimeOut)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(PollingTimeOut))
						.ignoring(NoSuchElementException.class)
							.withMessage("Element is not found after waiting till timeout.. " +locator);
		
      return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * Fluent wait for element present
	 * @param locator
	 * @param timeOut
	 * @param PollingTimeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresenceWithFluentWait(By locator,int timeOut,int PollingTimeOut)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(PollingTimeOut))
						.ignoring(NoSuchElementException.class)
							.withMessage("Element is not found after waiting till timeout.. " +locator);
		
      return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * Fluent wait for Alert Present
	 * @param locator
	 * @param timeOut
	 * @param PollingTimeOut
	 * @return
	 */
	public static Alert waitForJSAlertWithFluentWait(int timeOut,int PollingTimeOut)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(PollingTimeOut))
						.ignoring(NoAlertPresentException.class)
							.withMessage("Timeout is done.. No JS Alert found...");
		
      return wait.until(ExpectedConditions.alertIsPresent());
	}

}

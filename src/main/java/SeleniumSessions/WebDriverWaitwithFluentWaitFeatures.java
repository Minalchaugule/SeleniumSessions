package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitwithFluentWaitFeatures {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		waitForElementAndEnterValue(email, 10, 2, "prishac@gmail.com");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(2))
//			.ignoring(NoSuchElementException.class)
//				.withMessage("Element is not found with this locator" +email);
//		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("Testing");
//
//		
	}
	/**
	 * WebDriver wait util for fluent wait feature for element and enter value
	 * @param locator
	 * @param timeOut
	 * @param PollingTimeOut
	 * @param value
	 */
	
	public static void waitForElementAndEnterValue(By locator,int timeOut,int PollingTimeOut,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait
			.pollingEvery(Duration.ofSeconds(PollingTimeOut))
				.ignoring(NoSuchElementException.class)
					.withMessage("Element is not found with this locator..." +locator)
						.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(value);
		
	}
	
	/**
	 * WebDriver wait util for fluent wait feature for element and click
	 * @param locator
	 * @param timeOut
	 * @param PollingTimeOut
	 * @param value
	 */
	
	public static void waitForElementAndClick(By locator,int timeOut,int PollingTimeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait
			.pollingEvery(Duration.ofSeconds(PollingTimeOut))
				.ignoring(NoSuchElementException.class)
					.withMessage("Element is not found with this locator..." +locator)
						.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		
	}

}

package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforElements implements xt {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		   driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		  By country=By.name("Country");
		  
			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			List<WebElement>countryList= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(country));
			System.out.println(countryList.size());
			for(WebElement e:countryList)
			{
				String text=e.getText();
				System.out.println(text);
			}
		
	}
	/** 
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static List<WebElement> waitForWebElements(By locator,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	/**
	 * An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static List<WebElement> waitForWebElementsVisible(By locator,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	

}

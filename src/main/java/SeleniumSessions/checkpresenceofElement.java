package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkpresenceofElement {
	
static WebDriver driver;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	By username= By.name("username");
	By password=By.name("password");
			By login_btn=By.xpath("//button[@type='submit']");
			By forgot_link=By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
			
			waitForElementPresence(username,20).sendKeys("Prisha");
			
			//waitForElementPresence(forgot_link,10).click();
			waitForElementVisible(forgot_link,10).click();
			
//			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement un=wait.until(ExpectedConditions.presenceOfElementLocated(username));
//			un.sendKeys("admin");
			driver.findElement(password).sendKeys("Admin");
			driver.findElement(login_btn);
		driver.findElement(forgot_link).click();
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator ,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementVisible(By locator,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}

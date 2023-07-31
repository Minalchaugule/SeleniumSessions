package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// create WebElement +perform actions(click,sendkeys,gettext,is displayed)
		
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
		//driver.findElement(By.id("input-email")).sendKeys("minal.chaugule88@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Password@123");
		
		//2.
//		WebElement emailID=driver.findElement(By.id("input-email"));
//		WebElement Password=driver.findElement(By.id("input-password"));
//		
//	emailID.sendKeys("Minalpatil@gmail.com");
//	Password.sendKeys("Minal@123");
//	emailID.sendKeys("prisha.chaugule@gmail.com");
	
	//3. Bylocator
	//maintaining by locator
//	By email_id=By.id("input-email");
//	By password=By.id("input-password");
//	
//	//create webelement
//	WebElement emailId=driver.findElement(email_id);
//	WebElement pwd=driver.findElement(password);
//	emailId.sendKeys("minal.chaugule88@gmail.com");
//	pwd.sendKeys("Password@123");
		
		//4.By locator with web element generic method
//		By email_id=By.id("input-email");
//     	By password=By.id("input-password");
//     	getElement(email_id).sendKeys("minal.chaugule88@gmail.com");
//     	getElement(password).sendKeys("Password@123");
		
		//5.By locator with web element and actions generic method
//		By email_id=By.id("input-email");
//		By password=By.id("input-password");
//		dosendKeys(email_id,"minal.chaugule88@gmail.com");
//		dosendKeys(password,"Password@123");
		
		//6.By locator with web element and actions generic method in utility class
		By email_id=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.dosendKeys(email_id,"minal.chaugule88@gmail.com");
		eleutil.dosendKeys(password,"Password@123");
		
		//7.By locator with web element and actions generic method in utility class
		//with a test/called class brutil and elementutil
		
	}
	public static void dosendKeys(By locator ,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
		
	}

}

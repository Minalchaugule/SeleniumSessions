package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
   Thread.sleep(3000);
   By emailID=By.id("input-email");
   By password=By.id("input-password");
   By loginbtn=By.xpath("//input[@value='Login']");
   
  // Actions act=new Actions(driver);
//   act.sendKeys(driver.findElement(emailID),"minal.chaugule88@gmail.com").perform();
//   act.sendKeys(driver.findElement(password),"Password@123").perform();
//   act.click(driver.findElement(loginbtn)).perform();
   DoActionsSendKeys(emailID,"minal.chaugule88@gmail.com");
   DoActionsSendKeys(password,"Password@123");
   DoActionsClick(loginbtn);
	}
	
	 public static  WebElement getElement(By locator)
		{
			return driver.findElement(locator);
			}
	 
	
	public static void DoActionsSendKeys(By locator,String value)
	{
		Actions act=new Actions(driver);
		act.sendKeys((getElement(locator)),value).perform();
	}
	
	public static void DoActionsClick(By locator)
	{
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CustomException.FrameworkException;

public class sXpathPractice {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    driver=new ChromeDriver();
	   driver.get("https://www.rightmove.co.uk/");
	   Thread.sleep(3000);
	   By signinLink= By.xpath("//button[text()='Sign in']");
	   By username=By.cssSelector("input#email-input");
	   By password=By.cssSelector("input#password-input");
	   By checkbox=By.cssSelector("div.keepMeSignedIn");
	   By signin_btn=By.xpath("//button[@id='submit']");
	   
	   doClick(signinLink);
	   dosendKeys(username,"minal.chaugule88@gmail.com");
	   dosendKeys(password,"Minal@123");
	   doClick(checkbox);
	   doClick(signin_btn);
		}
		
	   
	   public static WebElement getElement(By locator)
		{
			
			WebElement element= driver.findElement(locator);
			return element;
		}
	   
	   public static void dosendKeys(By locator ,String value)
		{
			if(value==null)
			{
				System.out.println("Value cannot use null in dosendKeys method ");
				throw new FrameworkException("VALUECAN'TBENULL");
			}
			getElement(locator).sendKeys(value);
		}
		
		//click method
		public static void doClick(By locator)
		{
			getElement(locator).click();
		}
		
		
}

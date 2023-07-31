package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EntervalueindisableTextfield {
	

static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		 
		 By fn_name=By.id("fname");
		 By pwd=By.id("pass");//disabled
		 
		 driver.findElement(fn_name).sendKeys("Minal");
		 //driver.findElement(pwd).sendKeys("Minal");//org.openqa.selenium.ElementNotInteractableException
		 
		 boolean enableflag=driver.findElement(pwd).isEnabled();
		 System.out.println(enableflag);
		 
		 boolean displayflag=driver.findElement(pwd).isDisplayed();
		 System.out.println(displayflag);
		 
		String disabled_val= driver.findElement(pwd).getAttribute("disabled");
		System.out.println(disabled_val);
		 
//		 Boolean flag=elementIsEnabled(pwd);
//		 System.out.println(flag);
		 
	}
	
	public static boolean elementIsEnabled(By locator)
	{
		//return getElement(locator).isEnabled();
		String disabled_val= driver.findElement(locator).getAttribute("disabled");
		if(disabled_val.equals("true"))
		{
			return true;
		}
		return false;
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	

}

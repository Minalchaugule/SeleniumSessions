package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  driver=new ChromeDriver();
  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
  
  By registerHeader=By.tagName("h1");
  By forgotpwd= By.linkText("Forgotten Password");
  
  
  String registerText=doElementGetText(registerHeader);
  System.out.println(registerText);
  System.out.println(doElementGetText(forgotpwd));
  
  //is displayed
 Boolean flag=driver.findElement(forgotpwd).isDisplayed();
 System.out.println(flag);
 
 if(checkElementIsDisplayed(registerHeader))
 {
	 System.out.println("registerHeader is displayed");
	 String registerheaderText=doElementGetText(registerHeader);
	 if(registerheaderText.equalsIgnoreCase("Register Account"))
	 {
		 System.out.println("Register account---Pass");
	 }
	 else
	 {
		 System.out.println("Register account---Fail");	 
	 }
	 
 }
  
  }
	
	public static boolean checkElementIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
		 
	}
	
	public static String doElementGetText(By locator)
	{
		String text=getElement(locator).getText();
		System.out.println("Element text is : " +text);
		return text;
		
	}
	
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}

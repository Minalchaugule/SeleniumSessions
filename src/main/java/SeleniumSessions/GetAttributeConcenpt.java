package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcenpt {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  driver=new ChromeDriver();
  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
  
  
  By forgotpwd= By.linkText("Forgotten Password");
  By f_name=By.id("input-firstname");
  By logo_image=By.className("img-responsive");
  
//  String forgot_href=driver.findElement(forgotpwd).getAttribute("href");
//  System.out.println(forgot_href);
//  String fname_href=driver.findElement(f_name).getAttribute("placeholder");
//  System.out.println(fname_href);
  
  String titlevalue=driver.findElement(logo_image).getAttribute("title");
  System.out.println(" logo image attribute value "+titlevalue);
  
  String altvalue=driver.findElement(logo_image).getAttribute("alt");
  System.out.println(" logo image attribute value "+altvalue);
  
  
  String attribute=GetElementAttribute(forgotpwd,"href");
  System.out.println(attribute);
  
  
  

	}
	
	public static String GetElementAttribute(By locator,String attribute)
	{
		return getElement(locator).getAttribute(attribute);
	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}

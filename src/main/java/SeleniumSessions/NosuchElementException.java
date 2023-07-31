package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NosuchElementException {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		  
		  
		  By forgotpwd= By.linkText("Forgotten Password1");//nosuchelementfoundexception
		  try {
		 driver.findElement(forgotpwd).click();
		  }
		  catch(NoSuchElementException e)
		  {
			  System.out.println("Getting element exeption...plz check locator");
			  e.printStackTrace();
		  }
   System.out.println(driver.getTitle());
}
}
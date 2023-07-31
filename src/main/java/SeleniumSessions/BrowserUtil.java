package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;

public class BrowserUtil {
	
	 private WebDriver driver;//private variable cant be referred in other classes -encapsulation 
		
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("Browser name is :"+browserName);
		
		if(browserName==null)
		{
			System.out.println("Browser cannot be null");
			throw new FrameworkException("BrowserCantbeNuLL");
		}
		
		switch (browserName) 
		{
		case "Chrome":
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			driver=new FirefoxDriver();
			break;
			
		case "Edge":
			driver=new EdgeDriver();
			break;
			
		case "Safari":
			driver=new SafariDriver();
			break;
		
		default:
			System.out.println("Plz pass correct browser name :"+browserName);
			throw new FrameworkException("Invalid Browser");
			
		}
		return driver;
		
	}
	
	public void enterURL(String url)
	{
		if(url.contains("http"))
		{
			driver.get(url);
		}
		else {
			throw new FrameworkException("Invalid URL");
		}
	}
	//enterurl method overloaded
	//as in beolw method using URL class as paramter ,we need to convert tht url to string to apply if else condition,
	//hence String wrapper class is used
	
	public void enterURL(URL url)
	{
		if((String.valueOf(url)).contains("http"))
		{
			driver.navigate().to(url);
		}
		else {
			throw new FrameworkException("Invalid URL");
		}
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}

}




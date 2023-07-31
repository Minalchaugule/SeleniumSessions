package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		EdgeDriver driver=new EdgeDriver();
		
		//enter url
	driver.get("https://google.com");
	
	//get pagetitle
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Google"))
	{
		System.out.println("Correct title");
	}
	else
	{
		System.out.println("Incorrect title");	
	}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.quit();

	}

}

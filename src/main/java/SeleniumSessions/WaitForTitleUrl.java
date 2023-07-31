package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		   driver.get("https://classic.crmpro.com/");
		   
		   //wait for title 
//		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		  if( wait.until(ExpectedConditions.titleContains("Free CRM")))
//		  {
//			  System.out.println(driver.getTitle());
//			  
//		  }
		  String title=waitForTitleContains("Free CRM",5);
		  System.out.println(title);
		  waitForTitleIs("Free CRM - CRM software for customer relationship management, sales, and support.",10);
			  	   
		   
}
	
	public static String waitForTitleContains(String titleFractionValue,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleContains(titleFractionValue)))
		 {
			 return driver.getTitle();
		 } else{
			 System.out.println(titleFractionValue +"title value is not present...");
			 return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleFractionValue +" Exception -title value is not present...");
			 return null;
		}
	}
	
	
	public static String waitForTitleIs(String titleValue,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleIs(titleValue)))
		 {
			 return driver.getTitle();
		 }
		 else
		 {
			 System.out.println(titleValue +"title value is not present...");
			 return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleValue +" Exception -title value is not present...");
			 return null;
		}
		 
		 
		   
}
}
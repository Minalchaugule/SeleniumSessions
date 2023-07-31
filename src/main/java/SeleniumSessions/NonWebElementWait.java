package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NonWebElementWait {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("Free CRM")))
//		{
//		System.out.println(driver.getTitle());
//		}
	}
	
	public static String waitforTitleContains(String titleFraction,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(titleFraction)))
		{
		return driver.getTitle();
		}
		else
		{
			System.out.println(titleFraction +"Title is not aailable");
			return null;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleFraction +"Title is not aailable");
			return null;	
		}
}
	
	//title
	
	public static String waitforTitleIs(String titleValue,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleIs(titleValue)))
		{
		return driver.getTitle();
		}
		else
		{
			System.out.println(titleValue +"Title is not aailable");
			return null;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleValue +"Title is not aailable");
			return null;	
		}
	}
		
		public  String waitforURLContains(String urlFraction,int timeOut)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			try {
			if(wait.until(ExpectedConditions.titleContains(urlFraction)))
			{
			return driver.getTitle();
			}
			else
			{
				System.out.println(urlFraction +"Title is not aailable");
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(urlFraction +"Title is not aailable");
				return null;	
			}
		}

		//Wait for exact title

		public  String waitforurlIs(String urlValue,int timeOut)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			try {
			if(wait.until(ExpectedConditions.urlToBe(urlValue)))
			{
			return driver.getTitle();
			}
			else
			{
				System.out.println(urlValue +"URL is not aailable");
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(urlValue +"URL is not aailable");
				return null;	
			}
}
}

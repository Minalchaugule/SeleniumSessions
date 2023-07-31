package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CustomException.FrameworkException;

public class GoogleSearchTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		 driver.get("https://google.com");
		 Thread.sleep(5000);
		 
		By searchboxLocator=By.name("q");
		By suggestLocator=By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span");
		doSearch(searchboxLocator,suggestLocator,"Naveen Automation Labs","youtube");
	}
	
	public static void doSearch(By searchLocator,By suggLocator,String searchKey,String suggName  ) throws InterruptedException
	{
		
		dosendKeys(searchLocator,searchKey);
		 Thread.sleep(5000);
		 List <WebElement> suggList=getElements(suggLocator);
		 System.out.println(suggList.size());
		 
		 for(WebElement e: suggList)
		 {
			 String text=e.getText();
			 System.out.println(text);
			 if(text.contains(suggName))
			 {
				 e.click();
				 break;
			 }
		 }
		
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
	
	public static  WebElement getElement(By locator)
	{
		WebElement element=null;
		try
		{
		element= driver.findElement(locator);
		}
		catch(NoSuchElementException e)
		  {
			  System.out.println("Getting element exeption...plz check locator");
			  e.printStackTrace();
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  element= driver.findElement(locator);
		  }
		return element;
	}
	
	public static  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

}

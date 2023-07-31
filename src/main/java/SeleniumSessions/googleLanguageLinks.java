package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		By langLink= By.xpath("//div[@id='SivCob']/a");
		
		ClickonElement(langLink,"Marathi");
		
	}
	
	public static void ClickonElement(By locator,String linkText)
	{
		List<WebElement> lanlinkList=driver.findElements(locator);
		
	      System.out.println("toal no of links"+lanlinkList.size());
	      
	      for(WebElement e:lanlinkList)
	      {
	    	  String text=e.getText();
	    	  System.out.println(text);
	    	  if(text.equals(linkText))
	    	  {
	    		  e.click();
	    		  break;
	    	  }
	      }
	}
	


}

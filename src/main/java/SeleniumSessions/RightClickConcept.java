package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
   Thread.sleep(3000);
 
  
By rightClickLocator=By.xpath("//span[text()='right click me']");
// Actions act=new Actions(driver);
// act.contextClick(rightClickEle).perform();
// List<WebElement>optionList=driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
// for(WebElement e :optionList)
// {
//	 String text=e.getText();
//	 System.out.println(text);
//	 if(text.equals("Copy"))
//	 {
//		 e.click();
//		 break;
//	 }
//	}
 //driver.findElement(By.xpath("//span[text()='Copy']")).click();

selectrightClickOptions(rightClickLocator,"Edit");
}
	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		}
	
	public static void selectrightClickOptions(By conTextClickLocator,String optionValue)
	{
		 Actions act=new Actions(driver);
		 act.contextClick(getElement(conTextClickLocator)).perform();	
		 By optionClick=By.xpath("//*[text()='"+optionValue+"']");
		 getElement(optionClick).click();
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import done manually as it is static
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;
//selenium 4X feature
         // above
//left----ele-----right
//below

public class RelativeLocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 driver=new ChromeDriver();
	   driver.get("https://www.aqi.in/dashboard/canada");
	   Thread.sleep(3000);
	   WebElement ele=driver.findElement(By.linkText("Brampton, Canada"));
       Actions act=new Actions(driver);
       
       //right of element
       String righttext=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
       System.out.println(righttext);
       
       //left of ele
       String lefttext=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
       System.out.println(lefttext);
       
       //above the ele
       String abovetext=driver.findElement(with(By.tagName("p")).above(ele)).getText();
       System.out.println(abovetext);
       
       //below of the ele
       String belowtext=driver.findElement(with(By.tagName("p")).below(ele)).getText();
       System.out.println(belowtext);
       
       //near of ele
       String nearcity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
       System.out.println(nearcity);
       
       //find multiple ele
      List<WebElement>citylist= driver.findElements(with(By.tagName("P")).below(ele));
      System.out.println(citylist.size());
      
      List<WebElement>belowcitylist= driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']//p")).below(ele));
      System.out.println(belowcitylist.size());
      for(WebElement e:belowcitylist)
      {
    	  String text=e.getText();
    	  System.out.println(text);
      }
       
	}

}

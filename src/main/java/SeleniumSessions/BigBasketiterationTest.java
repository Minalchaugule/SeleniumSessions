package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketiterationTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://www.bigbasket.com/");
   
   
   
   WebElement menu=driver.findElement(By.xpath("//a[@qa='categoryDD']"));
   Actions act=new Actions(driver);
   act.moveToElement(menu).perform();
   
   Thread.sleep(2000);
   List <WebElement>Level1List=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
   for(WebElement e:Level1List)
   {
	  act.moveToElement(e).build().perform();
	  String text=e.getText();
	  System.out.println(text);
   
   Thread.sleep(2000);
   List <WebElement>Level2List=driver.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]//a"));
   
   for(WebElement e1:Level2List)
   {
	   act.moveToElement(e1).build().perform();
	  String level2text=e1.getText();
	  System.out.println(level2text);
	  
	  
	  Thread.sleep(2000);
	   List <WebElement>Level3List=driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));
	   
	   for(WebElement e2:Level3List)
	   {
		   act.moveToElement(e2).build().perform();
		  String level3text=e2.getText();
		  System.out.println(level3text);
	   }
   }
   }
//  
   
//   public static  WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//		}
//
//public static WebElement getLinkByText(String LinkText)
//{
//	 return driver.findElement(By.linkText(LinkText));
//}

//public static void selectMulti4LevelDropdownHandle(By level1Locator,String level2,String level3,String level4) throws InterruptedException
//{
//	 Actions act=new Actions(driver);
//	 act.moveToElement(getElement(level1Locator)).perform();
//	   Thread.sleep(2000);
//	   act.moveToElement(getLinkByText(level2)).perform();
//	   Thread.sleep(1500);
//	   act.moveToElement(getLinkByText(level3)).perform();
//	   Thread.sleep(1500);
//	  getLinkByText(level4).click();
//}



	}
   

}

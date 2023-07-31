package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//need to freeze angular dropdown -as it is not able to inspect
		//click on resources in the console and Fun+F8 for chrome

public class BigBasketMultilevelMenuHandle {


		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    driver=new ChromeDriver();
	   driver.get("https://www.bigbasket.com/");
	   Thread.sleep(3000);
	   
//	   WebElement level1=driver.findElement(By.xpath(""));
//	   Actions act=new Actions (driver);
//	   act.moveToElement(level1).perform();
//	   Thread.sleep(3000);
//	   
//	   WebElement level2=driver.findElement(By.xpath(""));
//	   act.moveToElement(level2).perform();
//	   Thread.sleep(3000);
//	   
//	   WebElement level3=driver.findElement(By.xpath(""));
//	   act.moveToElement(level3).perform();
//	   Thread.sleep(3000);
//	   
//	   WebElement level4=driver.findElement(By.xpath(""));
//	   act.moveToElement(level4).click();
//	   
	   By level1=By.xpath("//a[@qa='categoryDD']");
	   //selectMulti4LevelDropdownHandle(level1,"Beverages","Tea","Green Tea");
	   selectMulti4LevelDropdownHandle(level1,"Beauty & Hygiene","Skin Care","Lip Care");
	  }
		
		 public static  WebElement getElement(By locator)
			{
				return driver.findElement(locator);
				}
		 
		 public static WebElement getLinkByText(String LinkText)
		 {
			 return driver.findElement(By.linkText(LinkText));
		 }
		 
		 public static void selectMulti4LevelDropdownHandle(By level1Locator,String level2,String level3,String level4) throws InterruptedException
		 {
			 Actions act=new Actions(driver);
			 act.moveToElement(getElement(level1Locator)).perform();
			   Thread.sleep(1500);
			   act.moveToElement(getLinkByText(level2)).perform();
			   Thread.sleep(1500);
			   act.moveToElement(getLinkByText(level3)).perform();
			   Thread.sleep(1500);
			  getLinkByText(level4).click();
		 }
		 
		 public static void selectMulti3LevelDropdownHandle(By level1Locator,String level2,String level3) throws InterruptedException
		 {
			 Actions act=new Actions(driver);
			 act.moveToElement(getElement(level1Locator)).perform();
			   Thread.sleep(1500);
			   act.moveToElement(getLinkByText(level2)).perform();
			   Thread.sleep(1500);
			  getLinkByText(level3).click();
		 }

}

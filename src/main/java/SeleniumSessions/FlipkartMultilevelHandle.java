package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMultilevelHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
//	   Thread.sleep(3000);
//	   WebElement level1=driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));
//	   Actions act=new Actions(driver);
//	   act.moveToElement(level1).perform();
//	   Thread.sleep(3000);   
//	   
//	   WebElement level2=driver.findElement(By.linkText("Food & Drinks"));
//	   Actions act1=new Actions(driver);
//	   act1.moveToElement(level2).perform();
//	   Thread.sleep(3000); 
//	   
//	   WebElement level3=driver.findElement(By.linkText("Beverages"));
//	   Actions act2=new Actions(driver);
//	   act1.moveToElement(level3).click().perform();
//	   Thread.sleep(3000);  
	   
	   By level1loc=By.xpath("//img[@alt='Beauty, Toys & More']");
	   getMultilevelActions(level1loc,"Food & Drinks","Beverages");
	 }
	
	public static WebElement getElement(By locator)
	
	{
		return driver.findElement(locator);
	}
	
	public static WebElement getElementbyLinkText(String LinkText)
	{
		return driver.findElement(By.linkText(LinkText));
	}
	
	public static void getMultilevelActions(By level1locator,String level2 ,String level3) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level1locator)).perform();
		Thread.sleep(3000);  
		act.moveToElement(getElementbyLinkText(level2)).perform();
		Thread.sleep(3000);  
		act.moveToElement(getElementbyLinkText(level3)).click().perform();
	}
}
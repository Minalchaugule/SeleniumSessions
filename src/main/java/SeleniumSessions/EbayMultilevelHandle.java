package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayMultilevelHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 driver=new ChromeDriver();
	   driver.get("https://www.ebay.co.uk/");
       Thread.sleep(3000);
	   
//	  WebElement level1=driver.findElement(By.xpath("//button[text()=' Shop by category']"));
//	  Actions act=new Actions(driver);
//	  act.moveToElement(level1).click().perform();
//
//	  WebElement level2=driver.findElement(By.linkText("Coins"));
//	  Actions act1=new Actions(driver);
//	  act1.moveToElement(level2).click().perform();
       
       By levelloc=By.xpath("//button[text()=' Shop by category']");
     
       
       clicklevel2Options(levelloc,"Garden");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static WebElement getElementUsingText(String value)
	{
		return driver.findElement(By.linkText(value));
	}
	
	public static void clicklevel2Options(By level1locator ,String level2Value)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level1locator)).click().perform();
		act.moveToElement(getElementUsingText(level2Value)).click().perform();
	}

}
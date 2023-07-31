package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("http:mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
   Thread.sleep(3000);
  // WebElement content_menu=driver.findElement(By.className("menulink"));
   
//   Actions act=new Actions(driver);
//   act.moveToElement(content_menu).perform();
   //act.moveToElement(content_menu).build().perform();
   Thread.sleep(1500);
   
   By content_menu=By.className("menulink");
   By level2Menuoption=By.linkText("COURSES");
   //driver.findElement(By.linkText("COURSES")).click();
   twoLevelMenuHandling(content_menu,level2Menuoption);
	}
	
	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		}
	
	public static void twoLevelMenuHandling(By Level1Menulocator,By Level2MenuLocator) throws InterruptedException
	{
		Actions act=new Actions(driver);
		   act.moveToElement(getElement(Level1Menulocator)).perform();
		   Thread.sleep(2000);
		   getElement(Level2MenuLocator).click();
	}

}

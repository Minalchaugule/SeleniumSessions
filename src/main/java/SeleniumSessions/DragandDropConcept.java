package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://jqueryui.com/resources/demos/droppable/");
   Thread.sleep(3000);
   WebElement source_ele=driver.findElement(By.id("draggable"));
   WebElement target_ele=driver.findElement(By.id("droppable"));
   
   Actions act=new Actions(driver);
   act.dragAndDrop(source_ele, target_ele).build().perform();
   act.clickAndHold(source_ele).moveToElement(target_ele).release().build().perform();
	}

}

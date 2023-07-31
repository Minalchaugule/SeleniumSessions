package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import done manually as it is static
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selectorhubrelativeloc {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://selectorshub.com/xpath-practice-page/");
   
   WebElement ename=driver.findElement(By.linkText("Joe.Root"));
   Actions act=new Actions(driver);
   
   //above of ele
   String aboveText=driver.findElement(with(By.linkText("Jasmine.Morgan")).above(ename)).getText();
   System.out.println(aboveText);
   
   
   //below of ele
   String belowText=driver.findElement(with(By.linkText("John.Smith")).below(ename)).getText();
   System.out.println(belowText);
   
   //right of ele
   Thread.sleep(2000);
   String rightText=driver.findElement(with(By.xpath("//a[text()='Joe.Root']//parent::td/following-sibling::td[1]")).toRightOf(ename)).getText();
   System.out.println(rightText);


	}

}

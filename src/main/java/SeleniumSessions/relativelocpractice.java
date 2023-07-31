package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativelocpractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
   
   WebElement fname=driver.findElement(By.xpath("//label[@for='input-firstname']"));
   Actions act=new Actions(driver);
   
   //right of ele
   driver.findElement(with(By.id("input-firstname")).toRightOf(fname)).sendKeys("minal");
   
   //below of ele
  String text= driver.findElement(with(By.xpath("//label[@for='input-lastname']")).below(fname)).getText();
   System.out.println(text);
   
   //left of ele
   String ltext=driver.findElement(with(By.xpath("//legend[text()='Your Personal Details']")).above(fname)).getText();
   System.out.println(ltext);
   
   Thread.sleep(3000);
   WebElement check=driver.findElement(By.xpath("//label[@class='radio-inline']//input"));
   driver.findElement(with(By.xpath("(//input[@name='newsletter'])[1]")).toLeftOf(check)).click();
	}

}

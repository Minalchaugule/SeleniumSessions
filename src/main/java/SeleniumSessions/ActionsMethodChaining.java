package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChaining {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
   Thread.sleep(3000);
   WebElement fn=driver.findElement(By.id("input-firstname"));
  
   Actions act=new Actions(driver);
act.sendKeys(fn,"Prisha")
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys("chaugule")
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys("mnlptl84@gmail.com")
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys("93456745678")
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys("Prisha@123")
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys("Prisha@123")
.pause(1000)
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys(Keys.TAB)
.pause(1000)
.sendKeys(Keys.SPACE)
.build()
.perform();

	}

}

package SeleniumSessions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyswithPauseConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
   Thread.sleep(3000);
   WebElement fn=driver.findElement(By.id("input-firstname"));
  
   Actions act=new Actions(driver);
   
   String value="NaveenAutomationLabs";
   String lastname="Chaugule";
   String emailID="mnlptl84@gmail.com";
   //converting string into char array
   char[] ch=value.toCharArray();
   
   for(int i=0;i<ch.length;i++)
   {
	   //converting ch to string as sendkeys allow only string
	   act.sendKeys(fn,String.valueOf(ch[i])).pause(150).perform();
   }
   act.sendKeys(Keys.TAB);
   
char[] ch1=lastname.toCharArray();
   
   for(int i=0;i<ch1.length;i++)
   {
	   //converting ch to string as sendkeys allow only string
	   act.sendKeys(String.valueOf(ch1[i]+" ")).pause(150).perform();
   }
   act.sendKeys(Keys.TAB);
   
char[] ch2=emailID.toCharArray();
   
   for(int i=0;i<ch2.length;i++)
   {
	   //converting ch to string as sendkeys allow only string
	   act.sendKeys(String.valueOf(ch2[i]+"_")).pause(150).perform();
   }

	}

}

package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopupHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// JS alets/modal dialog
		//1.alerts 2.confirmation 3 Prompt
		
    driver=new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
   
   //alert
   driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
   Thread.sleep(2000);
  Alert alt= driver.switchTo().alert();
  String text=alt.getText();
  System.out.println(text);
  alt.accept();
 // alt.dismiss();NoAlertPresentException
  
  //2.confirm- two buttons cancel/ok or yes/no
  
  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
  Thread.sleep(2000);
  Alert alt1=driver.switchTo().alert();
  String atext=alt1.getText();
  System.out.println(atext);
  alt1.accept();
  
  //prompt -one textbox and one button
  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
  Thread.sleep(2000);
  Alert alert=driver.switchTo().alert();
  String alertText=alert.getText();
  System.out.println(alertText);
  alert.sendKeys("Test Automation");
  alert.accept();
  String confirmText=driver.findElement(By.xpath("//p[@id='result']")).getText();
  System.out.println(confirmText);
  String actmsg=confirmText.split(":")[1].trim();
  System.out.println(actmsg);
  
  
   
  
   
   

	}

}

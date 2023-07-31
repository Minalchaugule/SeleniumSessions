package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignatuireActions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 driver=new ChromeDriver();
	   driver.get("https://signature-generator.com/draw-signature/");
	   Thread.sleep(3000);
	   WebElement canvas=driver.findElement(By.id("signature-pad"));
       Actions act=new Actions(driver);
	   Actions signature=(Actions) act.click(canvas).moveToElement(canvas,30,10)
			   .clickAndHold()
			   .moveToElement(canvas,-200,-50)
			   .moveByOffset(50,-50)
			   .moveByOffset(50,-50)
			   .moveByOffset(3,3)
			   .release(canvas)
			   .build();
	   
	   signature.perform();

	}

}

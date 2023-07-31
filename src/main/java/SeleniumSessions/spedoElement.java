package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spedoElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			Thread.sleep(2000);
			//js -return keyword is appended as we need return something
			String script="return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')";
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String mand_text=js.executeScript(script).toString();
			System.out.println(mand_text);
			if(mand_text.contains("*"))
{
System.out.println("ele is mandatory");	
}
			
	}

}

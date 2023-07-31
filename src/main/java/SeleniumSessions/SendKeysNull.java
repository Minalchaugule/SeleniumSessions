package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysNull {
 static WebDriver driver;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		 By fn_name=By.id("input-firstname");
		 
		//driver.findElement(fn_name).sendKeys(null);//java.lang.IllegalArgumentException
		//driver.findElement(fn_name).sendKeys("");
		//driver.findElement(fn_name).sendKeys(" ");
		//driver.findElement(fn_name).sendKeys(123);//char sequence -is a interface is in java and string ,string buffer and string builder are the child of interface

		 String str="Naveen";
		 StringBuilder sb= new StringBuilder("Automation");
		 StringBuffer st=new StringBuffer("Labs");
		  
		 
		 driver.findElement(fn_name).sendKeys(str+" "+sb+" "+st);
	}

}

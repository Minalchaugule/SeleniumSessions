package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextfield {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		 By fn_name=By.id("input-firstname");
		 
		 //to fetch value which has entered we need to use getattribute method and need to pass "value"
         //as attribute		 
		 driver.findElement(fn_name).sendKeys("Minal");
		 String field_val=driver.findElement((fn_name)).getAttribute("value");
		 System.out.println(field_val);
		 
	}
	
	
	
	


}

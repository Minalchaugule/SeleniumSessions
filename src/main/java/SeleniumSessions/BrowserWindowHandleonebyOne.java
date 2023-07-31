package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleonebyOne {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
		 String parentwindowId=driver.getWindowHandle();
		 
		 Set <String>handles=driver.getWindowHandles();
			Iterator <String>it=handles.iterator();
		 
		
			
				List<WebElement>socialiconList= driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
				
				for(WebElement e:socialiconList)
				{
			
				e.click();
							
							while(it.hasNext())
							{
								String windowID=it.next();
								driver.switchTo().window(windowID);
								String text=driver.getTitle();
								System.out.println(text);
								driver.close();
							}
				}
							driver.switchTo().window(parentwindowId);
								}
				
					
						
	
	}
				





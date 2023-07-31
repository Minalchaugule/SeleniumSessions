package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserWindowHandlingtogether {

	public static void main(String[] args) throws InterruptedException 
{
			// TODO Auto-generated method stub
			//need to follow hierarchy to go back and forward frame navigation
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 Thread.sleep(2000);
			 
			 String parentwindowId=driver.getWindowHandle();
			
			 driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
			 driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
			 driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
			 driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			 
			Set <String>handles=driver.getWindowHandles();
			Iterator <String>it=handles.iterator();
			
			while(it.hasNext()) {
				String windowID=it.next();
				driver.switchTo().window(windowID);
				Thread.sleep(1000);
				String text=driver.getTitle();
				System.out.println(text);
				if(!windowID.equals(parentwindowId))
				{
					driver.close();
						
				}
				}
			
			driver.switchTo().window(parentwindowId);
			driver.findElement(By.name("username")).sendKeys("Minal");
			
			
	}

}

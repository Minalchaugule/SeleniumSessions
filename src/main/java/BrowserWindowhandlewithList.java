import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandlewithList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		 
		 //fetching window id's
		Set<String> handles= driver.getWindowHandles();
		
		//converting set to list
		List<String> handleList=new ArrayList<String>(handles);
		
		String ParentWindowID=handleList.get(0);
		String childWindowID=handleList.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindowID);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	
		driver.close();

	}

}

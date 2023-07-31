package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//need to follow hierarchy to go back and forward frame navigation
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowID=it.next();
		String ChildWindowID=it.next();
		System.out.println(parentWindowID);
		System.out.println(ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		Thread.sleep(2000);
		String childtitle=driver.getTitle();
		System.out.println("child window title"+childtitle);
	driver.findElement(By.name("email")).sendKeys("minal.chaugule88@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Minal@123");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowID);
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
		
	}

}

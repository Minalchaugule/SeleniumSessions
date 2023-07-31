package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 String parentwindowId=driver.getWindowHandle();
		 Thread.sleep(2000);
		 //sel 4.Xs
		 //driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://google.com");
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(parentwindowId);
		 System.out.println(driver.getTitle());

	}

}

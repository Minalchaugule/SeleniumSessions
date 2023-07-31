package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatraFramepopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//need to follow hierarchy to go back and forward frame navigation
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://yatra.com");
		 Thread.sleep(2000);
	}

}

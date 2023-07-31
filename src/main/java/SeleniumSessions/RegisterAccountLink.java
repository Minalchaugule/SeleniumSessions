package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccountLink {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			Thread.sleep(5000);
			
			By leftPanelLinks=By.xpath("//div[@class='list-group']/a");
			ElementUtil eleutil=new ElementUtil(driver);
			eleutil.ClickonElement(leftPanelLinks,"Register");
			
	}
	
	

}

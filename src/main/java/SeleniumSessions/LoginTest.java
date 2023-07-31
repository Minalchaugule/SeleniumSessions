package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.launchBrowser("Chrome");
		brutil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brutil.getTitle());
		
		ElementUtil eleutil=new ElementUtil(driver);
		
		By email_id=By.id("input-email");
		By password=By.id("input-password");
		
		eleutil.dosendKeys(email_id,"minal.chaugule88@gmail.com");
		eleutil.dosendKeys(password,"Password@123");
		brutil.closeBrowser();
	}

}

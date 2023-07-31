package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.launchBrowser("Chrome");
		brutil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println("Page title is :" +brutil.getTitle());
		
		ElementUtil eleutil=new ElementUtil(driver);
		
		By ft_name=By.id("input-firstname");
		By lt_name=By.id("input-lastname");
		By Email_id=By.id("input-email");
		By Ph_no=By.id("input-telephone");
		By password=By.id("input-password");
		By con_password=By.id("input-confirm");
		By privacy_checkbox=By.name("agree");
		By continue_btn=By.xpath("//input[@value='Continue']");
		By sucess_msg=By.tagName("h1");
		
		eleutil.dosendKeys(ft_name,"Prisha");
		eleutil.dosendKeys(lt_name, "chaugule");
		eleutil.dosendKeys(Email_id, "prisha.chaugule05@gmail.com");
		eleutil.dosendKeys(Ph_no,"0934568543");
		eleutil.dosendKeys(password, "Prisha@123");
		eleutil.dosendKeys(con_password,"Prisha@123");
		eleutil.doClick(privacy_checkbox);
		eleutil.doClick(continue_btn);
		String actmsg=eleutil.getElement(sucess_msg).getText();
		
		if(actmsg.equalsIgnoreCase("Your account has been created!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthonticationPopup {
	

		public static void main(String[] args) {
			
			String username="admin";
			String password="Admin";
	
	    WebDriver driver=new ChromeDriver();
	   driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	   
	   //basic authontion
	   //username:password-combine both strings together and create one encoded string
	   //btoa(username:password)-it is method which gives encoded-SDFVGTRDEX@#$%^&*9
	   //how to get encoded string using btoa method in console
	   //1.go to inspect element ,click on console and write -btoa("admin:admin") and click on enter
	   //how to crosscheck decodeing-go online and search for decode and encode a and pass encoded value
	   

	}

}

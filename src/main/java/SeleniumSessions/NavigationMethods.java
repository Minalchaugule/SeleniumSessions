package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//we can use either get(not overloaded) or to method (overloaded)to launch the browser. to method internally calling get method only
        // to method are overloading 1.navigate.to("https://google.com");
		// 2.navigate.to(new URL("https://google.com"));
		//URL is class -so create object and pass url
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        
        driver.navigate().to("https://amazon.co.uk");
        System.out.println(driver.getTitle());
        
        driver.navigate().to(new URL("https:freecrm.com"));
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().refresh();//refresh cause stale element exception
	}

}

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		//title
		String actTitle=driver.getTitle();
		System.out.println("Title is :" +actTitle);
		
		//current url
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		//driver.getTitle();//no such session Exception-Session ID is null
		
		WebDriver d=new ChromeDriver();
		d.get("https:google.com");
		d.getTitle();
		d.close();
		d.getCurrentUrl();///no such session Exception-Invalid Session ID  
		
	}

}

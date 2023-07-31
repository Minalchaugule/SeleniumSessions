package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {
	
	//headless -no browser
	//invisible browser /or without UI
	//Testing is happening behind the scene
	//slightly faster than normal mode
	//when to use- want to perform execution on linux OS,CICD (Jenkins-uses linux),docker,non UI environment
	//might not work for complex html, navigations or mouseover actions or responsive testing
	//Headless mode is available for chrome,firefox and Edge

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setHeadless method is Deprecated.  Use addArguments(String).Recommended to use '--headless=chrome' as argument for browsers v94-108.
		//Recommended to use '--headless=new' as argument for browsers v109+.Example: `addArguments("--headless=new")`.
        //Parameters:headless 
		
		//for chrome driver - we have 3 options for chrome only
		ChromeOptions co=new ChromeOptions();
	   // co.addArguments("--headless=new");
	    //co.addArguments("--headless");
		//co.addArguments("--headless=chrome");
		
		//for firefox driver
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless=new");
		
		//for edge driver
	   EdgeOptions eo=new EdgeOptions();
				eo.addArguments("--headless");
		
		
		//WebDriver driver=new ChromeDriver(co);
		//WebDriver driver=new FirefoxDriver(fo);
		WebDriver driver=new EdgeDriver(eo);
		
		driver.get("https://freecrm.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}

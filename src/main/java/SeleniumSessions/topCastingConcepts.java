package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class topCastingConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.valid but not recommended
		SearchContext sc=new ChromeDriver();
		
		//2.valid and recommended -local execution
		//WebDriver driver=new ChromeDriver();
		
		//3.valid and recommended -local execution
		RemoteWebDriver driver=new ChromeDriver();
		
		//4.Valid but only used for chrome and edge driver
		ChromiumDriver d=new ChromeDriver();
		ChromiumDriver d1=new EdgeDriver();
		
		//5.valid and recommended -used for remote execution /sel grid/docker/browserstack/aws/lambda test
		// WebDriver driver1=new RemoteWebDriver(URL remoteAddress,Capabilities capabilities);
		
		//6.valid but not recommended
		//SearchContext sc1=new RemoteWebDriver(URL remoteAddress,Capabilities capabilities);
		
	}

}

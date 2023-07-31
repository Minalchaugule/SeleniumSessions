package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;
	ChromeOptions co;
	
	
	@Parameters({"browser","url","headless"})
	@BeforeMethod
	public void setup(String browserName,String url,String headless) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get(url);
		
		String Browser=browserName;
		
		System.out.println("Running browser "+browserName);
		switch (browserName) 
		{
		
		case "chrome":
			co=new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
			 co.addArguments("--headles=new");
			}
			break;
			
		case "firefox":
			break;
			
		case "IE":
		System.out.println("Launch IE browser");
			break;
		case "Safari":
		System.out.println("Launch safari browser");
			break;
		case "Edge":
		System.out.println("Launch Edge browser");
			break;
		case "Chromium":
		System.out.println("Launch chromium browser");
			break;

		default:
			System.out.println("Pls pass the right browser"+Browser);
			break;
		}
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void TearDown()
	{driver.quit();
		
	}
}

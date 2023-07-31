package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {


	@Test(priority=1)
	public void OpencartTitleTest()
	
	{
		
		Assert.assertEquals(driver.getTitle(),"Account Login");
	}
	
	
	@Test(priority=2)
	public void openCartURLTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	
}

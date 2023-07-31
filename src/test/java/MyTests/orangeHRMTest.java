package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHRMTest extends BaseTest {
	

	@Test(priority=1)
	public void googleTitleTest()
	{
	
		Assert.assertEquals(driver.getTitle(),"Sign Up for a Free HR Software Demo | OrangeHRM | OrangeHRM");
	}
	
	
	@Test(priority=2)
	public void googleURLTest()
	{
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		Assert.assertTrue(driver.getCurrentUrl().contains("orange"));
	}
	

}

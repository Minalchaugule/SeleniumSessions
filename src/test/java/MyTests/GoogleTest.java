package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//AAA rule(Arrange-act-assert)
//1 test-1 assert

public class GoogleTest extends BaseTest {
	
	
	@Test(priority=1)
	public void googleTitleTest()
	{
		
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	
	@Test(priority=2)
	public void googleURLTest()
	{
		driver.get("https://google.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	@Test(priority=3)
	public void googleSearchTest() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
	
	

}

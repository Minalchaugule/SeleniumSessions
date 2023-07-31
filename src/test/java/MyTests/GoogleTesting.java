package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTesting {

WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	
	
	@Test(priority=1)
	public void googleTitleTest()
	{
		driver.get("https://google.com");
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	@Test(priority=2)
	public void googleURLTest()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	@Test(priority=3)
	public void googleSearchTest()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
	
	
	@AfterMethod
	public void TearDown()
	{driver.quit();
		
	}

	
	
}

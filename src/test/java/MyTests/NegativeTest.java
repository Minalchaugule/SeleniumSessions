package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NegativeTest {
	
	//data driven approach oe Test parameterization
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	@DataProvider
	public Object[][]LoginTest()
	{
		return new Object[][] 
				{
			{"mnlptl84@gmail","Password@!23"},
			{"mnlptl84@gmail","Password@!234"},
			{"mnlptl84@gmail","Minal@!23"}
				};
			}
	
	@Test(dataProvider="LoginTest")
	public void usrLoginTest(String username,String password)
	{


    driver.findElement(By.id("input-email")).clear();
	driver.findElement(By.id("input-email")).sendKeys(username);
	
	driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String msg=driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		System.out.println(msg);
		Assert.assertTrue(msg.contains("No match for E-Mail Address and/or Password."));
	}
	

}

package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
	
	
	@DataProvider
	public Object[][]SearchProductTest()
	{
		return new Object[][] 
				{
			{"macbook",3},
			{"samsung",2},
			{"imac",1},
			{"canon",1}
				};
			}
	
	@Test(dataProvider="SearchProductTest")
	public void SearchTest(String searchValue,int count)
	{

		 driver.findElement(By.name("search")).clear();
    driver.findElement(By.name("search")).sendKeys(searchValue);
    driver.findElement(By.cssSelector("div#search button")).click();
	
	
	String header=driver.findElement(By.cssSelector("div#content h1")).getText();
		Assert.assertTrue(header.contains(searchValue));
		
		int productCount=driver.findElements(By.cssSelector("div.product-layout")).size();
		System.out.println(searchValue +" count : "+productCount);
		Assert.assertEquals(productCount,count);
		

}
}


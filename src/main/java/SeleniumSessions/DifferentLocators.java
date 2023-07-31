package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// 1.ID-unique locator :
		//ele="naveen"
		//ele1="selenium"
		 driver=new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.findElement(By.id("input-email")).sendKeys("minal.chaugule88@gmail.com");

		//2.name-can be duplicate
		//driver.findElement(By.name("password")).sendKeys("Password@123");
		
		//3.classname-can be duplicate and most of the time it's duplicate(attributes)
		//driver.findElement(By.className("btn btn-primary")).click();
		
		//4.xpath -not an attribute.it is address of html in dom
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("minal.chaugule88@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Password@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
//		By fn_name=By.xpath("//*[@id=\"input-firstname\"]");
//		By lt_name=By.xpath("//*[@id=\"input-lastname\"]");
//		By pwd=By.xpath("//*[@id=\"input-password\"]");
//		By checkbox=By.name("agree");
//		By contn_btn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		dosendKeys(fn_name,"minal");
//		dosendKeys(lt_name,"chaugule");
//		dosendKeys(pwd,"Password@123");
//		doClick(checkbox);
//		doClick(contn_btn);
		
		//5.css selector -not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("minal.chaugule88@gmail.com");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("1234");
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("mnlptl84@gmail.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("985643988798");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("Test@123");
//		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Test@123");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		By f_name=By.cssSelector("#input-firstname");
		By l_name=By.cssSelector("#input-lastname");
		By email=By.cssSelector("#input-email");
		By phone_no=By.cssSelector("#input-telephone");
		By pswd=By.cssSelector("#input-password");
		By confirm=By.cssSelector("#input-confirm");
		By ch_box=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By submit=By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		dosendKeys(f_name,"Prisha1");
		dosendKeys(l_name,"chaugule1");
		dosendKeys(email,"prishachaugule11@gmail.com");
		dosendKeys(phone_no,"345678654");
		dosendKeys(pswd,"Prisha@123");
		dosendKeys(confirm,"Prisha@123");
		doClick(ch_box);
//		doClick(submit);
		
		//6.Linktext
		
		
	
		
	}
	
	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void dosendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

}

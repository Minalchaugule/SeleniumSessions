package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		 driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		 
		 //frame can be find by using index /name or id/webElement
		 //driver.switchTo().frame(2);
		 //driver.switchTo().frame("main");
		 WebElement ele=driver.findElement(By.xpath("//frame[@src='top.html']"));
		 //driver.switchTo().frame(ele);
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}
	
	public static void waitForFrameByLocator(By FrameLocator ,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));	
	}
	
	public static void waitForFrameByIndex(int FrameIndex ,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIndex));	
	}
	
	public static void waitForFrameByFrameNameOrID(String FrameNameorID ,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameNameorID));	
	}
	
	public static void waitForFrameElement(WebElement FrameElement ,int timeOut)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));	
	}

}
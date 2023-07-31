package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitforAlerts {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		   
//		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
//		String text=alt.getText();
//		System.out.println(text);
//		alt.accept();
		  Alert alt= waitForJSAlert(10);  
		  alt.accept();
		
	}
	
	public static Alert waitForJSAlert(int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

}

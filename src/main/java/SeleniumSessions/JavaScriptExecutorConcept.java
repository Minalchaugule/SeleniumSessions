package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorConcept {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			 WebDriver driver=new ChromeDriver();
			 
			 //WebDriver driver=new EdgeDriver();
				//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				//driver.get("https://classic.crmpro.com/");
				driver.get("https://www.amazon.co.uk/");
				Thread.sleep(500);
				//JS -we can inject code/JS scripts using java selenium using javascript executor
				//Remote webDriver-WebDriver(I)
				//Remote webDriver-JavascriptExecutor(I)-executejavascript()
				
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//injecting javascript alert
//		//go to console search for alert and give message
//		//js.executeScript("alert('this is alert')");
//		
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
//		String url=js.executeScript("return document.url;").toString();
//		System.out.println(url);
		
				JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
//				String title=jsUtil.getTitleByJS();
//		        System.out.println(title);
//		        
//		        
//		      jsUtil.generateAlert("This is alert");
//		
//		String text=jsUtil.getPageInnerText();
//		System.out.println(text);
//		if(text.contains("customer service"))
//		{
//			System.out.println("Pass");
//		}
				WebElement ele=driver.findElement(By.xpath("//span[text()='Discover exciting new products']"));
			
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDownMiddlepage();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown("100");
		jsUtil.scrollIntoView(ele);
				
				//jsUtil.zoomChromeEdgeSafari("400");
				Thread.sleep(500);
				jsUtil.flash(ele);
				Thread.sleep(500);
				jsUtil.drawBorder(ele);
				Thread.sleep(500);
				jsUtil.changeColor("magenta", ele);
				
		
		
		
		
	}

}

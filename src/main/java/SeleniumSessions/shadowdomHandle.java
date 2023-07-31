package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowdomHandle {
	
	//shadow dom is used for security  and in don=m,itstarts with # shadow-root(open)
	//elements under shadow dom is called shadow element and it should be always open

	//browser-page-shadow dom-shadow dom-ele
	
	//browser-page-shadow dom-shadow-iframe -ele   for destiny editbox
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
			Thread.sleep(5000);
			
			String scripttext="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");";
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement pizza_ele=(WebElement) js.executeScript(scripttext);
			
			pizza_ele.sendKeys("Veg pizza");
	}

}

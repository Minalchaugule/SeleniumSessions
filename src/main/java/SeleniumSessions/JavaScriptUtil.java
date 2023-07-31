package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	private WebDriver driver;
	private JavascriptExecutor js;
	
	public JavaScriptUtil(WebDriver driver)
	{
		this.driver=driver;
		js=(JavascriptExecutor)driver;
	}
	
	public String getTitleByJS()
	{
		return js.executeScript("return document.title;").toString();
	}
	
	public String getURLByJS()
	{
		return js.executeScript("return document.URL;").toString();
	}
	
	public void goBackWithJS()
	{
		js.executeScript("history.go(-1)");
	}
	
	public void goForwordWithJS()
	{
		js.executeScript("history.go(1)");
	}
	
	public void pageRefreshWithJS()
	{
		js.executeScript("history.go(0)");
	}
	
	public void generateAlert(String message) throws InterruptedException
	{
		js.executeScript("alert('"+message+"')");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}
	
	public void generatePrompt(String message,String StringKey) throws InterruptedException
	{
		js.executeScript("prompt('"+message+"')");
		try {
		Thread.sleep(500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(StringKey);
		alt.accept();
	}
	
	public void generateJSConfirm(String message) throws InterruptedException
	{
		js.executeScript("confirm('"+message+"')");
		try {
		Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
	e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}
	
	public String getPageInnerText()
	{
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void scrollPageDown() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrollPageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public void scrollPageDown(String height) {
		js.executeScript("window.scrollTo(0, '" + height + "')");
	}

	
	public void scrollPageDownMiddlepage() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
	}

	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	/**
	 * example: "document.body.style.zoom = '400.0%'"
	 * @param zoomPercentage
	 */
	public void zoomChromeEdgeSafari(String zoomPercentage) {
		String zoom = "document.body.style.zoom = '"+zoomPercentage+"%'";
		js.executeScript(zoom);
	}
	
	/**
	 * example: "document.body.style.MozTransform = 'scale(0.5)'; ";
	 * @param zoomPercentage
	 */
	public void zoomFirefox(String zoomPercentage) {
		String zoom = "document.body.style.MozTransform = 'scale("+zoomPercentage+")'";
		js.executeScript(zoom);
	}
	
	
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element);// 1
			changeColor(bgcolor, element);// 2
		}
	}

	public void changeColor(String color, WebElement element) {
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		//G->P->G->P

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
	
	
	

}

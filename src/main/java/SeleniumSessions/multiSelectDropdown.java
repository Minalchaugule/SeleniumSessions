package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    driver=new ChromeDriver();
   driver.get("https://html.com/attributes/select-multiple/");
   WebElement dropdown=driver.findElement(By.xpath("//select[@multiple]"));
   Select sel=new Select(dropdown);
   
   if(sel.isMultiple()) {
	   System.out.println("Multi selection is possible");
   
sel.selectByVisibleText("American flamingo");
sel.selectByVisibleText("Greater flamingo");
sel.selectByVisibleText("Lesser flamingo");
   }
   sel.deselectByVisibleText("Greater flamingo");
   sel.deselectAll();

	}

}

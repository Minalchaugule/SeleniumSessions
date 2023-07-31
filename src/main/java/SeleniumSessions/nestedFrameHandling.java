package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrameHandling {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//need to follow hierarchy to go back and forward frame navigation
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://selectorshub.com/iframe-scenario/");
			 Thread.sleep(2000);
			 String title=driver.getTitle();
			 System.out.println(title);
			 driver.switchTo().frame("pact1");
			 driver.findElement(By.id("inp_val")).sendKeys("Minal");
			 driver.switchTo().frame("pact2");
			 driver.findElement(By.id("jex")).sendKeys("Prisha");
			 driver.switchTo().frame("pact3");
			 driver.findElement(By.id("glaf")).sendKeys("wedrfghn");
			 
			 driver.switchTo().parentFrame();//sel 4.X
			 driver.findElement(By.id("jex")).sendKeys("crush name");
			 
			 driver.switchTo().parentFrame();//sel 4.X
			 driver.findElement(By.id("inp_val")).sendKeys("updated");
			 
			 //driver.switchTo().parentFrame();
			 driver.switchTo().defaultContent();
			 driver.findElement(By.linkText("Products")).click();
			 
	}

}

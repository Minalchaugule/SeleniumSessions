package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
   driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
   driver.findElement(By.name("upfile")).sendKeys("C:/Users/sandy/OneDrive/Desktop/Interview Questions/Interview Questions.docx");
   
//file type should be file for button
   //ask dev team to add this attribute
   //robot class-not recommended -only works for windows -don't work for linux,mac,cloud,jenkins,docker,headless and grid
   //autoIT-not recommended -only works for windows -don't work for linux,mac,cloud,jenkins,docker,headless and grid
   //sikuli-not recommended bcoz it depends on images-need to take screenshots for each step and save in similar manner which is not right way
   
   
   //adv pop ups- ask dev to not to add pop ups in dev,QA ,UAT env
   //omly in Prod
   //no need to use switchto alert
   //random popup -we can't automate as we dont know when it wil appear
   
	}

}

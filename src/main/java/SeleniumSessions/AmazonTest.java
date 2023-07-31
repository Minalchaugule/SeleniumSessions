package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName="Chrome";

BrowserUtil brUtil=new BrowserUtil();
brUtil.launchBrowser(browserName);
brUtil.enterURL("https://www.amazon.co.uk/");
String acttitle=brUtil.getTitle();
System.out.println(acttitle);
if(acttitle.contains("Amazon"))
{
	System.out.println("correct title");
}
else {
	System.out.println("Incorrect title");	
}
String Pageurl=brUtil.getPageURL();
System.out.println(Pageurl);
if(Pageurl.contains("Amazon"))
{
	System.out.println("correct url");
}
else {
	System.out.println("Incorrect url");	
}

brUtil.closeBrowser();
}
}
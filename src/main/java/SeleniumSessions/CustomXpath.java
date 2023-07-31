package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {
		// absolute Xpath=root html tag to path of the element
		//relative xpath- using attribute,using functions,using sibling concepts
		//htmltag[@attributename='attribute value']
		//input[@id='username']
		//button[@type='submit']
		
		//input -14
		//input[@id]-6
		//input[@id='username']-1
		//@id='username'- recommended
		
		//input[@name='username' and @placeholder='username']
		//input[@name='username' and @placeholder='username' and @id='username']
		//[@id and @class and @placeholder]-with find Elements ,it gives 2 elements
		
		//class attribute
		//By.xpath("//input[@classname='
		//By.classname("
		
//		By e1=By.xpath("//inut[@class='private-form__label UIFormControl__InlineFormLabel-sc-1jc5cpw-0 iqowxj'");//valid
//		By e2=By.className("login-email");//-valid
//		By e3=By.
		
		//Contains function -when long values /dynamic attributes -id
		//html[contains(@attribute name,'value')]
		//input[contains(@data-test-id,'login-input')]
		//input[contains(@data-test-id,'-field')]
		//input[contains(@class,'login-email')]
		
		//dynamic id-
		//input[@id='test_123']
		//input[@id='test_456']
		//input[@id='test_789']
		
		//input[contains(@id,'test_')]
		
		//xpath with contains with 1 attribute and other without 
		////input[contains(@class,'login-email') and @data-test-id='login-input']
		//input[@type='email' and contains(@class,'login-email')]
		//input[@type='email' and contains(@class,'login-email') and @id='username']
		
		
		//Text() function
		//htmltag[text()='value']
		//h1[text()='Register account']
		
		//contains with text()function
		//tagname[contains(text(),'value')]
		//h1[contains(text(),'Register')]
		//h1[contains(text(),'60000+ businesses of all sizes')]
		
		//contains with 2 attribute and 3rd attribute without contains
		//html[contains(text(),'value') and contains(text(),'value') and @attri='value']
		
		
		//index
		//(//html(@attri='value))-capture group then apply position
		//(//input(@class='form-control'))[1]-firstname-first element
		//(//input(@class='form-control'))[4]-phno
		//(//input(@class='form-control'))[position()=[1]]-position function
		//(//input(@class='form-control'))[last()] -last element
		//(//input(@class='form-control'))[last()-1]-2nd last
		//(//input(@class='form-control'))[last()-[last()-1]]-go to first element
		
		//amazon-accessibilty-((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		//customer service-((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]
		
		//parent to child transverse-orange hrm country dropdown
		//select[@id='Form_getForm_Country']/option-direct child
		//div[@class='footer-main']//a -indirect child/grandchild -so use double slash
		
		
		//child to parent
		//backword transverse in xpath : child/..
		//input[@id='username']/../../../../../../../../../../.. -from email address field to top of html dom
		//need to transverse to the parent of email
		//input[@id='username']/parent::div
		
		
		//need to transverse to the form tag -use ancestor used to navigate to grandparent
		//input[@id='username']/ancestor::form
		
		//orangehrm -country dropdown
		//option[contains(text(),'Country')]/parent::select-country dropdown ->using contains and text() function
		//(//option[contains(text(),'Country')]/ancestor::div)[10] -using grandparent 
				
		
		
		
		
		

	}

}

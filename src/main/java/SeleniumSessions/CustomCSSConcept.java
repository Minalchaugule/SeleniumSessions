package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		  driver.get("https://app.hubspot.com/login/beta");
		  
		// TODO Auto-generated method stub
    //id- #id
		//Tag#id
		//class- .class
		//tag.class
		//input.form-control
		//input#input-email
		By.cssSelector("input#input-email");
		//for multiple classes
		//.c1.c2.c3
		//.form-control.private-form__control.login-email -hubspot.com
		//input.form-control.private-form__control.login-email -with tagname
		//form-control.private-form__control -any 2 classes
		//.login-email.form-control.private-form__control-sequence doesnt matter
		//input.login-email-looks like unique
		
		//id and class
		//#id.class
		//tag#id.class
		//tag.class#id
		//#username.login-email 
		//.form-control.private-form__control#username- 2 classes and id
		//input.form-control.private-form__control.login-email#username - 3classes and id
		
		
		//other attributes other than id and class
		//tagname[attri='value']
		//emailaddress field -input[placeholder='E-Mail Address']
		//-input[id='input-email']
		
		//more than 1 attribute
		//-tagname[attr1='value'][attr2='value'][attr3='value']
		//-input[id='input-email'][type='text'][placeholder='E-Mail Address']
		
		//generic -without values only attributes
		//-input[type][name][placeholder][id] -mostly it gives multiple elements
		//[id]-css-15 elements
		//[@id]-xpath -//*[@id]-15 elements
		
		//text()-not available in css
		//css1 and css2 has text function ,but now all browsers using css3 which doesnt have text fun
		
		//contains in css
		//tagname[attr*='value']
		//css-input[placeholder*='Address']
		//input[placeholder*='Address'][id='input-email']
		//xpath-input[contains(@class,'Address')]
		
		
		//starts with in css
		//-tag[attr^='value']
		//-input[placeholder^='E-Mail']-css
		//input[starts-with(@placeholder,'E-Mail')] -xpath
		
		//ends with in css
		//-input[placeholder$='Address'] -css
		//input[ends-with(@placeholder,'Address')] -reomved ends with in xpath
		
		//contains ,starts with and ends with altogether
		//-input[placeholder*='Address'][id^='input'][class$='control']
		//-input[placeholder*='Address'][class$='control']#input-email
		
		//parent to child in css -orangrhrm -country dropdown
		//-space need to use for direct and indirect child element
		//> for direct child element
		//-select#Form_getForm_Country>option
		//-select#Form_getForm_Country option
		
		//hubspots.com
		//-form>div 2 elements-direct child
		//-form div-gives 7 elements(direct + indirect)
		
		//selectorhub.com -inspect table
	
		//-table#resultTable td
		//-table#resultTable>tbody>tr>td-
		
		//child to parent transverse- Not available in CSS
		//child to ancestor -NA
		//preceding sibling-NA
		//following sibling-//naveen automation lab -Yes
		//-label[for='input-email']+input -"+" sign for immediate following sibling
		//-label[for='input-email']~input -"~" sign for all following sibling
		
		
		//indexing in CSS  -orange hrm
		//-select#Form_getForm_Country option:first-child -first option from dropdown
		//-select#Form_getForm_Country option:last-child -last child 
		//-select#Form_getForm_Country option:nth-child(4) -any specific child -need to provide index
		//-select#Form_getForm_Country option:nth-last-child(2) -2nd last child
		//-select#Form_getForm_Country option:nth-child(odd)-odd
		//-select#Form_getForm_Country option:nth-child(even)-even
		//-select#Form_getForm_Country option:nth-child(n+4) -starts with 4th element
		//-select#Form_getForm_Country option:nth-child(5n)-multiplication of 5 -5th,10th ...
		
		
		//not in css
		//-input.form-control- 3 elements
		//-input.form-control:not([name='search'])- 2 elements
		//-input.form-control:not([name='search']):not([name='password'])-1 element
		
		//comma in css
		//-input#username,button#loginBtn,input#remember,div.signup-link -4 imp elements in the page
		By impEle=By.cssSelector("input#username,button#loginBtn,input#remember,div.signup-link");
		if(driver.findElements(impEle).size()==4)
		{
			System.out.println("IMp elements present in the page-----PASS");
		}
		else {
			System.out.println("IMp elements are not present in the page-----fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

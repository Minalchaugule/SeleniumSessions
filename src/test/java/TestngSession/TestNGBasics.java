package TestngSession;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//BS---->connect with datatbase
//BT---->create user
//BC----->Launch the Borwser

//BM----> Login to the app
//T---->Cart  test
//AM---->Logout

//BM----> Login to the app
//T--->Order test
//AM---->Logout

//BM----> Login to the app
//T--->Search user
//AM---->Logout

//AC---->close the browser
//AT---->delete user
//AS---->disconnect with DB

//PASSED: CartTest
//PASSED: OrderTest
//PASSED: SearchTest

public class TestNGBasics {
	//global pre condition
	//pre condition
	//assertion
	//post steps
	
	@BeforeSuite
	public void connectwithDB()///1st
	{
		System.out.println("BS---->connect with datatbase");
	}
	
	@BeforeTest
	public void createuser()
	{
		System.out.println("BT---->create user");	
	}
	
	//3
	@BeforeClass 
	public void LaunchBrowser()//2nd
	{
		System.out.println("BC----->Launch the Borwser");	
	}
	
	//4  7 10
	@BeforeMethod  //3rd( 3 times as 3 test are there)
	public void LogonApp()
	{
		System.out.println("BM----> Login to the app");	
	}
	
	//11
	//cart,order,Search
	@Test
	public void SearchTest()
	{
		System.out.println("T--->Search user");
		Assert.assertEquals("Google11","Google");
	}
	
	//5
	@Test
	public void CartTest()
	{
		System.out.println("T---->Cart  test");
		Assert.assertEquals("Macbook","Macbook");
	}
	//8
		@Test
		public void OrderTest()
		{
			System.out.println("T--->Order test");
			Assert.assertEquals(1000,1000);
		}
		// 6 9 12
		@AfterMethod
		public void Logout()
		{
			System.out.println("AM---->Logout");
		}
		
		//13
		@AfterClass
		public void closeBrowser()
		{
			System.out.println("AC---->close the browser");
		}
		
		//14
		@AfterTest
		public void deleteUser()
		{
			System.out.println("AT---->delete user");
		}
	
		//15
		@AfterSuite
		public void disconnectDB()
		{
			System.out.println("AS---->disconnect with DB");
		}
	
	

}

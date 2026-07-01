package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Class3 {

	@Parameters({"URL","API/UN"}) 
	//need tospecify forall required methods
	@Test
	public void WebLogin(String URLname, String Key)
	{
		System.out.println("WebLogin");
		System.out.println(URLname);
		System.out.println(Key);
	}
	
	@AfterMethod 
	//this specify to this class and it execute last of all methods in the particular class
	
	public void MobileLoginMethodAfter()
	{
		System.out.println("MobileLoginbeforemethodafterlas");
	}
	
	@BeforeMethod 
	// can delete cookies& caches before all TC
	//this specify to this class and it execute first of all methods in the paticular class
	//willexecute before of all TC on that class
	//whereas beforetest isspecify to the Testng
	public void MobileLoginMethod()
	{
		System.out.println("MobileLoginbeforemethod");
	}
	
	
	@AfterClass
	//this specify to this class and it execute last of all methods in the particular class even after afteermethod
	
	public void AfterClass()
	{
		System.out.println("After class");
	}
	
	@BeforeClass
	// can delete cookies& caches before all TC
	//this specify to this class and it execute first of all methods in the paticular class even before classmethod
	//willexecute before of all TC on that class
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@Test (timeOut = 4000) // helper attribute wait untillmentioned sec before fail
	//if add in implicit wait it affect performance of all TC
	public void MobileLogin()
	{
		System.out.println("MobileLogin");
	}
	
	@Test(enabled =false) // willskip this TC 
	// if true again willexecute it &helper attribute
	public void MobileSignin()
	{
		System.out.println("MobileSignin");
	}
	
	@Test (groups= {"Smoke"})
	public void MobileSignout()
	{
		System.out.println("MobileSignout");
	}
	
	@Test (dataProvider = "getData")
	public void DataProviderTest(String UN, String Password)
	{
		System.out.println("DataProviderTest");
		System.out.println(UN + " " + Password);
	}
	
	@Test (dependsOnMethods= {"WebLogin"}) // so Login API will execute after Web login 
	// can add multiple method with  comma separation 
	// helper attribute
	// By default TestNG execute TC based on Alphabetical order in olderversion in is not reliably true for modern TestNG versions.
	public void LoginAPI()
	{
		System.out.println("LoginAPI");
	}
	
	@BeforeSuite //mostly has local variables
	//Execute first of all even @beforetest
		public void AfterDemo()
		{
			System.out.println("1 TC before Suite");
		}
	
	@BeforeTest
	// eg:clean up data first,set url, login etc.
	//this annotation belons TC & it only execute first
	// TestNG first execute @beforetest annotationTC first then execute all classes TC from TestNG file. 
	
	public void PreRequisite()
	{
		System.out.println("Presetup TC class 3");
	}
	
	@DataProvider //@DataProvider is used to run the same test method multiple times with different sets of data.
	// how to acheive parameterizing one from TestNG pass parameters
	//& other is Data Provider
	public Object[][] getData()
	{
		//good credit history]
		//not clear
		//fraud 
		
		Object[][] data = new Object[3][2]; //3rows. 2 columns
		data [0][0]= "FirstUser";
		data [0][1] = "firstpassword";
		//2nd set
		data [1][0]= "SecondUser";
		data [1][1] = "secondpassword";
		// 3rd set
		data [2][0]= "ThirdUser";
		data [2][1] = "Thirdpassword";
		return data;
	}
}

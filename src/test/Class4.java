package test;

import org.testng.annotations.Test;

public class Class4 {

		@Test
		public void WebHomeLogin()
		{
			System.out.println("WebHomeLogin");
		}
		
		@Test
		public void MobileHomeLogin()
		{
			System.out.println("MobileHomeLogin");
		}
		
		@Test
		public void LoginHomeAPI()
		{
			System.out.println("LoginHomeAPI");
		}
		
		
	}

/*@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod --execute begin of all paticular class methods
@AfterMethod -- execute after of all paticular class methods
@AfterClass
@AfterTest  --Last of mentioned test 
@AfterSuite */



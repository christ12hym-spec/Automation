package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {

	@Parameters({"URL"}) 
	@Test (groups= {"Smoke"}) // Group the Test
//	@Test //2 TC
	
	public void Demo2(String URLname)
	{
		System.out.println("Hello Fine");
		System.out.println(URLname);
	}
	
	@BeforeTest
	// eg:clean up data first,set url, login etc.
	//this annotation belons TC & it only execute first
	// TestNG first execute @beforetest annotationTC first then execute all classes TC from TestNG file. 
	
	public void PreRequisite()
	{
		System.out.println("Presetup TC");
	}
	
}

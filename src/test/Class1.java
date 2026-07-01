package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Class1 {
	
	@AfterTest 
	// is annotation in testng & execute this method at last of all classes in Test ng
	//delete cookies, read reports,
	// it willexecute at last of the <test>
	
	public void AfterDemo()
	{
		System.out.println("Last TC");
	}
	
	
	@AfterSuite
	//Execute last ofall classes, TC present in the whole test suite
	public void AfterSuite()
	{
		System.out.println("I wasthe Last TC of all in the Suite");
	}	

	
@Test // is annotation in testng &execute the method below of it
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}

@Test //2 TC
public void Demo2()
{
	System.out.println("Hello2");
}

}

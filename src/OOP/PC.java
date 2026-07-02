package OOP;

import org.testng.annotations.BeforeMethod;

public class PC {

	public void doThis()
	{
		System.out.println(" Parent class");
	}
	
	@BeforeMethod
	public void BeforeRun() // This /All testng annotation method will execute in all child class which inherit this class even parent class properties not used
	{
		System.out.println("Run me first Test");
	}

}

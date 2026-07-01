package OOP;

import org.testng.annotations.Test;

public class CC extends PC { //Inheritance  using extends keyword
	

	@Test
	public void RunThis() 
	{
		int a =3;
		doThis(); // use Inheritance no need to create object for the class to invoke method of it.
		SingleUtilityResponsibility SR =new SingleUtilityResponsibility(3); // if pass parameter construtor will create
		// this is the parameterizedconstructor
		System.out.println(SR.increment());
	//	SuperUtility SU = new SuperUtility (3); noneecallwith singleclassusing extends
		System.out.println(SR.multiply());
	} 

	
	@Test
	public void RunThisTest() 
	{
		System.out.println(" child class");
	} 
}

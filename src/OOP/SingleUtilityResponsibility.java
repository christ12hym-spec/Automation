package OOP;

import org.testng.annotations.Test;

public class SingleUtilityResponsibility extends SuperUtility {
	int a;//class variable
	
	// default constructor will create in backend  when create object for any class.
	
	public SingleUtilityResponsibility(int i) { // auto constructor will create if pass parameters in object creation place
		//"Int i" is instance variable 
		super(i); // parent class constructor is invoke
		//super need to be in first in constructor
		this.a = i;
	}

	@Test
	public int increment() //passing int a  as parameters in one way toreceive the value fromchild class 
	{			
			a= a+1;
			return a;
	}

	}



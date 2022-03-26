package com.typesOfClasses;

//Interface Class
public abstract interface Address 
{	
	
	//variables(but only 'static final' variables)
	
	//The blank final field streetNo may not have been initialized
	public static final int streetNo = 67;
	public static final String streetName = "Modern Colony";
	
	//no constructors
	//Interfaces cannot have constructors
	
	//no blocks
	//The interface Address cannot define an initializer
	
	//no non-static methods
	
	//static methods
	public static void getDetails()
	{
		System.out.println(streetNo);
		System.out.println(streetName);
	}
	
	//an abstract methods
	public abstract void getInfo();
	
	//main()
	public static void main(String[] args) 
	{
		//no objects
		//Cannot instantiate/create the type Address
		//Address address = new Address();
	}		

}


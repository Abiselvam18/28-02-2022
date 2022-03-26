package com.typesOfClasses;

//Abstract Class
public abstract class Organisation 
{

	//variables(all variables)
	int id;
	String name;
	
	static String country;
	
	//constructors
	public Organisation() 
	{
		
	}

	public Organisation(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	//blocks
	{
		id = 4040;
		name = "TCS";
	}
	
	static
	{
		country = "USA";
	}
	
	//methods
	public void getOrgDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(country);
	}
	
	public static void getCountryInfo()
	{
		System.out.println(country);
	}
	
	//**abstract methods(Abstract methods do not have/specify a body/implementation)
	public abstract void getDetails();
	
	//main
	public static void main(String[] args) 
	{
		//no objects
		//Cannot instantiate/create the type Organization object
		//Organization organization = new Organization();
		
	}
	
}

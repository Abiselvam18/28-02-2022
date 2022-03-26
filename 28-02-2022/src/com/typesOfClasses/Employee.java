package com.typesOfClasses;

//Normal class
public class Employee 
{

	//variables(all variables)
	int id;
	String name;
	double salary;
	
	static String country;
	
	//constructors	
	public Employee() 
	{
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	
	
	//blocks
	
	//instance initializer block
	{
		id = 3930;
		name = "Architha";
		salary = 57554.45;
	}
	
	//static block
	static
	{
		country = "India";
	}
	
	//methods(all methods)
	public void getData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(country);
	}
	
	public static void getCountry()
	{
		System.out.println(country);
	}
	
	//**no abstract methods
	
	/**
	 * The abstract method getDetails() in type Employee can only be 
	 * defined by an abstract class
	 */
	
	//public abstract void getDetails();
	
	//main
	public static void main(String[] args) 
	{
		//objects
		Employee employee1 = new Employee();
		employee1.getData();
		
		Employee employee2 = new Employee(1290, "Harish", 83373.34);
		employee2.getData();
	}
	
	
}


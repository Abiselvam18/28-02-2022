package com.objectcloning;

//step 1
public class Employee implements Cloneable
{
	int id;
	String name;
	double salary;
	
	public Employee() 
	{
        id = 100;
		name = "Rishi";
		salary = 6000.45;
		
	}
	
	public void getEmployeeDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	//step2
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//step3
		Employee e1 = new Employee();
		e1.getEmployeeDetails();
		
		System.out.println("================");
		
		//step4
		Employee e2 = (Employee) e1.clone();
		e2.getEmployeeDetails();
		
	}
}

package com.objectcloning;

//step 1
public class Jaishu implements Cloneable
{
	
	String name;
	int age;
	
	public Jaishu() 
	{

		name = "Jaishu";
		age = 20;
		
	}
	
	public void getDetails()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	//step2
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//step3
		Jaishu J1 = new Jaishu();
		J1.getDetails();
		
		System.out.println("================");
		
		//step4
		Jaishu J2=(Jaishu)J1.clone();
		J2.getDetails();
		
	}
}


package com.example.other;

public class Person {
	private String name;
	private int age;

	//An example of a constant.
	public final static int MAX_AGE = 100;



	public Person(String name, int age)

	{
		this.age = age;
		this.name = name;
	}
	
	public Person(String name)
	{
		this.name = name;
		this.age = 0;
	}
	


}

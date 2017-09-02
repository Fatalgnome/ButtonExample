package com.example.other;

public class Person {
	String name;
	int age;

	public static int maxAge = 100;
	
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

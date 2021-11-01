package com.sonata;
public class Student
{
	int stdId;
	String stdName;
	double stdClass;
	
	//default constructor
	Student() {}
	//parameterized constructor
	Student(int id, String name, int c)
	{
		this.stdId=id;
		this.stdName=name;
		this.stdClass=c;
	}
	public void display()
	{
			System.out.println(stdId);
			System.out.println(stdName);
			System.out.println(stdClass);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.stdId=100;
		s1.stdName="Sam";
		s1.stdClass=10;
		System.out.println("Information of students are: ");
		s1.display();
		System.out.println();
		Student s2=new Student(101,"Vijay",10);
		s2.display();
		
	}

}

package com.sonata;
//program to test if an array contains a specific value
public class ArrayTest 
{
	public static void main(String[] args) 
	{
		int a[]= {11,22,33,44,55,66};
		int search=44;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
				System.out.println("Array contains the specific element");
		}
	}
}

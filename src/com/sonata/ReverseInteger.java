package com.sonata;
//Program to reverse an array of integer values
public class ReverseInteger 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println("Original Array : ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("Reversed Array : ");
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}
}

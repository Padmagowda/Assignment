package com.sonata;
//Program to identify duplicate values in an array
public class DuplicateValues 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,6,3,1,8,4,2,5,5};
		System.out.println("Duplicate values in given array are:");
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
	}
}

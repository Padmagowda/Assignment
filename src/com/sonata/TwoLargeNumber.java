package com.sonata;
//Program to identify two large numbers in an array
public class TwoLargeNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {14,22,65,34,12,53};
		int large1=arr[0];
		int large2=arr[1];
		System.out.println("The given array is : ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large1)
			{
				large2=large1;
				large1=arr[i];
			}
			else if(arr[i]>large2)
			{
				large2=arr[i];
			}
		}
		System.out.println("The first largest value is " + large1);
		System.out.println("The first largest value is " + large2);
	}
}

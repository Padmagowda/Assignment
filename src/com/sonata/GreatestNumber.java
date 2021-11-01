package com.sonata;
//Program to find the greatest number and display
public class GreatestNumber
{
	public static void main(String[] args)
	{
		int a=12;
		int b=25;
		int c=89;
		if(a>b && a>c)
			System.out.println(a + " is greater");
		else if(b>a && b>c)
			System.out.println(b + " is greater");
		else
			System.out.println(c + " is greater");
	}
}

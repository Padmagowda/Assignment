package com.sonata;
// Program to read the string and replace ovals with '$' symbol
public class OvalReplace 
{
	public static void main(String[] args) 
	{
		String s= new String("Replace String");
		char ch[]=s.toCharArray();
		int i;
		for(i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]='$';
			}
		}
		for(i=0;i<ch.length;i++)
		System.out.print(ch[i]);
	}
}

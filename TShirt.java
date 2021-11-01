package com.sonata;
public class TShirt
{
	String color;
	String material;
	String design;
    int size;
	
	TShirt()
	{
		System.out.println("This is Small Sized T-Shirt\n");
	}
	
	TShirt(String c, String m, String d, int s)
	{
		this.color = c;
		this.material = m;
		this.design = d;
		this.size = s;
		System.out.println("This is Medium Sized T-Shirt\n");
	}
	
	TShirt(String c, String m, String d)
	{
		this.color  = c;
		this.material = m;
		this.design = d;
		this.size = 40;
		System.out.println("This is Large Sized T-Sshirt\n");
	}

	public void display()
	{
		System.out.println("Color : " + color);
		System.out.println("Material : " + material);
		System.out.println("Design : " + design);
		System.out.println("Size : " + size+"\n");
	}

	public static void main(String[] args) 
	{
		TShirt Small = new TShirt();
		Small.color = "Blue";
		Small.material = "Cotton";
		Small.design = "Casual";
		Small.size = 32;
		Small.display();
		
		TShirt Medium = new TShirt("Red","Polyster","Casual",30);
		Medium.display();
		
		TShirt Large = new TShirt("Grey","Nylon","Jersy");
		Large.display();	
	}
}
	
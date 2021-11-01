package com.sonata;
public class Product
{
	int ProID;
	String ProName;
	double ProPrice;
	
	//default constructor
    Product(){}
	//parameterized constructor
	Product(int id, String name,double price)
	{
		this.ProID=id;
		this.ProName=name;
		this.ProPrice=price;
	}
	public double gst(double tax)
	{
		return ProPrice+tax;
	}
	public void display()
	{
			System.out.println(ProID);
			System.out.println(ProName);
	}
	public static void main(String[] args) 
	{
		Product p1=new Product();
		p1.ProID=11;
		p1.ProName="Toy";
		p1.ProPrice=1000;
		p1.display();
		System.out.println(p1.gst(100.25));
		System.out.println();
		Product p2=new Product(12,"Cloth",1500);
		p2.display();
		System.out.println(p2.gst(125.45));
	}
}

import java.util.*;
 class Area1
{	
	float length;
	float breadth;
	float area;
	Area1()
	{
		this.length=length;
		this.breadth=breadth;
	}
	Area1(float l,float b)
	{
		length=l;
		breadth=b;
	}
	void area()
	{
		System.out.println("Calculate the area of Geometric shape: ");
	}
}
class Rectangle extends Area1
{	
	float l,b,a;
	Rectangle()
	{

	}
	Rectangle(float l,float b)
	{
		super(l,b);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		l=sc.nextInt();
		System.out.println("Enter breadth :");
		b=sc.nextInt();
	}	
	void area()
	{
		a=l*b;
		System.out.println("Area of rectangle is"+a);
	}
}	

class Squre extends Area1
{
	float l,a;
	Squre()
	{

	}
	Squre(float l)
	{
		super(l,l);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		 l=sc.nextInt();
	}
	void area()
	{
		a=l*l;
		System.out.println("Area of squre is"+a);
	}	
}

class Triangle extends Area1
{	
	float l,b,a;
	Triangle()
	{

	}
	Triangle(float l,float b)
	{
		super(l,b);
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		l=sc.nextInt();
		System.out.println("Enter breadth :");
		b=sc.nextInt();	
	}
	void area()
	{
		a=l*b/2;
		System.out.println("Area of triangle is"+a);
	}
}
   class TotalArea
	{
		public static void main(String args[])
		{	
			Area1 a=new Area1();
			a.area();
			Rectangle r=new Rectangle();
			r.accept();
			r.area();
			Squre s=new Squre();
			s.accept();
			s.area();
			Triangle t=new Triangle();
			t.accept();
			t.area();
		}
	}

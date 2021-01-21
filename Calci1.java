package calculator;
interface addition
{
	void add();
}
interface substraction
{
	void sub();
}
interface division
{
	void div();
}
interface multiplication
{
	void mul();
}
public class Calci1 implements addition,substraction,division,multiplication
{
	public void add()
	{
		int b=8,c=4,a;
		a=b+c;
		System.out.println("Addition:"+a);	
	}
	public void sub()
	{
		int b=8,c=4,a;
		a=b-c;
		System.out.println("Substraction :"+a);
	}
	public void div()
	{
		int b=8,c=4,a;
		a=b/c;
		System.out.println("Division :"+a);
	}
	public void mul()	
	{
		int b=8,c=4,a;
		a=b*c;
		System.out.println("Multiplication :"+a);
	}
	
	public static void main(String args[])
	{
		Calci1 a=new Calci1();
		a.add();
		Calci1 s=new Calci1();
		s.sub(); 
		Calci1 d=new Calci1();
		d.div(); 
		Calci1 m=new Calci1();
		m.mul();  
		
	}
}	

class College
{
	void start()
	{
		System.out.println("  College Starts from 20.1.2021");
	}
}
class Boys extends College
{
	void come()
	{
		System.out.println("  but some Boys Come from 1.2.2021");
	}
}
class Girls extends College
{
	void early()
	{
		System.out.println("  but some Girls come early from 22.1.2021");
	}
}
class Testinheritence 
{
	public static void main(String args[])
	{
		System.out.println("Amrutvahini college");
		College c=new College();
		c.start();
		System.out.println("  Few boys are come");
		Boys b=new Boys();
		b.come();
		System.out.println("  Few Girls are come");
		Girls g=new Girls();
		g.early();
		
	}
}
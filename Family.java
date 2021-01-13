class Family
{
	void FamilyA()
	{
		System.out.println("Family contain four member");
	}
}
class Parents extends Family
{
	void ParentsP()
	{
		System.out.println("Father and Mother");
	}
}
class Child extends Parents
{
	void ChildC()
	{
		System.out.println("Son and Daughter");
	}
}
class Test
{
	public static void main(String args[])
	{
	Child c=new Child();
	c.FamilyA();
	c.ParentsP();
	c.ChildC();
	}
}

	

class Multiplication
{
	static int mul(int a,int b)
	{
		return a*b;
	}
                  static int mul(int a,int b,int c)
	{
		return a*b*c;
	}
}
	class Result
	{
		public static void main(String args[])
		{
			System.out.println(Multiplication.mul(4,5));
			System.out.println(Multiplication.mul(4,5,6));
		}
	}
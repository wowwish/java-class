class errorhandle
{
	public static void main(String args[])
	{
		int a = 20, b = 5, c = 5;
		try
		{
			int x = a/(b-c);
			System.out.println(x);
		}
		catch (ArithmeticException e)
		{
			System.out.println("(b - c) is zero.");
			System.out.println("Exception : " + e);
		}
		int y = a/(b + c);
		System.out.println(y);
	}
}


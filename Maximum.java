class Maximum
{
	public static void main (String args[])
	{
		int a = 10;
		int b = 20;
		Maximum m = new Maximum();
		System.out.println("The Maximum is : " + m.max(a,b));
	}
	int max(int x, int y)
	{
		if (x > y)
			return x;
		else
			return y;
	}
}

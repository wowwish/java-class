class glucose
{
	public static void main(String args[])
	{
		int glucose_level = 100;
		glucose g = new glucose();
		g.check(glucose_level);
	}
	void check(int a)
	{
		if (a <= 100 && a >= 60)
			System.out.println("Normal Glucose Level.");
		else if (a < 60)
			System.out.println("Hypoglycemic.");
		else if (a > 100)
			System.out.print("Hyperglycemic");
	}
}


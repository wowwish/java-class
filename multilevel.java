class multilevel
{
	public static void main(String args[])
	{
		C1 c = new C1();
		System.out.println("Name : " + c.p_name);
		System.out.println("Molecular Weight : " + String.valueOf(c.mw));
	}
}


class A1
{
	String p_name;
}

class B1 extends A1
{
	float mw;
}

class C1 extends B1
{
	C1()
	{
		p_name = "Keratin";
		mw = 122.9f;
	}
} 

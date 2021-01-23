import java.io.*;
import java.util.*;

class hierarchical
{
	public static void main(String args[])
	{	
		B b = new B();	
		C c = new C();
		System.out.println("Protein B : " + "\n" + "Name : " + b.p_name + "\n" + "Molecular Weight : " + String.valueOf(b.mw));
		System.out.println();
		System.out.println("Protein C : " + "\n" + "Name : " + c.p_name + "\n" + "Molecular Weight : " + String.valueOf(c.mw));
	}
}

class A
{
	String p_name;
	float mw;
}

class B extends A
{
	B()
	{
		p_name = "Keratin";
		mw = 122.9f;
	}
}

class C extends A
{
	C()
	{
		p_name = "Synuclein";
		mw = 43.2f;
	}
}

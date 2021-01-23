import java.io.*;
import java.util.*;

class constructors
{
	public static void main(String args[]) throws Exception
	{
		Child c = new Child("Keratin");
		System.out.println("Name : " + c.p_name);
		System.out.println("Molecular Weight : " + String.valueOf(c.mw));
	}
}

class Parent
{
	String p_name;
	Parent(String p)
	{
		p_name = p;
		System.out.println("Parent class constructor invoked.");
	}
}

class Child extends Parent
{
	float mw;
	Child(String name)
	{
		super(name);
		mw = 122.9f;
		System.out.println("Child class constructor invoked.");
	}
}

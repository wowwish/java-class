class function_overriding
{
	public static void main(String args[])
	{
		DNA3 d = new DNA3();
		RNA3 r = new RNA3();
		d.display();
		r.display();
	}
}

class DNA3
{
	String seq;
	
	DNA3()
	{
		seq = "ATGTCGATCGTACGTCGATCGACTGACT";
	}

	void display()
	{

		System.out.println("DNA : " + seq);
	}
	
	
}

class RNA3 extends DNA3
{

	void display()
	{
		System.out.println("RNA : " + (seq.toUpperCase()).replace('T', 'U'));
	}
	
	
}

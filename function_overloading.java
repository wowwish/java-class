class function_overloading
{
	public static void main(String args[])
	{
		function1 f = new function1();
		System.out.println(f.dna("ATGACTGACTGATCGTAGCTAGCT"));
		System.out.println(f.dna("ATGACTGACTGATCGTAGCTAGCT", 12));
		System.out.println(f.dna("ATGACTGACTGATCGTAGCTAGCT", "ATAGCTGATGCTTTAGCTGACTAGCT"));
	}
}

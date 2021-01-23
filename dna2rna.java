// Program to convert DNA sequence to RNA sequence and print in command-line

class dna2rna
{
	public static void main (String args[])
	{
		int len = args[0].length();
		char [] seq = args[0].toCharArray();
		for (int i = 0; i < len; i++)
		{
			if (seq[i] == 'T')
				seq[i] = 'U';
		}
		System.out.println("RNA : " + String.valueOf(seq));
	}
}

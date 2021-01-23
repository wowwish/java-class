public class function1
{	
	public int dna(String seq)
	{
		int len = seq.length();
		return len;
	}

	public int dna(String seq1, String seq2)
	{	int matches = 0;
		int len = (seq1.length() > seq2.length()) ? seq2.length()  : seq1.length();
		for (int i = 0; i < len; i++)
		{
			if (seq1.toCharArray()[i] == seq2.toCharArray()[i])
				matches++;
		}
		return matches;
	}

	public String dna(String seq, int n)
	{
		char [] result = new char[n];
		if (n < seq.length())
		{
			for (int i = 0; i < n; i++)
			{
				result[i] = seq.toCharArray()[i];
			}
		}
		else
			System.out.println("Position Out of Range !");
		return String.valueOf(result);
	}
}



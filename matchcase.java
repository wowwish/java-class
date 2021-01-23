// Program to find the matches and position of matches in the given two seqeunces

class matchcase
{
	public static void main (String args[])
	{
		String seq1 = args[0];
		String seq2 = args[1];
		int matches = 0;
		int len = (seq1.length() > seq2.length())? seq2.length() : seq1.length();
		int [] pos = new int[len];
		int pos_i = 0;
		char [] matched_n = new char[len];
		for (int i = 0; i < len; i++)
		{
			if (seq1.toCharArray()[i] == seq2.toCharArray()[i])
			{
				matches++;
				matched_n[pos_i] = seq1.toCharArray()[i];
				pos[pos_i] = i + 1;
				pos_i++;
			}
		}
		System.out.println("Number of Matches : " + Integer.toString(matches));
		System.out.print("Positions : ");
		for (int i = 0; i < pos_i; i++)
			System.out.print(pos[i] + " ");
		System.out.print("\n");
		System.out.println("Matches : " + String.valueOf(matched_n));
		System.out.println();
	}
}

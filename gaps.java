// Program to count the gaps in the given seqeunce
import java.io.*;
class gaps
{
	public static void main (String args[]) throws Exception
	{
		int gaps = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Sequence : ");
		String seq = br.readLine();
		int len = seq.length();
/*		char [] seq = args[0].toCharArray();  */
		for (int i = 0; i < len; i++)
		{
			if (seq.toCharArray()[i] == '-')
				gaps++;
		}
		System.out.println("Gaps : " + Integer.toString(gaps));
	}
}

import java.util.Scanner;

class aadict
{
	public static void main (String args[]) throws Exception
	{
		System.out.println("Enter the amino acid code : ");	
		char one_letter_code = (char)System.in.read();
		boolean validation;
		aadict a = new aadict();
		validation = a.validate(one_letter_code);
		if(validation)
			a.code(one_letter_code);
		else
			System.out.println("Invalid amino acid single-letter code.");
	}
	void code(char x)
	{
		switch(x)
		{
			case 'A':
				System.out.println("Alanine.");
				break;
			case 'C':
				System.out.println("Cysteine.");
				break;
			case 'D':
				System.out.println("Aspartate.");
				break;
			case 'E':
				System.out.println("Glutamate.");
				break;
			case 'F':
				System.out.println("Phenylalanine.");
				break;
			case 'G':
				System.out.println("Glycine.");
				break;
			case 'H':
				System.out.println("Histidine.");
				break;
			case 'I':
				System.out.println("Isoleucine.");
				break;
			case 'K':
				System.out.println("Lysine.");
				break;
			case 'L':
				System.out.println("Leucine.");
				break;
			case 'M':
				System.out.println("Methionine.");
				break;
			case 'N':
				System.out.println("Asparagine.");
				break;
			case 'P':
				System.out.println("Proline.");
				break;
			case 'R':
				System.out.println("Arginine.");
				break;
			case 'S':
				System.out.println("Serine.");
				break;
			case 'T':
				System.out.println("Threonine.");
				break;
			case 'V':
				System.out.println("Valine.");
				break;
			case 'W':
				System.out.println("Tryptophan.");
				break;
			case 'Y':
				System.out.println("Tyrosine.");
				break;
			case 'Q':
				System.out.println("Glutamine.");
				break;
			default:
				break;
		}
	}
	
	boolean validate(char x)
	{
		if (x == 'B' || x == 'J' || x == 'O' || x == 'U' || x == 'X' || x == 'Z')
			return false;
		else
			return true;
	}
}


import org.biojava.bio.seq.*;
import org.biojava.bio.symbol.*;
import java.util.*;

class Bio
{
    public static void main(String args[])
    {
        int gc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sequence : ");
        String seq = sc.nextLine();
        try
        {
            SymbolList s = DNATools.createDNA(seq);
            for(int pos = 1; pos <= s.length(); ++pos)
            {
                Symbol base = s.symbolAt(pos);
                if (base == DNATools.g() || base == DNATools.c())
                    ++gc;
            }
            System.out.println("GC Percentage : " + ((gc * 100)/s.length()) + "%");
            SymbolList rev = DNATools.reverseComplement(s);
            System.out.println("Forward sequence : " + s.seqString());
            System.out.println("Reverse Complement : " + rev.seqString());
            System.out.println("First Base : " + s.symbolAt(1).getName());
            System.out.println("First Reverse complement Base : " + rev.symbolAt(rev.length()).getName());
            s = DNATools.toRNA(s);
            System.out.println("Your RNA sequence is : " + s.seqString());
            s = RNATools.translate(s);
            System.out.println("Your Protein sequence is : " + s.seqString());
        }
        catch (IllegalSymbolException e) {System.out.println(e);}
        catch (IllegalAlphabetException a) {System.out.println(a);}
    }
}
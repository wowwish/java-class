// Program to read a Protein fasta sequence file and print the sequence name, length as well as Aromatic amino acid content

import org.biojava.bio.seq.*;
import org.biojavax.bio.seq.RichSequence;
import org.biojavax.bio.seq.RichSequenceIterator;
import org.biojavax.*;
import org.biojava.bio.seq.io.*;
import org.biojava.bio.symbol.*;
import java.io.*;

public class Fasta
{
    public static void main(String args[]) throws Exception
    {
       /* if (args.length != 1)
            throw new Exception("Usage : java Fasta.java <filename.fasta>");
        String filename = args[0]; */
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Vavish Ram/Documents/NetBeansProjects/JavaApplication1/JavaApplication1/JavaApplication1/src/protease_sequence.fasta"));
        // SimpleNamespace ns = new SimpleNamespace("biojava");
        SequenceIterator stream = SeqIOTools.readFastaProtein(br);
        System.out.println("SequenceName" + "\t" + "SequenceLength" + "\t" + "AromaticAminoAcidContent");
        while(stream.hasNext())
        {
            Sequence seq = stream.nextSequence();
            int aromatic = 0;
            for (int pos = 1; pos <= seq.length(); ++pos)
            {
                Symbol s = seq.symbolAt(pos);
                if(s == ProteinTools.tyr() || s == ProteinTools.trp() || s == ProteinTools.phe())
                    ++aromatic;
            }
            System.out.println(seq.getName() + "\t" + seq.length() + "\t" + ((aromatic * 100) / seq.length()));
        }
        
        
    }
}
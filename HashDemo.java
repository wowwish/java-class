import java.io.*;
import java.util.*;

class HashDemo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Hashtable<String,String> h1 = new Hashtable<String,String> ();
		h1.put("UUU", "Phanyl-alanine");
		h1.put("UUC", "Phenyl-alanine");
		h1.put("UUA", "Leucine");
		h1.put("UUG", "Leucine");
		h1.put("CUU", "Leucine");
		h1.put("CUC", "Leucine");
		h1.put("CUA", "Leucine");
		h1.put("CUG", "Leucine");
		h1.put("AUU", "Isoleucine");
		h1.put("AUC", "Isoleucine");
		h1.put("AUA", "Isoleucine");
		h1.put("AUG", "Methoinine (Start Codon)");
		h1.put("GUU", "Valine");
		h1.put("GUC", "Valine");
		h1.put("GUA", "Valine");
		h1.put("GUG", "Valine");
		h1.put("UCU", "Serine");
		h1.put("UCC", "Serine");
		h1.put("UCA", "Serine");
		h1.put("UCG", "Serine");
		h1.put("CCU", "Proline");
		h1.put("CCC", "Proline");
		h1.put("CCA", "Proline");
		h1.put("CCG", "Proline");
		h1.put("ACU", "Threonine");
		h1.put("ACC", "Threonine");
		h1.put("ACA", "Threonine");
		h1.put("ACG", "Threonine");
		h1.put("GCU", "Alanine");
		h1.put("GCC", "Alanine");
		h1.put("GCA", "Alanine");
		h1.put("GCG", "Alanine");
		h1.put("UAU", "Tyrosine");
		h1.put("UAC", "Tyrosine");
		h1.put("UAA", "Stop Codon");
		h1.put("UAG", "Stop Codon");
		h1.put("CAU", "Histidine");
		h1.put("CAC", "Histidine");
		h1.put("CAA", "Glutamine");
		h1.put("CAG", "Glutamine");
		h1.put("AAU", "Asparagine");
		h1.put("AAC", "Asparagine");
		h1.put("AAA", "Lysine");
		h1.put("AAG", "Lysine");
		h1.put("GAU", "Aspartic Acid");
		h1.put("GAC", "Aspartic Acid");
		h1.put("GAA", "Glutamic Acid");
		h1.put("GAG", "Glutamic Acid");
		h1.put("UGU", "Cysteine");
		h1.put("UGC", "Cysteine");
		h1.put("UGA", "Stop Codon");
		h1.put("UGG", "Tryptophan");
		h1.put("CGU", "Arginine");
		h1.put("CGC", "Arginine");
		h1.put("CGA", "Arginine");
		h1.put("CGG", "Arginine");
		h1.put("AGU", "Serine");
		h1.put("AGC", "Serine");
		h1.put("AGA", "Arginine");
		h1.put("AGG", "Arginine");
		h1.put("GGU", "Glycine");
		h1.put("GGC", "Glycine");
		h1.put("GGA", "Glycine");
		h1.put("GGG", "Glycine");
		System.out.println("Enter the Codon : ");
		String codon = s.nextLine().toUpperCase();
		if (h1.containsKey(codon))
			System.out.println(h1.get(codon));
		else
			System.out.println("Invalid Codon.");
	}
}

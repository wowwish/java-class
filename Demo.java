// Program to print formatted output
class Demo
{
	public static void main(String args[])
	{
		System.out.format("%20s%10s%20s", "Organism", "Genes", "Genome_Size(bp)");
                System.out.println();
		System.out.format("%20s%10s%20s","Homo Sapiens", "22,000", "2.9 Billion");
                System.out.println();
		System.out.format("%20s%10s%20s","Canis familiaris", "19,000", "2.4 Billion");
                System.out.println();
		System.out.format("%20s%10s%20s", "Mus musculus", "30,000", "2.5 Billion");
                System.out.println();
	}
}

class Abstract
{
   public static void main(String args[])
   {
       DNA2 d = new DNA2("DNA", "ATGAGTCGATCGCTAGC", 17);
       d.display();
       System.out.println();
       System.out.println();
       Protein2 p = new Protein2("Protein", "MGLKHTSCRENQ", 12);
       p.display();
   }
}


abstract class Abs
{
    String type;
    String seq;
    int length;
    
    abstract void display();
}

class DNA2 extends Abs
{
    DNA2(String t, String s, int l)
    {
        type = t;
        seq = s;
        length = l;
    }
    
    void display()
    {
        System.out.println("Molecule Type : " + type);
        System.out.println("Sequence : " + seq);
        
    } 
}


class Protein2 extends Abs
{
    Protein2(String x, String y, int z)
    {
        type = x;
        seq = y;
        length = z;
    }
    
    void display()
    {
        System.out.println("Molecule : " + type);
        System.out.println("Length : " + length);
    }
}

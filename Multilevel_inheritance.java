class Multilevel_inheritance
{
    public static void main(String args[])
    {
        Protein1 p = new Protein1();
    }
}

class DNA1
{
    DNA1()
    {
        System.out.println("I am the Heriditory Molecule.");
    }
}

class RNA1 extends DNA1
{
    RNA1()
    {
        System.out.println("I am transcrobed from DNA.");
    }
}

class Protein1 extends RNA1
{
    Protein1()
    {
        System.out.println("I am translated from RNA.");
    }
}
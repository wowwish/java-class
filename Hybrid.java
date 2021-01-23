class Hybrid
{
    public static void main(String args[])
    {
        cats c = new cats();
        c.display();
        c.show();
        c.print();
        c.say();
    }
}

interface felid
{
    public void display();
}

interface domestic_cat extends felid
{
    public void show();
}
interface panthera extends felid
{
    public void print();
}

interface tiger extends domestic_cat,panthera
{
    public void say();
}

class cats implements tiger
{
    @Override
    public void display()
    {
        System.out.println("Felid : I am the ancestor of all cats.");
    }
    
    @Override
    public void show()
    {
        System.out.println("Domestic Cat : I evloved from Felid.");
    }
    
    @Override
    public void print()
    {
        System.out.println("Panthera : I also evolved from Felid.");
    }
    
    @Override
    public void say()
    {
        System.out.println("I inherited from Panthera and Domestic Cat.");
    }
}

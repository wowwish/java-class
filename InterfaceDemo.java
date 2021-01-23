class Prot implements property,function
{
        public void details()
        {
            System.out.println("Sulphur containing");
        }
       
        public void enzymes()
        {
            System.out.println("Isomerase");
        }
        
        void structure()
        {
            System.out.println("Secondary structure");
        }
}

interface property
{
    public void details();
}

interface function
{
    public void enzymes();
}


class InterfaceDemo
{
    public static void main(String args[])
    {
        Prot p = new Prot();
        p.structure();
        p.details();
        p.enzymes();
    }
}
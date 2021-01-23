class Hierarchical_Inheritance
{
    public static void main(String args[])
    {
        Hibiscus h = new Hibiscus("Rosa sinensis", 50, 5, "Red, White, Pink, Yellow", "Edible flower with medicinal Properties");
        System.out.println();
        System.out.println();
        Lotus l = new Lotus("Nelumbo nucifera", 1, 20, "White with Pink tips, Full-Pink, Full-White, Yellow, Blue", "India");
    }
}

class Flower
{
    String name;
    int stamens;
    int petals;
    String petal_colours;
    
    Flower(String n, int st, int pet, String petc)
    {
        name = n;
        stamens = st;
        petals = pet;
        petal_colours = petc; 
    }
    
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("No. of stamens : " + String.valueOf(stamens));
        System.out.println("No. of petals : " + String.valueOf(petals));
        System.out.println("Petal Clour : " + petal_colours);
    }
}

class Hibiscus extends Flower
{
    String use;
    
    Hibiscus(String a, int b, int c, String d, String e)
    {
        super(a, b, c, d);
        super.display();
        use = e;
        System.out.println("Use : " + use);
        
    }
}


class Lotus extends Flower
{
    String country;
    
    Lotus(String t, int u , int v, String w, String x)
    {
        super(t, u, v, w);
        super.display();
        country = x;
        System.out.println("Country : " + country);
    }
}
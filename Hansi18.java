public class Hansi18
{
    public static void main(String[] args)
    {
        //using overloading

        System.out.println(add(1,2));

        System.out.println(add(1,2,3));

        System.out.println(add(1,2,3, 4));

        System.out.println();

        System.out.println(makePizza("Flat bread"));

        System.out.println(makePizza("Flat Bread", "Mozzarella"));

        System.out.println(makePizza("Flat bead", "Mozzaralla", "Pepperoni"));

    }

    static double add (double a, double b)
    {
        return a + b ;
    }

    static double add (double a, double b, double c)
    {
        return a + b + c;
    }

    static double add (double a, double b, double c, double d)
    {
        return a + b + c + d;
    }


    static String makePizza (String bread)
    {
        return bread + " Pizza" ;
    }

    static String makePizza (String bread, String cheese)
    {
        return bread + " " + cheese + " Pizza" ;
    }

    static String makePizza (String bread, String cheese, String topping)
    {
        return bread + " " + cheese + " " + topping + " Pizza";
    }
}

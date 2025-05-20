public class Hansi19
{
    static int x = 3;  //CLASS
    public static void main(String[] args)
    {
        int x = 1; // LOCAL
        //int x = 2; // Variable 'x' is already defined in the scope

        System.out.println(x); //Non-static field 'x' cannot be referenced from a static context
                               // without static in CLASS variable

        doSomething();
    }

    static void doSomething()
    {
        int x = 2; // LOCAL

        System.out.println(x);
    }
}

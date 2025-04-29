import java.util.Scanner;

public class MathMine
{
    public static void main(String[] args)
    {
        /*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,8);
        System.out.println(result);

        result = Math.abs(-100);
        System.out.println(result);

        result = Math.round(5.98);
        System.out.println(result);

        result = Math.round(5.31);
        System.out.println(result);

        result = Math.ceil(7.89);
        System.out.println(result);

        result = Math.floor(7.89);
        System.out.println(result);

        result = Math.sqrt(100);
        System.out.println(result);

        result = Math.max(20,90);
        System.out.println(result);

        result = Math.min(20,90);
        System.out.println(result);
        */

        Scanner scanner = new Scanner(System.in);

        /*
        //HYPOTENUSE c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Enter the length of the side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of the side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The length of HYPOTENUSE (C): " + c + "cm.");

        */

        //circumference = 2 * Math.PI * radius
        //area = Math.PI * Math.pow(radius, 2)
        //volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the size of radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumference: " + circumference + "cm");
        System.out.println("Area: " + area + "cm²");
        System.out.println("Volume: " + volume + "cm" + "\u00B3");

        System.out.printf("Circumference: %.2fcm\n", circumference);
        System.out.printf("Area: %.2fcm²\n", area);
        System.out.printf("Volume: %.2fcm³\n", volume );

        scanner.close();
    }
}
